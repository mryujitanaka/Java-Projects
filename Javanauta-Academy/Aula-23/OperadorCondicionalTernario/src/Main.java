public class Main {
    public static void main(String[] args) {

        boolean temDinheiro = true;

        // Expressão If-Else
        if (temDinheiro) {
            System.out.println("Vamos pedir delivery");
        } else {
            System.out.println("Vamos cozinhar");
        }

        // Expressão Ternária
        String mensagem = (temDinheiro) ? "Vamos pedir delivery" : "Vamos cozinhar";

        System.out.println(mensagem);
    }
}