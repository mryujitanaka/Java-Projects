package yujisremarks;
public class IntByteShortLong {
    public static void main(String[] args) {
        // Minimum and Maximum Int numbers that can be stored in memory
        // Size: occupies 32 bits amount of memory, width of 32
        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;
        System.out.println("Integer Minimum Value = " + myMinIntValue);
        System.out.println("Integer Maximum Value = " + myMaxIntValue);
        // Underflow the Minimum Value
        System.out.println("Busted Integer Minimum Value = " + (myMinIntValue - 1));
        // Overflow the Maximum Value
        System.out.println("Busted Integer Maximum Value = " + (myMaxIntValue + 1));
        // Note that there is an error when we exceed the minimum and maximum values.
        // int myMinIntNumber = -2_147_483_649;
        // int myMaxIntNumber = 2_147_483_648;

        System.out.println();

        // Minimum and Maximum Byte numbers that can be stored in memory
        // Size: occupies 8 bits amount of memory, width of 8
        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println("Byte Minimum Value = " + myMinByteValue);
        System.out.println("Byte Maximum Value = " + myMaxByteValue);
        // Underflow the Minimum Value
        System.out.println("Busted Byte Minimum Value = " + (byte)(myMinByteValue - 1));
        // Overflow the Maximum Value
        System.out.println("Busted Byte Maximum Value = " + (byte)(myMaxByteValue + 1));
        // Note that there is an error when we exceed the minimum and maximum values.
        // byte myMinByteNumber = -129;
        // byte myMaxByteNumber = 128;

        System.out.println();

        // Minimum and Maximum Short numbers that can be stored in memory
        // Size: occupies 16 bits amount of memory, width of 16
        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;
        System.out.println("Short Minimum Value = " + myMinShortValue);
        System.out.println("Short Maximum Value = " + myMaxShortValue);
        // Underflow the Minimum Value
        System.out.println("Busted Short Minimum Value = " + (short)(myMinShortValue - 1));
        // Overflow the Maximum Value
        System.out.println("Busted Short Maximum Value = " + (short)(myMaxShortValue + 1));
        // Note that there is an error when we exceed the minimum and maximum values.
        // short myMinShortNumber = -32_769;
        // short myMaxShortNumber = 32_768;

        System.out.println();

        // Size: occupies 64 bits amount of memory, width of 64
        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;
        System.out.println("Long Minimum Value = " + myMinLongValue);
        System.out.println("Long Maximum Value = " + myMaxLongValue);
        // Underflow the Minimum Value
        System.out.println("Busted Long Minimum Value = " + (myMinLongValue - 1L));
        // Overflow the Maximum Value
        System.out.println("Busted Long Maximum Value = " + (myMaxLongValue + 1L));
        // Note that there is an error when we exceed the minimum and maximum values.
        // long myMinLongNumber = -9_223_372_036_854_775_809L;
        // long myMaxLongNumber = 9_223_372_036_854_775_808L;
    }
}