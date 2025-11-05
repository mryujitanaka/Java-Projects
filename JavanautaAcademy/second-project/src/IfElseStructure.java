public class IfElseStructure {
    public static void main(String[] args) {

//        int age = 17;
//        if (age >= 18){
//            System.out.println("You are an adult.");
//        } else {
//            System.out.println("You are a minor.");
//        }

//        boolean isItRaining = false;
//        if (!isItRaining){
//            System.out.println("Let's go out for ice cream.");
//        } else {
//            System.out.println("Let's stay home.");
//        }
        boolean haveMoney = false;
        boolean haveCreditCard = false;
        if (haveMoney && haveCreditCard){
            System.out.println("Let's have a barbecue and drink beer!");
        } else if (haveMoney || haveCreditCard){
            System.out.println("We're just going to have a beer.");
        } else {
            System.out.println("We're broke.");
        }
    }
}