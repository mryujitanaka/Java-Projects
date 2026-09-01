import java.util.HashMap;

public class Test3 {
    public static void main(String[] args) {

        HashMap<String, Double> sistemaNotasAlunos = new HashMap<>();

        sistemaNotasAlunos.put("Yoshi", 10.0d);
        sistemaNotasAlunos.put("Santiago", 7.5d);
        sistemaNotasAlunos.put("Luisa", 8.9d);

        // Primeira forma de itarar sobre as chaves/valores do HashMap
        System.out.println("### Sistema de Notas de Alunos ###");
        for (String nomeAluno : sistemaNotasAlunos.keySet()){
            double notaAluno = sistemaNotasAlunos.get(nomeAluno);
            System.out.println(nomeAluno + ": " + notaAluno);
        }
    }
}