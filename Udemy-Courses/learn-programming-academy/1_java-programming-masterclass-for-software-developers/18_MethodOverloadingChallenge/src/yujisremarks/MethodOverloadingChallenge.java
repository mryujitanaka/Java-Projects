package yujisremarks;
public class MethodOverloadingChallenge {
    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
        if ((feet >= 0d) && ((inches >= 0d) && (inches <= 12d))) {
            // Feet and Inches to Centimeters
            double feetToCentimeters = feet * 30.48d;
            double inchesToCentimeters = inches * 2.54d;
            // Sum between the values converted to centimeters
            double centimeters = feetToCentimeters + inchesToCentimeters;
            System.out.println(feet + " feet + " + inches + " inches = " + centimeters + " cm");
            return centimeters;
        }
        System.out.println("Error! Invalid feet or inches parameters!");
        return -1;
    }

    public static double calcFeetAndInchesToCentimeters(double inches) {
        if (inches >= 0d) {
            // Inches to Feet
            double feet = (int) inches / 12;
            double remainingInches = (int) inches % 12;
            System.out.println(inches + " inches = " + feet + " feet and " + remainingInches + " inches");
            return calcFeetAndInchesToCentimeters(feet, remainingInches);
        }
        System.out.println("Error! Inches < 0");
        return -1;
    }

    public static void main(String[] args) {
        calcFeetAndInchesToCentimeters(6,0);
        calcFeetAndInchesToCentimeters(157);
    }
}