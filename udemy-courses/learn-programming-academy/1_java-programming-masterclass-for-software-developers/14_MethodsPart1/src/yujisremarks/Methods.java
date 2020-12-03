package yujisremarks;
public class Methods {
    public static void main(String[] args) {
        // Method
        // A Method is a block of code which only runs when it is called.
        // We can pass data, known as parameters, into a method.
        // Methods are used to perform certain actions, and they are also known as functions.
        // We use methods to reuse code: define the code once, and use it many times.

        /*
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;
        if (gameOver) {
            int newFinalScore = score + (levelCompleted * bonus);
            newFinalScore += 1000;
            System.out.println("Your final score was " + newFinalScore);
        }
        */

        // "true", "800", "5" and "100" are Arguments of the Method "calculateScore".
        calculateScore(true, 800, 5, 100);

        /*
        score = 10000;
        levelCompleted = 8;
        bonus = 200;
        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your final score was " + finalScore);
        }
        */

        // "true", "10000", "8" and "200" are Arguments of the Method "calculateScore".
        calculateScore(true, 10000, 8, 200);
    }
    // Parameters and Arguments
    // Information can be passed to methods as parameter. Parameters act as variables inside the method.
    // Parameters are specified after the method name, inside the parentheses. We can add as many parameters as we
    // want, just separate them with a comma.
    //
    // When a parameter is passed to the method, it is called an argument.
    //
    // So, we can say that the variables declared within a Method (inside the parentheses) are now called Parameters.
    // And the values of these variables will be called Arguments.
    public static void calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
        /*
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;
        */
        if (gameOver) {
            int newFinalScore = score + (levelCompleted * bonus);
            newFinalScore += 2000;
            System.out.println("Your final score was " + newFinalScore);
        }
    }
}