package yujisremarks;
public class OperatorChallenge {
    public static void main(String[] args) {
        // Challenge
        double valueOne = 20.00d;
        double valueTwo = 80.00d;
        double valueThree = (valueOne + valueTwo) * 100.00d;
        System.out.println("valueThree = " + valueThree);
        double valueFour = valueThree % 40.00d;
        System.out.println("valueFour = " + valueFour);
        boolean valueFive = (valueFour == 0d) ? true : false;
        System.out.println("valueFive = " + valueFive);
        if (!valueFive) {
            System.out.println("Got some remainder");
        }
    }
}