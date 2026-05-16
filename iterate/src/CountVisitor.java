class CountVisitor implements FruitVisitor {
    @Override
    public void visitApple(Apple apple) {
        System.out.println("【统计】苹果已上架");
    }

    @Override
    public void visitBanana(Banana banana) {
        System.out.println("【统计】香蕉已上架");
    }
}