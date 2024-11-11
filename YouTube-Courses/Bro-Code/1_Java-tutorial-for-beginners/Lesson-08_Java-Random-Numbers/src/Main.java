import java.util.Random;

public class Main {

	public static void main(String[] args) {
		
		Random random = new Random();
		
		
		int x = random.nextInt();
		int dice = random.nextInt(6)+1;
		double y = random.nextDouble();
		boolean z = random.nextBoolean();
		
		System.out.println("The random int number is: "+x);
		System.out.println("The dice number is: "+dice);
		System.out.println("The random double number is: "+y);
		System.out.println("The random boolean value is: "+z);

	}

}