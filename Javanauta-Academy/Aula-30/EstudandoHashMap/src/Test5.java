import java.util.HashMap;

public class Test5 {
    public static void main(String[] args) {

        HashMap<String, Double> sistemaNotasAlunos = new HashMap<>();

        sistemaNotasAlunos.put("Yoshi", 10.0d);
        sistemaNotasAlunos.put("Santiago", 7.5d);
        sistemaNotasAlunos.put("Luisa", 8.9d);

        System.out.println(sistemaNotasAlunos);

        // Tamanho do HashMap
        int tamanhoHash = sistemaNotasAlunos.size();
        System.out.println("Quantidade de posições do HashMap: " + tamanhoHash);

        // Remover uma posição específica do HashMap
        sistemaNotasAlunos.remove("Luisa");
        System.out.println(sistemaNotasAlunos);
    }
}