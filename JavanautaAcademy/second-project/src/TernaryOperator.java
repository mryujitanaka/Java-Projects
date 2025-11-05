public class TernaryOperator {
    public static void main(String[] args) {
        boolean haveMoney = false;

//        if (haveMoney){
//            System.out.println("Let's order a pizza!");
//        } else {
//            System.out.println("Let's cook our own dinner.");
//        }

        String msg = (haveMoney) ? "Let's order a pizza!" : "Let's cook our own dinner.";
        System.out.println(msg);
    }
}