public class Main {

	public static void main(String[] args) {
		
		// switch = statement that allows a variable to be tested for equality against a list of values.
		
		String day = "Pizza";
		
		switch(day) {
		
			case "Sunday": System.out.println("It is sunday!");
			break;
			case "Monday": System.out.println("It is monday!");
			break;
			case "Tuesday": System.out.println("It is tuesday!");
			break;
			case "Wednesday": System.out.println("It is wednesday!");
			break;
			case "Thursday": System.out.println("It is thursday!");
			break;
			case "Friday": System.out.println("It is friday!");
			break;
			case "Saturday": System.out.println("It is saturday!");
			break;
			default: System.out.println("That is not a day! Try again.");
			
		}

	}

}