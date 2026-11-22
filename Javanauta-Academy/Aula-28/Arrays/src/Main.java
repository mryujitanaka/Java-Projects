public class Main {
    public static void main(String[] args) {

        /*
        int[] numeros;
        numeros = new int[] {10, 20, 30, 40, 50, 60};
        */
        int[] numeros = {10, 20, 30, 50, 60};

        /*
        String[] frutas;
        frutas = new String[] {"Maçã", "Morango", "Abacaxi"};
        */
        String[] frutas = {"Maçã", "Morango", "Abacaxi"};

        // Another way to use Array
        double[] salarios = new double[5];
        salarios[0] = 1621.00;
        salarios[1] = 3242.00;
        salarios[2] = 4500.00;
        salarios[3] = 12968.00;
        salarios[4] = 25936.00;

        // Iteração sobre o Array de salários com for
        /*
        for (int posicao = 0; posicao < salarios.length; posicao++){
            System.out.println("Salário: " + salarios[posicao]);
        }
        */

        // Iteração sobre o Array de salários com for-each
        for (double salario : salarios){
            System.out.println("Salário: R$ " + salario);
        }

        // Alteração de valores do Array de salários
        salarios[2] = 6484.00;
        System.out.println("Salário da posição 2 alterada: R$ " + salarios[2]);
    }
}