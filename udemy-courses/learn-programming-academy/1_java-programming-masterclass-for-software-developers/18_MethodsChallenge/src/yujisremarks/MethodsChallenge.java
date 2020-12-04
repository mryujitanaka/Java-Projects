package yujisremarks;
public class MethodsChallenge {
    public static void main(String[] args) {
        int playerPosition = calculateHighScorePosition(1500);
        displayHighScorePosition("Fulano", playerPosition);

        playerPosition = calculateHighScorePosition(900);
        displayHighScorePosition("Beltrano", playerPosition);

        playerPosition = calculateHighScorePosition(400);
        displayHighScorePosition("Sicrano", playerPosition);

        playerPosition = calculateHighScorePosition(50);
        displayHighScorePosition("Fulaninho", playerPosition);
    }
    public static void displayHighScorePosition(String playerName, int playerPosition) {
        System.out.println(playerName + " managed to get into position " + playerPosition + " on the high score table.");
    }
    public static int calculateHighScorePosition(int playerScore) {
        if (playerScore >= 1000){
            return 1;
        } else if (playerScore >= 500 && playerScore < 1000) {
            return 2;
        } else if (playerScore >= 100 && playerScore < 500){
            return 3;
        } else {
            return 4;
        }
    }
}