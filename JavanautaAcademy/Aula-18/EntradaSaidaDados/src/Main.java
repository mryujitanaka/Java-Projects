import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*
        System.out.println("Imprimi e pula uma linha");
        System.out.print("Imprimi na mesma linha");
        System.out.printf("Imprimi com formatação");
        */

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome = scanner.nextLine();
        System.out.println("Nome: " + nome);

        System.out.println("Digite sua idade: ");
        int idade = scanner.nextInt();
        System.out.println("Idade: " + idade);

        System.out.println("Está empregado (True (Sim) / False (Não))? ");
        boolean estaEmpregado = scanner.nextBoolean();
        System.out.println("Empregado: " + estaEmpregado);
    }
}