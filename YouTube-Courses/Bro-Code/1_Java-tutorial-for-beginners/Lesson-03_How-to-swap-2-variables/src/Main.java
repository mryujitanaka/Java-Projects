public class Main {

	public static void main(String[] args) {
		
		String x = "Water";
		String y = "Orange Tang";
		/*
		 * String temp = null;
		 */
		// or we can simple use:
		String temp;
		
		temp = x;
		x = y;
		y = temp;
		
		System.out.println("x = "+x);
		System.out.println("y = "+y);

	}

}