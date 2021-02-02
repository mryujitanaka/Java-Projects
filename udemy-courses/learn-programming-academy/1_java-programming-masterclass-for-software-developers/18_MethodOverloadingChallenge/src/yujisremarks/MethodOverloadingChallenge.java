package yujisremarks;
public class MethodOverloadingChallenge {
    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
        if ((feet >= 0d) && ((inches >= 0d) && (inches <= 12d))) {
            // Feet and Inches to Centimeters
            double feetToCentimeters = feet * 30.48d;
            double inchesToCentimeters = inches * 2.54d;
            return (feetToCentimeters + inchesToCentimeters);
        } return -1;
    }

    public static double calcFeetAndInchesToCentimeters(double inches) {
        if (inches >= 0d) {
            // Inches to Feet
            return (inches / 12d);
        } return -1;
    }

    public static void main(String[] args) {
        double result = calcFeetAndInchesToCentimeters(1,1);
        System.out.println(result);

        result = calcFeetAndInchesToCentimeters(33.02);
        System.out.println(result);
    }
}