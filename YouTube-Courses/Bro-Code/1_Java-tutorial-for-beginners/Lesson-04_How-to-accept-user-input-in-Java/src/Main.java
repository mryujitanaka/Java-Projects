import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("What is your name? ");
		String name = scanner.nextLine();
		System.out.println("How old are you? ");
		int age = scanner.nextInt();
		scanner.nextLine();
		System.out.println("What is your favorite food? ");
		String food = scanner.nextLine();
		System.out.println("How many times do you wake up in the middle of the night? ");
		int times = scanner.nextInt();
		
		System.out.println("Hello, "+name);
		System.out.println("You are "+age+" years old");
		System.out.println("Your favorite food is "+food);
		System.out.println("You wake up "+times+" times in the middle of the night");
		
		scanner.close();

	}

}