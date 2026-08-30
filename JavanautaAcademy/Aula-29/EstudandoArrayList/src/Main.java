/*
The Collections Framework

Before we explore ArrayList, HashSet, HashMap, and other data structures in more detail, it's important to understand that all of these are part of something bigger - the Java Collections Framework.

The Java Collections Framework provides a set of interfaces (like List, Set, and Map) and a set of classes (ArrayList, HashSet, HashMap, etc.) that implement those interfaces.

All of these are part of the java.util package.

They are used to store, search, sort, and organize data more easily - all using standardized methods and patterns.

Tip: Think of the Collections Framework as a toolbox.

Interfaces like List define what tools can do, and classes like ArrayList are the actual tools that do the work.
*/

import java.util.List; // Import the List interface
import java.util.ArrayList; // Import the ArrayList class

public class Main {
    public static void main(String[] args) {

        List<String> listaDeCompras = new ArrayList<>(); // Create an ArrayList object

        listaDeCompras.add("Mamão");
        listaDeCompras.add("Sabão em Pó");
        listaDeCompras.add("Macarrão");

        listaDeCompras.add(1, "Banana");

        // Iteração sobre o ArrayList
        for (String itemDeCompra : listaDeCompras){
            System.out.println("* " + itemDeCompra);
        }

        // Retornar elemento de uma determinada posição
        String itemDeCompra = listaDeCompras.get(3);
        System.out.println("Na posição 3, temos o item: " + itemDeCompra);

        // Remover elemento de uma determina posição
        listaDeCompras.remove("Sabão em Pó");
        System.out.println("###### LISTA DE COMPRAS ATUALIZADA ######");
        for (String itemDeCompra2 : listaDeCompras){
            System.out.println("* " + itemDeCompra2);
        }

        // Verificar se o ArrayList está vazio
        boolean listaEstaVazia = listaDeCompras.isEmpty();
        System.out.println("A lista de compras está vazia? " + listaEstaVazia);

        // Retornar o tamanho do ArrayList
        int tamanhoDaLista = listaDeCompras.size();
        System.out.println("A quantidade de itens da lista de compras é: " + tamanhoDaLista);

        // Verificar se existe um determinado elemento
        boolean itemContemNaLista = listaDeCompras.contains("Arroz");
        System.out.println("O item Arroz está contido na lista de compras? " + itemContemNaLista);

        /*
        // Excluir elementos
        listaDeCompras.clear();
        System.out.println("A lista de compras está vazia? " + listaDeCompras.isEmpty());

        System.out.println("###### LISTA DE COMPRAS ATUALIZADA ######");
        for (String itemDeCompra3 : listaDeCompras){
            System.out.println("* " + itemDeCompra3);
        }
        */

        // Iteração sobre o ArrayList usando o For-Each
        System.out.println("###### LISTA DE COMPRAS ATUALIZADA ######");
        listaDeCompras.forEach(produto -> System.out.println("* " + produto));
    }
}