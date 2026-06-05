import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {

        ArrayList<String> cars = new ArrayList<>();

        cars.add("Ferrari");
        cars.add("BMW");
        cars.add("Tesla");

        System.out.println(cars);
        System.out.println();

        cars.forEach(car -> System.out.println(car));
    }
}