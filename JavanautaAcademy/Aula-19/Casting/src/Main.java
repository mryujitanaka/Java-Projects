public class Main {
    public static void main(String[] args) {

        /*
           Conversão automática (Widening Casting):
           byte -> short -> char -> int -> long -> float -> double

           Conversão manual (Narrowing Casting):
           double -> float -> long -> int -> char -> short -> byte
        */

        // Int -> Double
        int meuInt = 10;
        double meuDouble = meuInt;
        System.out.println(meuInt);
        System.out.println(meuDouble);

        // Double -> Int
        double meuDouble2 = 20.5d;
        int meuInt2 = (int) meuDouble2;
        System.out.println(meuDouble2);
        System.out.println(meuInt2);

        // Int -> String
        Integer meuInt3 = 30;
        String meuString = meuInt3.toString();
        System.out.println(meuInt3);
        System.out.println(meuString);

        // String -> Int
        String meuString2 = "123";
        Integer meuInt4 = Integer.parseInt(meuString2);
        System.out.println(meuString2);
        System.out.println(meuInt4);

        // Double -> String
        Double meuDouble3 = 123.5d;
        String meuString3 = meuDouble3.toString();
        System.out.println(meuDouble3);
        System.out.println(meuString3);

        // String -> Double
        String meuString4 = "456.7";
        Double meuDouble4 = Double.parseDouble(meuString4);
        System.out.println(meuString4);
        System.out.println(meuDouble4);

        // Long -> String
        Long meuLong = 789L;
        String meuString5 = meuLong.toString();
        System.out.println(meuLong);
        System.out.println(meuString5);

        // String -> Long
        String meuString6 = "159";
        Long meuLong2 = Long.parseLong(meuString6);
        System.out.println(meuString6);
        System.out.println(meuLong2);
    }
}