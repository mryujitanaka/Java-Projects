import java.util.Map;
import java.util.TreeMap;

public class Test4 {
    public static void main(String[] args) {

        TreeMap<String, Double> sistemaNotasAlunos = new TreeMap<>();

        sistemaNotasAlunos.put("Yoshi", 10.0d);
        sistemaNotasAlunos.put("Santiago", 7.5d);
        sistemaNotasAlunos.put("Luisa", 8.9d);

        System.out.println("Primeira chave: " + sistemaNotasAlunos.firstKey());
        System.out.println("Última chave: " + sistemaNotasAlunos.lastKey());
    }
}