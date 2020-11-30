package yujisremarks;
public class Methods {
    public static void main(String[] args) {
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

        calculateScore(true, 800, 5, 100);

        calculateScore(true, 10000, 8, 200);

        /*
        score = 10000;
        levelCompleted = 8;
        bonus = 200;
        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("2. Your final score was " + finalScore);
        }
        */
    }
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