package yujisremarks;
public class OperatorChallenge {
    public static void main(String[] args) {
        // Challenge
        double valueOne = 20.00d;
        double valueTwo = 80.00d;
        double valueThree = (valueOne + valueTwo) * 100.00d;
        double valueFour = valueThree % 40.00d;
        boolean valueFive = (valueFour == 0d) ? true : false;
        System.out.println(valueFive);
        if (!valueFive) {
            System.out.println("Got some remainder");
        }
    }
}