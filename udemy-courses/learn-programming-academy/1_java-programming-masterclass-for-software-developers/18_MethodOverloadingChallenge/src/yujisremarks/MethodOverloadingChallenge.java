package yujisremarks;
public class MethodOverloadingChallenge {
    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
        if ((feet >= 0d) && ((inches >= 0d) && (inches <= 12d))) {
            // Feet and Inches to Centimeters
            double feetToCentimeters = feet * 30.48d;
            double inchesToCentimeters = inches * 2.54d;
            System.out.println("feetToCentimeters = " + feetToCentimeters);
            System.out.println("inchesToCentimeters = " + inchesToCentimeters);
            return (feetToCentimeters + inchesToCentimeters);
        } return -1;
    }

    public static double calcFeetAndInchesToCentimeters(double inches) {
        double inchesToFeet = inches;
        if (inchesToFeet >= 0d) {
            // Inches to Feet
            return (inchesToFeet / 12d);
        } return -1;
    }

    public static void main(String[] args) {
        double result = calcFeetAndInchesToCentimeters(2,2);
        System.out.println("Total = " + result);
        result = calcFeetAndInchesToCentimeters(33.02);
        System.out.println("inchesToFeet = " + result);
    }
}