package yujisremarks;
public class LogicalOperator {
    public static void main(String[] args) {
        int topScore = 80;
        // != ("is not equal to")
        if (topScore != 100) {
            System.out.println("topScore != 100");
        }
        if (topScore >= 100) {
            System.out.println("topScore >= 100");
        }
        if (topScore <= 100) {
            System.out.println("topScore <= 100");
        }
        int secondTopScore = 95;
        // && (Logical AND Operator)
        // This entire condition "topScore > secondTopScore && topScore < 100" must be TRUE
        if ((topScore > secondTopScore) && (topScore < 100)) {
            System.out.println("topScore > secondTopScore && topScore < 100");
        }
        if ((topScore > 90) || (secondTopScore <= 90)) {
            System.out.println("topScore > 90) || (secondTopScore <= 90");
        }
    }
}