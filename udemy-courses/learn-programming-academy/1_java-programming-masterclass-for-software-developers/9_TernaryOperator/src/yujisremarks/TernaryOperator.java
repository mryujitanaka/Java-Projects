package yujisremarks;
public class TernaryOperator {
    public static void main(String[] args) {
        // https://docs.oracle.com/javase/tutorial/java/nutsandbolts/opsummary.html
        // Ternary Operator
        // The ternary operator is a shortcut to assigning one of two values to a variable depending on a given
        // condition.
        // It's a shortcut of the if-then-else statement.
        boolean isCar = false;
        if (isCar) {
            System.out.println("This is false.");
        }
        // The 1st operand (isCar) is the condition that evaluate all conditions to true or false
        // The 2nd operand (true) is the value to assign to "wasCar" if the 1st condition is true
        // The 3rd operand (false) is what to assign to "wasCar" if the  1st operand condition is false
        isCar = true; // This is true
        boolean wasCar = isCar ? true : false;
        if (wasCar) {
            System.out.println("wasCar is true.");
        }

        System.out.println();

        // Another example using the ternary operator
        int ageOfClient = 20;
        boolean isEighteenOrOver = (ageOfClient == 20) ? true : false;
        System.out.println("The client is over 18 years old.");
    }
}