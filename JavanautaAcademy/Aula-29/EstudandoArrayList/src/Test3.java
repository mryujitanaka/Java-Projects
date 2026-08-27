import java.util.ArrayList;
import java.util.List;

public class Test3 {
    public static void main(String[] args) {

        List<String> listaDeCompras = new ArrayList<>();

        listaDeCompras.add("Mamão");
        listaDeCompras.add("Abacate");
        listaDeCompras.add("Tomate");

        listaDeCompras.add(0, "Banana");

        for (String itemDaListaDeCompras : listaDeCompras){
            System.out.println(itemDaListaDeCompras);
        }

        System.out.println();

        listaDeCompras.forEach(itemDaListaDeCompras -> System.out.println(itemDaListaDeCompras));
    }
}