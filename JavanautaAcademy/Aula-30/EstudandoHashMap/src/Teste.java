import java.util.HashMap;
import java.util.Map;

public class Teste {
    public static void main(String[] args) {

        HashMap<String, Double> notasAlunos = new HashMap<>();

        notasAlunos.put("Yoshi", 10.0d);
        notasAlunos.put("Santiago", 8.5d);
        notasAlunos.put("Camilinha", 9.5d);

        // Key-Set iterator
        for (String nomeAluno : notasAlunos.keySet()) {
            double nota = notasAlunos.get(nomeAluno);
            System.out.println(nomeAluno + ": " + nota);
        }

        System.out.println();

        // Entry-Set iterator
        for (Map.Entry<String, Double> nota : notasAlunos.entrySet()) {
            String nomeAluno2 = nota.getKey();
            double valorNota = nota.getValue();
            System.out.println(nomeAluno2 + ": " + valorNota);
        }
    }
}