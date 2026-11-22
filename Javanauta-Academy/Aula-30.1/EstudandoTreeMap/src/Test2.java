import java.util.TreeMap;

public class Test2 {
    public static void main(String[] args) {

        TreeMap<String, Double> sistemaNotasAlunos = new TreeMap<>();

        sistemaNotasAlunos.put("Yoshi", 10.0d);
        sistemaNotasAlunos.put("Santiago", 7.5d);
        sistemaNotasAlunos.put("Luisa", 8.9d);

        // Primeira forma de iterar sobre as chaves/valores do TreeMap
        System.out.println("### Sistema de Notas de Alunos - keySet###");
        for (String nomeAluno : sistemaNotasAlunos.keySet()){
            double notaAluno = sistemaNotasAlunos.get(nomeAluno);
            System.out.println(nomeAluno + ": " + notaAluno);
        }
    }
}