package yujisremarks;
public class StatementWhiteSpaceIndentation {
    public static void main(String[] args) {
        // Statements
        // Statements are roughly equivalent to sentences in natural languages. A statement forms a complete unit of
        // execution. The following types of expressions can be made into a statement by terminating the expression
        // with a semicolon (;).
        // Example:
        // "int myVariable = 50;" is a statement.
        int myVariable = 50;
        // "myVariable++;" is a statement.
        myVariable++;
        // "myVariable--;" is a statement.
        myVariable--;
        // "System.out.println("myVariable = " + myVariable);" is a statement.
        System.out.println("myVariable = " + myVariable);

        System.out.println();

        // Whitespaces
        // Whitespaces are spaces between one element and another in a line of code.
        // Example:
        // Between "int" and "mySecondVariable" there is a whitespace. The same for "mySecondVariable" and "="; and
        // "=" and "= 60;".
        int mySecondVariable = 60;
        // We can also separate a line of code into several pieces. And for Java, that' fine. But this is not
        // advisable to do. In fact, it is better to never do it, although it is not a mistake.
        int
            myThirdVariable
                =
                    60
                        ;
        // But if we run a line of code, Java is smart enough to join the excess of whitespaces, so that everything is
        // displayed on one line.
        System.out.println
            (
                "myThirdVariable = "
                    +
                        myThirdVariable
            )
                                        ;
        // Another example:
        int myFourthVariable = 70;myFourthVariable++;System.out.println("myFourthVariable = " + myFourthVariable);

        System.out.println();

        // Indentation
        // Indentation is used to make our code readable to other DEVs, easier to edit, display how the braces match
        // up and show the logic of the program in an organized fashion.
        // Example:
        // It's hard to read the code below
int myFifthVariable = 80;
myFifthVariable++;
if (myFifthVariable == 81) {
System.out.println("myFifthVariable = " + myFifthVariable);
}
        // It's much better to read the code below
        int mySixthVariable = 90;
        mySixthVariable++;
        if (mySixthVariable == 91) {
            System.out.println("mySixthVariable = " + mySixthVariable);
        }
    }
}