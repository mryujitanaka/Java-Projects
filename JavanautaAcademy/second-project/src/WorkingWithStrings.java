public class WorkingWithStrings {
    public static void main(String[] args) {
        String name = "Yoshi";
        String nameTwo = " Tanaka";

        int myStringLength = name.length();
        boolean areEquals = name.equals(nameTwo);
        String fullName = name.concat(nameTwo);

        System.out.println("Hello, " + name.toUpperCase());
        System.out.println(name + " has " + myStringLength + " characters");
        System.out.println("Are the names the same: " + areEquals);
        System.out.println("Full name: " + fullName);
    }
}