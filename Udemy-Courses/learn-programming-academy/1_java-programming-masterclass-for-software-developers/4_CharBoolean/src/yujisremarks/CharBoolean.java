package yujisremarks;
public class CharBoolean {
    public static void main(String[] args) {
        // Minimum and Maximum Char numbers that can be stored in memory
        // Size: occupies 16 bits amount of memory, width of 16
        // Unicode Character Table: https://unicode-table.com/
        char myCharValue = 'D';
        char myUnicodeCharValue = '\u0044';
        System.out.println(myCharValue);
        System.out.println(myUnicodeCharValue);
        char myCopyrightChar = '\u00A9';
        System.out.println(myCopyrightChar);

        System.out.println();

        boolean myTrueBooleanValue = true;
        boolean myFalseBooleanValue = false;
        System.out.println(myTrueBooleanValue);
        System.out.println(myFalseBooleanValue);

        // Practical example:
        // Is the student over 21 years old?
        boolean isStudentOverTwentyOne = true;
    }
}