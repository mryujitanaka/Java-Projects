import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {

        TreeMap<String, Double> notasAlunos = new TreeMap<>();

        notasAlunos.put("Alice", 10.0);
        notasAlunos.put("Mateus", 8.0);
        notasAlunos.put("Maria", 9.9);

        // Iterar sobre o TreeMap com Key-Set
        for (String nomeAluno : notasAlunos.keySet()) {
            double nota = notasAlunos.get(nomeAluno);
            System.out.println(nomeAluno + ": " +nota);
        }

        System.out.println();

        // Iterar sobre o TreeMap com Entry-Set
        for (Map.Entry<String, Double> nota : notasAlunos.entrySet()) {
            String nomeAluno = nota.getKey();
            double valorNota = nota.getValue();
            System.out.println(nomeAluno + ": " + valorNota);
        }

        System.out.println();

        // Retornar a primeira chave
        System.out.println("Primeira chave: " + notasAlunos.firstKey());
        // Retornar a última chave
        System.out.println("Última chave: " + notasAlunos.lastKey());
    }
}