package yujisremarks;
public class IfThenElseControlStatementsCodeBlocks {
    public static void main(String[] args) {
        // if-then-else Statement
        // The "if-then-else" statement provides a secondary path of execution when an "if" clause evaluates to false.
        // The use of "if" is to specify a block of code to be executed, if a specified condition is true.
        // The use of "else" is to specify a block of code to be executed, if the same condition is false.
        // The use of "else if" is to specify a new condition to test, if the first condition is false.
        //
        // Code Blocks
        // A code block is a grouping of two or more statements. This is done by enclosing the statements between
        // opening and closing curly braces.
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;
        // "if-else" without curly braces.
        if (score == 800)
            System.out.println("Your score was 800");
            System.out.println("This was executed");
        // "if-else" without curly braces.
        if (score == 900)
            System.out.println("Your score was 900");
            System.out.println("This was also executed");
        // "if-else" with curly braces - This should be the best way to use the if-else statement.
        // Even if there is only one line of code in the code block, it is recommended to use the curly braces.
        if (score == 800) {
            System.out.println("Your score was 800! CONGRATS!");
            System.out.println("This was executed but in a much better way!");
        }

        System.out.println();

        /*
        if (score < 5000 && score > 1000) {
            System.out.println("score < 5000 && score > 1000");
        } else if (score < 1000) {
            System.out.println("score < 1000");
        } else {
            System.out.println("Got here");
        }
        */

        // We can create variables within a code block.
        // And as we may have noticed, we were able to access variables that were created outside the code block.
        // Example:
        // Variable created in the code block: "finalScore".
        // Variables accessed outside the code block: "score", "levelCompleted", "bonus".
        if (gameOver == true) {
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your final score was " + finalScore);
        }
        // However, we're unable to access a variable created in a code block.
        // This is because once a variable is created inside the code block, and it is executed, it is automatically
        // deleted. Therefore, we are unable to access variables in a code block.
        /*
        int savedFinalScore = finalScore;
        */
        // The concept of variables inside a code block is called Scope.

        System.out.println();

        // Challenge
        // For this situation, we can create variables with new values.
        // The problem for this situation is that the creation of new variables makes the program take up more space
        // in memory.
        boolean newGameOver = true;
        int newScore = 10000;
        int newLevelCompleted = 8;
        int newBonus = 200;
        if (newGameOver) {
            int newFinalScore = newScore + (newLevelCompleted * newBonus);
            System.out.println("2. Your final score was " + newFinalScore);
        }
        // We can also copy and paste some lines of previous code to reuse in our new code.
        // This is good, as we are being more efficient and taking up less memory space.
        // However, if we change the previous values of the declared variables (from lines 13 to 16), or if we change
        // the data types of a variable, the entire code can be damaged.
        // Another disadvantage in duplicating code would be if we add a new line of code. In doing so, we will need to
        // go back to wherever we want to make the same change.
        // We can still forget where to make changes to duplicate codes. As the code becomes more complicated, we can
        // forget things or complicate the work of other developers.
        // So, we must think very carefully about how to use variables in conjunction with if-then-else statements.
        //
        // One solution to using duplicate codes is to use Methods.
        score = 10000;
        levelCompleted = 8;
        bonus = 200;
        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("3. Your final score was " + finalScore);
        }
    }
}