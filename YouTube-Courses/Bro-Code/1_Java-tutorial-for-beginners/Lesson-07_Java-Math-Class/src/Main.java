import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		// Explanation
		/*
		double a = 3.14;
		double b = -10;
		double c = 25;
		
		double d = Math.max(a, b);
		double e = Math.min(a, b);
		double f = Math.abs(b);
		double g = Math.sqrt(c);
		double h = Math.round(a);
		double i = Math.ceil(a);
		double j = Math.floor(a);
		
		System.out.println("The largest number between "+a+" and "+b+" is "+d);
		System.out.println("The smallest number between "+a+" and "+b+" is "+e);
		System.out.println("The absolute (positive) value of "+b+" is "+f);
		System.out.println("The square root of "+c+" is "+g);
		System.out.println("The rounded number of "+a+" to the nearest integer is "+h);
		System.out.println("The rounded number of "+a+" up to the nearest integer is "+i);
		System.out.println("The rounded number of "+a+" down to the nearest integer is "+j);
		*/
		
		// Exercise - Hypotenuse
		
		double x;
		double y;
		double z;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter side x: ");
		x = scanner.nextDouble();
		System.out.println("Enter side y: ");
		y = scanner.nextDouble();
		
		z = Math.sqrt((x*x)+(y*y));
		
		System.out.println("The hypotenuse is "+z);
		
		scanner.close();
		
	}

}