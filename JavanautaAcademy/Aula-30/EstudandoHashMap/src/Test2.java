import java.util.HashMap;

public class Test2 {
    public static void main(String[] args) {

        HashMap<String, Double> sistemaNotasAlunos = new HashMap<>();

        sistemaNotasAlunos.put("Yoshi", 10.0d);
        sistemaNotasAlunos.put("Santiago", 7.5);
        sistemaNotasAlunos.put("Luisa", 8.9);

        System.out.println(sistemaNotasAlunos.get("Luisa"));
    }
}