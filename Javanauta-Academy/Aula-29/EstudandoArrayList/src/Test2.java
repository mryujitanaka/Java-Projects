import java.util.ArrayList;
import java.util.List;

public class Test2 {
    public static void main(String[] args) {

        List<String> listaDeCompras = new ArrayList<>();

        listaDeCompras.add("Mamão");
        listaDeCompras.add("Abacate");
        listaDeCompras.add("Tomate");

        listaDeCompras.add(0, "Banana");

        for (String itemDaListaDeCompras : listaDeCompras){
            System.out.println(itemDaListaDeCompras);
        }

        String itemDaListaDeCompras = listaDeCompras.get(3);
        System.out.println("O quarto item da lista de compras, e que está na posição 3 é: " + itemDaListaDeCompras);

        listaDeCompras.remove("Tomate");
        for (String itemDaListaDeCompras2 : listaDeCompras){
            System.out.println(itemDaListaDeCompras2);
        }

        boolean listaDeComprasEstaVazia = listaDeCompras.isEmpty();
        System.out.println(listaDeComprasEstaVazia);

        int tamanhoDaListaDeCompras = listaDeCompras.size();
        System.out.println(tamanhoDaListaDeCompras);

        boolean itemContemNaListaDeCompras = listaDeCompras.contains("Pepino");
        System.out.println(itemContemNaListaDeCompras);

        listaDeCompras.clear();
        System.out.println("Lista de compras vazia: " + listaDeCompras.isEmpty());
    }
}