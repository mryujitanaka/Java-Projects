package agregacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Funcionarios yoshi = new Funcionarios("Yoshi");
        Funcionarios santiago = new Funcionarios("Santiago");
        Funcionarios victor = new Funcionarios("Victor");

        List<Funcionarios> listaNomeFuncionarios = new ArrayList<>();
        listaNomeFuncionarios.add(yoshi);
        listaNomeFuncionarios.add(santiago);
        listaNomeFuncionarios.add(victor);

        Departamento ti = new Departamento("TI", listaNomeFuncionarios);
        ti.exibirListaFuncionarios();

        Departamento marketing = new Departamento("Marketing", Collections.emptyList());
        marketing.exibirListaFuncionarios();
    }
}