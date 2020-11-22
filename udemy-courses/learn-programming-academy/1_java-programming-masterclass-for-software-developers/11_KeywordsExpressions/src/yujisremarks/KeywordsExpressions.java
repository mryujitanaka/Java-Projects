package yujisremarks;
public class KeywordsExpressions {
    public static void main(String[] args) {
        // List of Java Keywords: https://en.wikipedia.org/wiki/List_of_Java_keywords
        //
        // Expressions
        // An expression is a construct made up of variables, values, operators, and method invocations, which are
        // constructed according to the syntax of the language, that evaluates to a single value.
        // Example:
        // "kilometres = (100d * 1.609344)" is an expression. But not the "double". Actually, data types don't form
        // part of an expression.
        double kilometres = (100d * 1.609344);

        // Another example:
        // "highScore = 50" is an expression.
        // "highScore == 50" is an expression. But not the "if", the "( )" and "{ }".
        // ""highScore = " + highScore" is an expression.
        int highScore = 50;
        if (highScore == 50) {
            System.out.println("highScore = " + highScore);
        }

        // Challenge
        // "score = 100" is an expression.
        // "score > 99" is an expression.
        // ""You got the high score!"" is an expression.
        // "score = 0" is an expression.
        int score = 100;
        if (score > 99) {
            System.out.println("You got the high score!");
            score = 0;
        }
    }
}