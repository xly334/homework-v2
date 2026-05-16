from flask import Flask, request, jsonify, render_template_string
from flask_sqlalchemy import SQLAlchemy

app = Flask(__name__)
app.config['SQLALCHEMY_DATABASE_URI'] = 'sqlite:///school.db'
app.config['SQLALCHEMY_TRACK_MODIFICATIONS'] = False
db = SQLAlchemy(app)

# 学生表
class Student(db.Model):
    id = db.Column(db.Integer, primary_key=True)
    sno = db.Column(db.String(20), unique=True)
    name = db.Column(db.String(50))
    pwd = db.Column(db.String(20))

# 课程表
class Course(db.Model):
    id = db.Column(db.Integer, primary_key=True)
    cname = db.Column(db.String(50))
    teacher = db.Column(db.String(50))
    max_num = db.Column(db.Integer, default=50)
    now_num = db.Column(db.Integer, default=0)

# 选课表
class Selection(db.Model):
    id = db.Column(db.Integer, primary_key=True)
    sno = db.Column(db.String(20))
    cid = db.Column(db.Integer)

# 首页 —— 美化居中版
@app.route('/')
def index():
    return render_template_string('''
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>协助选课系统</title>
    <style>
        * {
            margin: 0;
            padding: 0;
            box-sizing: border-box;
        }
        body {
            font-family: "Microsoft YaHei";
            background: #f5f7fa;
            display: flex;
            justify-content: center;
            align-items: center;
            min-height: 100vh;
        }
        .container {
            background: white;
            padding: 50px;
            border-radius: 16px;
            box-shadow: 0 0 20px rgba(0,0,0,0.1);
            width: 100%;
            max-width: 600px;
            text-align: center;
        }
        h1 {
            color: #2c3e50;
            margin-bottom: 30px;
            font-size: 28px;
        }
        h3 {
            color: #34495e;
            margin: 20px 0;
            font-size: 18px;
        }
        input {
            width: 100%;
            padding: 14px;
            font-size: 16px;
            border: 1px solid #ddd;
            border-radius: 8px;
            margin-bottom: 15px;
            outline: none;
        }
        button {
            background: #2d8cf0;
            color: white;
            border: none;
            padding: 14px 30px;
            border-radius: 8px;
            font-size: 16px;
            cursor: pointer;
        }
        button:hover {
            background: #1b6ac8;
        }
        #result {
            margin-top: 25px;
            font-size: 16px;
            color: #27ae60;
            white-space: pre-line;
            line-height: 1.6;
        }
    </style>
</head>
<body>
    <div class="container">
        <h1>协助选课系统</h1>
        <h3>AI 智能选课助手</h3>
        <input type="text" id="msg" placeholder="你可以问：查课表、选xx课、退xx课、有什么课">
        <button onclick="send()">发送给 AI</button>
        <p id="result"></p>
    </div>

    <script>
        async function send() {
            let msg = document.getElementById('msg').value;
            let res = await fetch('/ai', {
                method: 'POST',
                headers: {'Content-Type': 'application/json'},
                body: JSON.stringify({msg})
            });
            let data = await res.json();
            document.getElementById('result').innerText = data.reply;
        }
    </script>
</body>
</html>
''')

# AI 智能体
@app.route('/ai', methods=['POST'])
def ai():
    data = request.get_json()
    msg = data.get('msg', '')
    sno = '2025001'  # 默认学生：小明

    # 查课表
    if '查课表' in msg:
        sels = Selection.query.filter_by(sno=sno).all()
        courses = [Course.query.get(s.cid).cname for s in sels]
        reply = '📅 你的课表：\n' + '、'.join(courses) if courses else '你还没有选任何课程'

    # 退课
    elif '退' in msg:
        target = None
        all_courses = Course.query.all()
        for c in all_courses:
            if c.cname in msg:
                target = c
                break
        if not target:
            reply = '❌ 找不到该课程'
        else:
            sel = Selection.query.filter_by(sno=sno, cid=target.id).first()
            if not sel:
                reply = '❌ 你没有选这门课'
            else:
                db.session.delete(sel)
                target.now_num -= 1
                db.session.commit()
                reply = f'✅ 退课成功：{target.cname}'

    # 选课
    elif '选' in msg:
        target = None
        all_courses = Course.query.all()
        for c in all_courses:
            if c.cname in msg:
                target = c
                break
        if not target:
            reply = '❌ 找不到该课程'
        else:
            exist = Selection.query.filter_by(sno=sno, cid=target.id).first()
            if exist:
                reply = '❌ 你已经选过这门课了'
            else:
                db.session.add(Selection(sno=sno, cid=target.id))
                target.now_num += 1
                db.session.commit()
                reply = f'✅ 选课成功：{target.cname}'

    # 查看所有课程
    elif '课' in msg:
        cs = Course.query.all()
        clist = [f'{c.cname}｜{c.teacher}｜{c.now_num}/{c.max_num}' for c in cs]
        reply = '📚 当前课程列表：\n' + '\n'.join(clist)

    # 其他
    else:
        reply = '💡 支持指令：\n1. 查课表\n2. 选xx课\n3. 退xx课\n4. 有什么课程'

    return jsonify({'reply': reply})

# 初始化数据
with app.app_context():
    db.create_all()
    if not Course.query.first():
        db.session.add(Course(cname='Python程序设计', teacher='张三', max_num=50))
        db.session.add(Course(cname='高等数学', teacher='李老师', max_num=30))
        db.session.add(Course(cname='大学英语', teacher='王老师', max_num=40))
        db.session.add(Course(cname='计算机基础', teacher='赵老师', max_num=45))
        db.session.add(Course(cname='人工智能导论', teacher='刘老师', max_num=35))
        db.session.add(Course(cname='大数据技术', teacher='陈老师', max_num=30))
        
        # 默认学生：学号2025001 小明 密码123456
        db.session.add(Student(sno='2025001', name='小明', pwd='123456'))
        db.session.commit()

if __name__ == '__main__':
    app.run(debug=True)