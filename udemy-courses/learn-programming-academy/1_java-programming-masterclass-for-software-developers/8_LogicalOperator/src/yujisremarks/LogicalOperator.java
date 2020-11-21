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

        System.out.println();

        // Assignment Operator VS Equals to Operator:
        /*
          int newValue = 50;
          if (newValue = 50) {
            System.out.println("This is an error");
          }
        */
        int newValue = 50;
        if (newValue == 50) {
            System.out.println("This is true");
        }
        /*
          // "isCar" on the line 42 is not going into errors because Java require that the operand must be type of
          // boolean.
          boolean isCar = false;
          if (isCar = true) {
            System.out.println("This is not supposed to happen");
          }
        */
        boolean isCar = false;
        if (isCar == true) {
            System.out.println("This is correct");
        }

        System.out.println();

        // We can simplify the expressions:
        boolean isCar2 = false;
        // "isCar2" is the same as "isCar2 == true"
        if (isCar2) {
            System.out.println("This is correct 2");
        }
        boolean isCar3 = false;
        // "!isCar3" is the same as "isCar3 != true" or "isCar3 == false"
        if (!isCar3) {
            System.out.println("This is correct 3");
        }
    }
}