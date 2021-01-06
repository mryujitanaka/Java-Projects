package yujisremarks;
public class Methods {
    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        calculateScore(gameOver, score, levelCompleted, bonus);

        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        calculateScore(gameOver, score, levelCompleted, bonus);
    }
    // Return Values in the Method
    // The "void" keyword, used in the examples until now, indicates that the method should not return a value. If we
    // want the method to return a value, we can use a primitive data type (such as "int", "char", etc.) instead of
    // "void", and use the "return" keyword inside the method.
    //
    // Sometimes when we return values in the method, considering this example, when the value of the variable
    // "gameOver" is true, we need to return a false value, which in this case would be "return -1;", even if there is
    // not one. Otherwise, we will have errors.
    //
    // In this example, we are just learning how to "declare" or "employ" the use of Return in the Method. In this
    // situation, we are saying that we want to return the value or result of "finalScore". But in reality, we never
    // return anything.
    //
    // "-1" here is used to indicate an error, invalid value, or value not found.
    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
            System.out.println("Your final score was " + finalScore);
            return finalScore;
        }
        return -1;
    }
}