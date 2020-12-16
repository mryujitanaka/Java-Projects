package yujisremarks;
public class FloatDouble {
    public static void main(String[] args) {
        // Minimum and Maximum Float numbers that can be stored in memory
        // Size: occupies 32 bits amount of memory, width of 32
        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;
        System.out.println("Float Minimum Value = " + myMinFloatValue);
        System.out.println("Float Maximum Value = " + myMaxFloatValue);

        System.out.println();

        // Minimum and Maximum Double numbers that can be stored in memory
        // Size: occupies 64 bits amount of memory, width of 64
        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;
        System.out.println("Double Minimum Value = " + myMinDoubleValue);
        System.out.println("Double Maximum Value = " + myMaxDoubleValue);

        System.out.println();

        // Note:
        int myIntValue = 5 / 3;
        // float myFloatValue = (float) 5.25;
        float myFloatValue = 5f / 3f;
        // double myDoubleValue = 5.00 / 3.00;
        double myDoubleValue = 5d / 3d;
        System.out.println(myIntValue);
        System.out.println(myFloatValue);
        System.out.println(myDoubleValue);

        System.out.println();

        // Challenge
        double poundsValue = 200d;
        double kilogramsValue = poundsValue * 0.45359237d;
        System.out.println("Challenge Result = " + kilogramsValue);

        System.out.println();

        // Another examples:
        double pi = 3.1415927d;
        double anotherNumber = 3_000_000.4_567_890d;
        System.out.println(pi);
        System.out.println(anotherNumber);
    }
}