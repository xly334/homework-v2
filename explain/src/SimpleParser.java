class SimpleParser {
    public static Expression parse(String expression) {
        String[] parts = expression.split(" \\+ ");
        if (parts.length == 1) {
            String[] fruitParts = parts[0].split(" ");
            return new FruitExpression(fruitParts[0], Integer.parseInt(fruitParts[1]));
        } else {
            String[] leftParts = parts[0].split(" ");
            String[] rightParts = parts[1].split(" ");
            Expression left = new FruitExpression(leftParts[0], Integer.parseInt(leftParts[1]));
            Expression right = new FruitExpression(rightParts[0], Integer.parseInt(rightParts[1]));
            return new AddExpression(left, right);
        }
    }
}
