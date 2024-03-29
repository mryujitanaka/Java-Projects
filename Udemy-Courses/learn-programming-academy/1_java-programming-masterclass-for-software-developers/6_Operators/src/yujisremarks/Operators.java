package yujisremarks;
public class Operators {
    public static void main(String[] args) {
        // https://docs.oracle.com/javase/tutorial/java/nutsandbolts/opsummary.html
        int result = 1 + 2; // 1 + 2 = 3
        System.out.println("1 + 2 = " + result);

        int previousResult = result;
        System.out.println("Previous Result = " + previousResult); // 3

        result = result - 1; // 3 - 1 = 2
        System.out.println("3 - 1 = " + result);

        previousResult = result;
        System.out.println("Previous Result = " + previousResult); // 2

        result = result * 10; // 2 * 10 = 20
        System.out.println("2 * 10 = " + result);

        previousResult = result;
        System.out.println("Previous Result = " + previousResult); // 20

        result = result / 5; // 20 / 5 = 4
        System.out.println("20 / 5 = " + result);

        previousResult = result;
        System.out.println("Previous Result = " + previousResult); // 4

        result = result % 3; // the remainder of (4 % 3) = 1
        System.out.println("4 % 3 = " + result);

        System.out.println();

        previousResult = result;
        System.out.println("Previous Result = " + previousResult);

        // Abbreviating Operators:
        // result = result + 1;
        result++; // 1 + 1 = 2
        System.out.println("1 + 1 = " + result);

        previousResult = result;
        System.out.println("Previous Result = " + previousResult);

        result--; // 2 - 1 = 1
        System.out.println("2 - 1 = " + result);

        previousResult = result;
        System.out.println("Previous Result = " + previousResult);

        // result = result + 2;
        result += 2; // 1 + 2 = 3
        System.out.println("1 + 2 = " + result);

        previousResult = result;
        System.out.println("Previous Result = " + previousResult);

        // result = result * 10
        result *= 10; // 3 * 10 = 30
        System.out.println("3 * 10 = " + result);

        previousResult = result;
        System.out.println("Previous Result = " + previousResult);

        // result = result / 3
        result /= 3; // 30 / 3 = 10
        System.out.println("30 / 3 = " + result);

        previousResult = result;
        System.out.println("Previous Result = " + previousResult);

        // result = result - 2
        result -= 2; // 10 - 2 = 8
        System.out.println("10 - 2 = " + result);
    }
}