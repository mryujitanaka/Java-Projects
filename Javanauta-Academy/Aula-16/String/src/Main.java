public class Main {
    public static void main(String[] args) {

        String nome = "Joana";
        String sobrenome = " da Silva";

        int tamanhoString = nome.length();
        boolean saoIguais = nome.equals(sobrenome);
        String nomeCompleto = nome.concat(sobrenome);

        System.out.println("Olá, " + nome.toUpperCase());
        System.out.println("Seu nome possui " + tamanhoString + " caracteres");
        System.out.println("Os nomes são iguais? " + saoIguais);
        System.out.println("Seu nome completo é: " + nomeCompleto);
    }
}