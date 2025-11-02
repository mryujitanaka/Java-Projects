public class CastingPrimitiveTypes {
    public static void main(String[] args) {
        // int >> double
        int intNumber = 10;
        double doubleNumber = intNumber;

        // double >> int
        double secondDoubleNumber = 10.5;
        int secondIntNumber = (int) secondDoubleNumber;

        // int >> string
        Integer thirdIntNumber = 150;
        String stringNumber = thirdIntNumber.toString();

        // string >> int
        String secondStringNumber = "150";
        Integer fourthIntNumber = Integer.parseInt(secondStringNumber);

        // double >> string
        Double thirdDoubleNumber = 550.5;
        String thirdStringNumber = thirdDoubleNumber.toString();

        // string >> double
        String fourthStringNumber = "550.5";
        Double fourthDoubleNumber = Double.parseDouble(fourthStringNumber);

        // long >> string
        Long longNumber = 1024L;
        String fifthStringNumber = longNumber.toString();

        // string >> long
        String sixthStringNumber = "1024";
        Long secondLongNumber = Long.parseLong(sixthStringNumber);

        System.out.println("Integer converted to double: " + doubleNumber);
        System.out.println("Double converted to int: " + secondIntNumber);
        System.out.println("Integer converted to string: " + stringNumber);
        System.out.println("String converted to integer: " + fourthIntNumber);
        System.out.println("Double converted to string: " + thirdStringNumber);
        System.out.println("String converted to double: " + fourthDoubleNumber);
        System.out.println("Long converted to string: " + fifthStringNumber);
        System.out.println("String converted to long: " + secondLongNumber);
    }
}