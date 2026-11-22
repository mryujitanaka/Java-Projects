public class Main {
    public static void main(String[] args) {

        /*
        int idade = 17;

        if (idade >= 18) {
            System.out.println("Adulto");
        } else {
            System.out.println("Menor de idade");
        }
        */

        /*
        boolean estaChovendo = true;

        if (!estaChovendo) {
            System.out.println("Vamos para a praia");
        } else {
            System.out.println("Vamos ficar em casa");
        }
        */

        boolean temDinheiro = false;
        boolean temCartao = true;

        if (temDinheiro && temCartao) {
            System.out.println("Pede delivery de comida e bebidas");
        } else if (temDinheiro || temCartao) {
            System.out.println("Pede delivery só de comida");
        } else {
            System.out.println("Vamos cozinhar");
        }
    }
}