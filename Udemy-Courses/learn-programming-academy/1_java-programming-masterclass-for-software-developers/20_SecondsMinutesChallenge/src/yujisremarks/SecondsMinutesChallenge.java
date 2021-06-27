package yujisremarks;
public class SecondsMinutesChallenge {
    public static int getDurationString(int minutes, int seconds) {
        if ((minutes >= 0) && (seconds >= 0 && seconds <=59)) {
            int sumMinSec = minutes + seconds;
        }
        System.out.println("Invalid value");
        return -1;
    }

    public static void main(String[] args) {
    }
}