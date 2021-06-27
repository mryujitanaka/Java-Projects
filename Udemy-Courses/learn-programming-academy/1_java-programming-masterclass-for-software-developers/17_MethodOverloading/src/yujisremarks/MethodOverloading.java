package yujisremarks;
public class MethodOverloading {
    public static void main(String[] args) {
        // Method Overloading
        // Method Overloading is when we have multiple methods with the same name with different number of parameters,
        // different types of parameters, or both.
        int newScore = calculateScore("Legolas", 500);
        System.out.println("New score is " + newScore + ".");

        int brandNewScore = calculateScore(75);
        System.out.println("Brand new score is " + brandNewScore + ".");

        // We cannot enter other values with data types other than the parameters we declare in our methods. In other
        // words, a standard of quantity of values and data types must be followed.
        // Wrong example:
        /*
        calculateScore(100,100,100);
        */

        calculateScore();
    }

    public static int calculateScore(String playerName, int score) {
        System.out.println("Player " + playerName + " score " + score + " points.");
        return score * 1000;
    }

    public static int calculateScore(int score) {
        System.out.println("Unnamed player scored " + score + " points.");
        return score * 1000;
    }

    public static int calculateScore() {
        System.out.println("No player name, no player score.");
        return 0;
    }

    // When we overloading a Method we need to create a unique method signature, which is the method name (Ex:
    // calculateScore).
    //
    // But if we want to change the data type to void, we will notice that there is an error. What this error tells
    // us is that in order to not return anything (void), we need to change the number of parameters declared
    // previously to make this method unique.
    /*
    public static void calculateScore() {
        System.out.println("No player name, no player score.");
    }
    */
}