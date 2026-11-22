import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {

        List<String> listaDeCompras = new ArrayList<>();

        listaDeCompras.add("Mamão");
        listaDeCompras.add("Abacate");
        listaDeCompras.add("Tomate");

        for (String itemDaListaDeCompras : listaDeCompras){
            System.out.println(itemDaListaDeCompras);
        }
    }
}