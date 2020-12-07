package yujisremarks;
public class MethodsChallenge {
    public static void main(String[] args) {
        // Note that the "playerPosition" variable (in line 15, for example) has the same name as the "playerPosition"
        // parameter of the "displayHighScorePosition" method (in line 37).
        //
        // The use of the variable and parameter name are the same ("playerPosition") because the value returned by the
        // call of the "calculateHighScorePosition" method (in line 15, for example) will be reused in the
        // second call of the "displayHighScorePosition" method (in line 16, for example) as the value of the
        // "playerPosition" argument.
        //
        // Example:
        // "int playerPosition = calculateHighScorePosition(1500);" is "1".
        // "displayHighScorePosition("Fulano", playerPosition);" is "Fulano" and "1".
        int playerPosition = calculateHighScorePosition(1500);
        displayHighScorePosition("Fulano", playerPosition);

        playerPosition = calculateHighScorePosition(900);
        displayHighScorePosition("Beltrano", playerPosition);

        playerPosition = calculateHighScorePosition(400);
        displayHighScorePosition("Sicrano", playerPosition);

        playerPosition = calculateHighScorePosition(50);
        displayHighScorePosition("Fulaninho", playerPosition);

        playerPosition = calculateHighScorePosition(1000);
        displayHighScorePosition("Beltraninho", playerPosition);

        playerPosition = calculateHighScorePosition(500);
        displayHighScorePosition("Sicraninho", playerPosition);

        playerPosition = calculateHighScorePosition(100);
        displayHighScorePosition("Fulano Jr.", playerPosition);
    }
    // 1st Method: "displayHighScorePosition"
    public static void displayHighScorePosition(String playerName, int playerPosition) {
        System.out.println(playerName + " managed to get into position " + playerPosition + " on the high score table.");
    }
    // 2nd Method: "calculateHighScorePosition"
    public static int calculateHighScorePosition(int playerScore) {
        if (playerScore >= 1000) {
            return 1;
        } else if (playerScore >= 500 && playerScore < 1000) {
            return 2;
        } else if (playerScore >= 100 && playerScore < 500) {
            return 3;
        } else {
            return 4;
        }
    }
}