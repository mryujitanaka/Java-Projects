package yujisremarks;
public class Methods {
    public static void main(String[] args) {
        // We can continue to use statements with the Methods. There is nothing wrong with that. This actually makes
        // the code easier to read.
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
    public static void calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
        if (gameOver) {
            int newFinalScore = score + (levelCompleted * bonus);
            newFinalScore += 2000;
            System.out.println("Your final score was " + newFinalScore);
        }
    }
}