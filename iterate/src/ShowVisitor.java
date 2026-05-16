class ShowVisitor implements FruitVisitor {
    @Override
    public void visitApple(Apple apple) {
        System.out.println("【展示】苹果：" + apple.getName());
    }

    @Override
    public void visitBanana(Banana banana) {
        System.out.println("【展示】香蕉：" + banana.getName());
    }
}