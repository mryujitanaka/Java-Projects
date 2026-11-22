import java.util.Map;
import java.util.TreeMap;

public class Test3 {
    public static void main(String[] args) {

        TreeMap<String, Double> sistemaNotasAlunos = new TreeMap<>();

        sistemaNotasAlunos.put("Yoshi", 10.0d);
        sistemaNotasAlunos.put("Santiago", 7.5d);
        sistemaNotasAlunos.put("Luisa", 8.9d);

        // Segunda forma de iterar sobre as chaves/valores do TreeMap
        System.out.println("### Sistema de Notas de Alunos - entrySet###");
        for (Map.Entry<String, Double> notaAluno : sistemaNotasAlunos.entrySet()) {
            String nomeAluno = notaAluno.getKey();
            double valorNotaAluno = notaAluno.getValue();
            System.out.println(nomeAluno + ": " + valorNotaAluno);
        }
    }
}