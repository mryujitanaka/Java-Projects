import java.util.HashMap; // Import the HashMap class
import java.util.Map; // Import the Map class

public class Main {
    public static void main(String[] args) {

        // A HashMap stores items in key/value pairs, where each key maps to a specific value.
        HashMap<String, Double> notasAlunos = new HashMap<>();

        notasAlunos.put("Alice", 10.0);
        notasAlunos.put("Mateus", 8.0);
        notasAlunos.put("Maria", 9.9);

        // Iterar sobre o HashMap com Key-Set
        for (String nomeAluno : notasAlunos.keySet()) {
            double nota = notasAlunos.get(nomeAluno);
            System.out.println(nomeAluno + ": " +nota);
        }

        System.out.println();

        // Iterar sobre o HashMap com Entry-Set
        for (Map.Entry<String, Double> nota : notasAlunos.entrySet()) {
            String nomeAluno = nota.getKey();
            double valorNota = nota.getValue();
            System.out.println(nomeAluno + ": " + valorNota);
        }

        System.out.println();

        // Buscar valor de uma chave
        double nota = notasAlunos.get("Alice");
        System.out.println("Nota da Alice: " + nota);

        System.out.println();

        // Retornar quantidade de pares de chave-valor do HashMap
        int tamanhoHash = notasAlunos.size();
        System.out.println(tamanhoHash);

        System.out.println();

        // Remover valor de uma chave do HashMap
        notasAlunos.remove("Maria");
        for (String nomeAluno : notasAlunos.keySet()) {
            double nota2 = notasAlunos.get(nomeAluno);
            System.out.println(nomeAluno + ": " +nota2);
        }
    }
}