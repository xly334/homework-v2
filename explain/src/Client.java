public class Client {
    public static void main(String[] args) {

        Context context = new Context();


        String expr1 = "apple 5";
        Expression exp1 = SimpleParser.parse(expr1);
        double result1 = exp1.interpret(context);
        System.out.println("表达式：" + expr1);
        System.out.println("计算结果：￥" + String.format("%.1f", result1));

        String expr2 = "apple 3 + banana 4";
        Expression exp2 = SimpleParser.parse(expr2);
        double result2 = exp2.interpret(context);
        System.out.println("\n表达式：" + expr2);
        System.out.println("计算结果：￥" + String.format("%.1f", result2));
    }
}
