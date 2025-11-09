public class Arrays {
    public static void main(String[] args) {
        // Array Declaration
        int[] numbers = {10, 20, 30, 40, 50};

        // Array Declaration
        String[] fruits;
        // Initialize
        fruits = new String[]{"Apple", "Banana", "Avocado"};

        double[] salary = new double[5];
        salary[3] = 500.00;
        salary[1] = 200.00;
        salary[0] = 150.00;
        salary[2] = 25.00;
        salary[4] = 100.00;
        /*
        // Iterating over an array using For loop
        for (int position = 0; position < salary.length; position++){
            System.out.println("Position: " + salary[position]);
        }
        */
        // Iterating over an array using For-Each loop
        for (double mySalary : salary) {
            System.out.println(mySalary);
        }
        // Alter the value at index 2 (the third element)
        salary[2] = 99.00;
        System.out.println();
        for (double mySalary : salary) {
            System.out.println(mySalary);
        }
    }
}