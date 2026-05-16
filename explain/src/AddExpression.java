class AddExpression extends Expression {
    private Expression left;
    private Expression right;
    public AddExpression(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public double interpret(Context context) {
        return left.interpret(context) + right.interpret(context);
    }
}