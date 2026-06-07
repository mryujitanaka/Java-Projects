import java.util.HashMap; // Import the HashMap class
import java.util.Map; // Import the Map class

public class Main {
    public static void main(String[] args) {

        // A HashMap stores items in key/value pairs, where each key maps to a specific value.
        HashMap<String, Double> notasAlunos = new HashMap<>();

        notasAlunos.put("Alice", 10.0);
        notasAlunos.put("Mateus", 8.0);
        notasAlunos.put("Maria", 9.9);

        // 1ª forma de iterar sobre o HashMap usando o keySet
        for (String nomeAluno : notasAlunos.keySet()) {
            double nota = notasAlunos.get(nomeAluno);
            System.out.println(nomeAluno + ": " +nota);
        }

        System.out.println();

        // 2ª forma de iterar sobre o HashMap usando o entrySet
        for (Map.Entry<String, Double> nota : notasAlunos.entrySet()) {
            String nomeAluno = nota.getKey();
            double valorNota = nota.getValue();
            System.out.println(nomeAluno + ": " + valorNota);
        }

        System.out.println();

        double nota = notasAlunos.get("Alice");
        System.out.println("Nota da Alice: " + nota);


    }
}