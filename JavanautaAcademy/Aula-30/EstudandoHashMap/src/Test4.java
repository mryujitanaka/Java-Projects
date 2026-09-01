import java.util.HashMap;
import java.util.Map;

public class Test4 {
    public static void main(String[] args) {

        HashMap<String, Double> sistemaNotasAlunos = new HashMap<>();

        sistemaNotasAlunos.put("Yoshi", 10.0d);
        sistemaNotasAlunos.put("Santiago", 7.5d);
        sistemaNotasAlunos.put("Luisa", 8.9d);

        // Segunda forma de itarar sobre as chaves/valores do HashMap
        for (Map.Entry<String, Double> notaAluno : sistemaNotasAlunos.entrySet()){
            String nomeAluno = notaAluno.getKey();
            double valorNotaAluno = notaAluno.getValue();
            System.out.println(nomeAluno + ": " + valorNotaAluno);
        }
    }
}