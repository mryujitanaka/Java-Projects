import java.util.Scanner;

public class DataInputAndOutput {
    public static void main(String[] args) {
//        System.out.println("Print with line below");
//        System.out.print("Same-line printing");
//        System.out.printf("Formatted print");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Type your name: ");
        String name = scanner.nextLine();

        System.out.println("Type your age: ");
        int age = scanner.nextInt();

        System.out.println("Are you employed? true (Yes) or false (No)?");
        boolean employed = scanner.nextBoolean();

        System.out.println("Name: " + name + ", Age: " + age + ", Employed: " + employed);
    }
}