package yujisremarks;
public class Operators {
    public static void main(String[] args) {
        // https://docs.oracle.com/javase/tutorial/java/nutsandbolts/opsummary.html
        int result = 1 + 2; // 1 + 2 = 3
        System.out.println("1 + 2 = " + result);

        int previousResult = result;
        System.out.println("previousResult = " + previousResult);

        result = result - 1; // 3 - 1 = 2
        System.out.println("3 - 1 = " + result);

        int previousResult2 = result;
        System.out.println("previousResult = " + previousResult2);

        result = result * 10; // 2 * 10 = 20
        System.out.println("2 * 10 = " + result);

        int previousResult3 = result;
        System.out.println("previousResult = " + previousResult3);

        result = result / 5; // 20 / 5 = 4
        System.out.println("20 / 5 = " + result);

        int previousResult4 = result;
        System.out.println("previousResult = " + previousResult4);

        result = result % 3; // the remainder of (4 % 3) = 1
        System.out.println("4 % 3 = " + result);

        int previousResult5 = result;
        System.out.println("previousResult = " + previousResult5);

        // Abbreviating Operators:
        // result = result + 1;
        result++; // 1 + 1 = 2
        System.out.println("1 + 1 = " + result);

        int previousResult6 = result;
        System.out.println("previousResult = " + previousResult6);

        result--; // 2 - 1 = 1
        System.out.println("2 - 1 = " + result);

        int previousResult7 = result;
        System.out.println("previousResult = " + previousResult7);

        // result = result + 2;
        result += 2; // 1 + 2 = 3
        System.out.println("1 + 2 = " + result);

        int previousResult8 = result;
        System.out.println("previousResult = " + previousResult8);

        // result = result * 10
        result *= 10; // 3 * 10 = 30
        System.out.println("3 * 10 = " + result);

        int previousResult9 = result;
        System.out.println("previousResult = " + previousResult9);

        // result = result / 3
        result /= 3; // 30 / 3 = 10
        System.out.println("30 / 3 = " + result);

        int previousResult10 = result;
        System.out.println("previousResult = " + previousResult10);

        // result = result - 2
        result -= 2; // 10 - 2 = 8
        System.out.println("10 - 2 = " + result);
    }
}