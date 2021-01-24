public class Main {
    public static void main(String[] args) {
        boolean isThereTeen = TeenNumberChecker.hasTeen(22, 23, 34);
        System.out.println(isThereTeen);

        boolean isThereAnotherTeen = TeenNumberChecker.isTeen(13);
        System.out.println(isThereAnotherTeen);
    }
}