package yujisremarks;
public class MethodOverloadingRecap {
    // Method Overloading
    // Method Overloading is a feature that allows us to have more than one method with the same name, so long as
    // we use different parameters.
    // It is the ability to create multiple methods of the same name with different implementations.
    // Calls to an overloaded method will run a specific implementation/version of that method.
    // Ex:
    // NOTE that there are 3 different method names to remember.
    // Ending up with the following methods is not good practice and it is not actually method
    // overloading.
    // Never ever write code like below. It is bad practice!
    public static int sumTwoNumbers(int a, int b) {
        return a + b;
    }
    public static int sumThreeNumbers(int a, int b, int c) {
        return a + b + c;
    }
    public static int sumFourNumbers(int a, int b, int c, int d) {
        return a + b + c + d;
    }
    // With method overloading we end up with 3 methods but all sharing the same method name.
    // That's easier to remember!
    public static int sum(int a, int b) {
        return a + b;
    }
    public static int sum(int a, int b, int c) {
        return a + b + c;
    }
    public static int sum(int a, int b, int c, int d) {
        return a + b + c + d;
    }
    // Output
    public static void main(String[] args) {
        System.out.println(sumTwoNumbers(1,2));
        System.out.println(sumThreeNumbers(1,2,3));
        System.out.println(sumFourNumbers(1, 2,3,4));
        //
        System.out.println();
        //
        System.out.println(sum(1,2));
        System.out.println(sum(1,2,3));
        System.out.println(sum(1, 2,3,4));
    }
    // So, to recap:
    // Method Overloading
    // * It improves code readability and re-usability;
    // * It is easier to remember one method name instead of remembering multiple names;
    // * Achieves consistency in naming. One name for methods that are commonly used, for example, is "println";
    // * Overloaded methods give programmers the flexibility to call a similar method with different types of data.
}