public class TeenNumberChecker {
    public static boolean hasTeen(int v, int y, int t) {
        // range 13-19 (inclusive)
        if (((v >= 13) && (v <= 19)) || ((y >= 13) && (y <= 19)) || ((t >= 13) && (t <= 19))) {
            return true;
        } return false;
    }

    public static boolean isTeen(int f) {
        if ((f >= 13) && (f <= 19)) {
            return true;
        } return false;
    }
}