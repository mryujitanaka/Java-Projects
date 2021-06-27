package yujisremarks;
public class IfThenStatement {
    public static void main(String[] args) {
        // https://docs.oracle.com/javase/tutorial/java/nutsandbolts/opsummary.html
        boolean isAlien = false;
        // == (testing if the two primitive values are equal)
        // == (is the variable "isAlien" equal to "false"?)
        if (isAlien == false) {
            System.out.println("It is not an Alien!");
            System.out.println("And I am scared of Aliens :(");
        }
    }
}