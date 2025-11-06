public class SwitchCase {
    public static void main(String[] args) {

        int weekDay = 1;

//        if (weekDay == 1) {
//            System.out.println("Sunday");
//        } else if (weekDay == 2) {
//            System.out.println("Monday");
//        } else if (weekDay == 3) {
//            System.out.println("Tuesday");
//        } else if (weekDay == 4) {
//            System.out.println("Wednesday");
//        } else if (weekDay == 5) {
//            System.out.println("Thursday");
//        } else if (weekDay == 6) {
//            System.out.println("Friday");
//        } else if (weekDay == 7) {
//            System.out.println("Saturday");
//        }

        switch (weekDay) {
            case 1:
                System.out.println("Sunday");
            break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");
                break;
        }
    }
}