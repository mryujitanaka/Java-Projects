public class DecimalComparator {
    public static boolean areEqualByThreeDecimalPlaces(double y, double t) {
        y = y * 1000;
        t = t * 1000;
        int numberOne = (int) y;
        int numberTwo = (int) t;
        if (numberOne == numberTwo) {
            return true;
        }
        return false;

        // or
        /*
         if ((int) (y * 1000) == (int) (t * 1000)) {
            return true;
         }
         return false;
        */

        // or
        /*
        y = (int)(y * 1000);
        t = (int)(t * 1000);
        if (y == t) {
            return true;
        }
        return false;
        */
    }
}