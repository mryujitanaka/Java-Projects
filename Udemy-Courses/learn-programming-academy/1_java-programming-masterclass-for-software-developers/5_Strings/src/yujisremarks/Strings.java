package yujisremarks;
public class Strings {
    public static void main(String[] args) {
        // byte
        // short
        // int
        // long
        // float
        // double
        // char
        // boolean

        // String
        // Strings are used for storing text.
        // The String is a datatype in Java, which is not a primitive type. It's actually a Class, but it enjoys a bit
        // of favoritism in Java to make it easier to use than a regular class.
        // A String is a sequence of characters. A large number of characters. Technically, it's limited by memory or
        // the MAX_VALUE of an Int which was 2.14 Billion. That's a lot of characters!
        String myStringValue = "This is a string :)";
        System.out.println(myStringValue);

        System.out.println("myStringValue = " + myStringValue);

        myStringValue = myStringValue + ", and this is more.";
        System.out.println("myStringValue = " + myStringValue);

        myStringValue = myStringValue + " \u00A9 2021";
        System.out.println("myStringValue = " + myStringValue);

        System.out.println();

        String numberString = "250.55";
        numberString = numberString + "49.95";
        System.out.println(numberString);

        System.out.println();

        String lastString = "10";
        int myInt = 50;
        lastString = lastString + myInt;
        System.out.println("lastString = " + lastString);

        System.out.println();

        double doubleNumber = 120.47d;
        lastString = lastString + doubleNumber;
        System.out.println("lastString = " + lastString);

        // Strings in Java are immutable.
        // We can't change a String after it's created. Instead, what happens is a new String is created.

        // The code we used to append Strings was inefficient.
        // As a result of a String being created, appending values like this is inefficient and not recommended.
        // We'll see a better way of doing it in the future where we discuss something called a StringBuffer which can
        // be changed.
    }
}