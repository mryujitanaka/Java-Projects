package yujisremarks;
public class Methods {
    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;
        /*
        if (gameOver) {
            int newFinalScore = score + (levelCompleted * bonus);
            newFinalScore += 1000;
            System.out.println("Your final score was " + newFinalScore);
        }
        */
        calculateScore(gameOver, score, levelCompleted, bonus);

        score = 10000;
        levelCompleted = 8;
        bonus = 200;
        /*
        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("2. Your final score was " + finalScore);
        }
        */
        calculateScore(gameOver, score, levelCompleted, bonus);
    }
    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
        /*
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;
        */
        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
            System.out.println("Your final score was " + finalScore);
            return finalScore;
        }
        return -1;
    }
}