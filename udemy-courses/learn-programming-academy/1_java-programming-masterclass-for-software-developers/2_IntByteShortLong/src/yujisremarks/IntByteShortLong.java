package yujisremarks;
public class IntByteShortLong {
    public static void main(String[] args) {
        // Minimum and Maximum Integers that can be stored in memory
        // Size: occupies 32 bits amount of memory, width of 32
        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;
        System.out.println("Integer Minimum Value = " + myMinIntValue);
        System.out.println("Integer Maximum Value = " + myMaxIntValue);
        //Underflow the Minimum Value
        System.out.println("Busted Integer Minimum Value = " + (myMinIntValue - 1));
        //Overflow the Maximum Value
        System.out.println("Busted Integer Maximum Value = " + (myMaxIntValue + 1));
        // Note that there is an error when we exceed the minimum and maximum values.
        // int myMinIntNumber = -2_147_483_649;
        // int myMaxIntNumber = 2_147_483_648;
    }
}
