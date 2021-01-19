public class BarkingDog {
    public static boolean shouldWakeUp(boolean barkingIt, int hourOfDay) {
        if ((barkingIt) && ((hourOfDay >= 0) && (hourOfDay <= 23)) && ((hourOfDay < 8) || (hourOfDay > 22))) {
            return true;
        } else if ((!barkingIt) && ((hourOfDay >= 0) && (hourOfDay <= 23)) && ((hourOfDay < 0) || (hourOfDay > 23))) {
            return false;
        }
        return false;

        // or we can simplify the code like this:
        /*
        if (!barkingIt || hourOfDay < 0 || hourOfDay > 23 || (hourOfDay > 7 && hourOfDay < 23)) {
            return false;
        }
        return true;
        */
    }
}