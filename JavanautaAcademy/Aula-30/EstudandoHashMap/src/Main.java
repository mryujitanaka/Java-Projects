/*
The Collections Framework

Before we explore ArrayList, HashSet, HashMap, and other data structures in more detail, it's important to understand that all of these are part of something bigger - the Java Collections Framework.

The Java Collections Framework provides a set of interfaces (like List, Set, and Map) and a set of classes (ArrayList, HashSet, HashMap, etc.) that implement those interfaces.

All of these are part of the java.util package.

They are used to store, search, sort, and organize data more easily - all using standardized methods and patterns.

Tip: Think of the Collections Framework as a toolbox.

Interfaces like Map define what tools can do, and classes like HashMap are the actual tools that do the work.
*/

/*
Java Map Interface

The Map interface is a part of the Java Collections Framework and is used to store key-value pairs. Each key must be unique, but values can be duplicated.

A Map is useful when you want to associate a key (like a name or ID) with a value (like an age or description).

Common classes that implement Map:

HashMap - fast and unordered
*/

import java.util.HashMap; // Import the HashMap class
import java.util.Map; // Import the Map class

public class Main {
    public static void main(String[] args) {

        // A HashMap stores items in key/value pairs, where each key maps to a specific value.
        HashMap<String, Double> notasAlunos = new HashMap<>();

        notasAlunos.put("Alice", 10.0);
        notasAlunos.put("Mateus", 8.0);
        notasAlunos.put("Maria", 9.9);

        // Iterar sobre o HashMap com Key-Set
        for (String nomeAluno : notasAlunos.keySet()) {
            double nota = notasAlunos.get(nomeAluno);
            System.out.println(nomeAluno + ": " +nota);
        }

        System.out.println();

        // Iterar sobre o HashMap com Entry-Set
        for (Map.Entry<String, Double> nota : notasAlunos.entrySet()) {
            String nomeAluno = nota.getKey();
            double valorNota = nota.getValue();
            System.out.println(nomeAluno + ": " + valorNota);
        }

        System.out.println();

        // Buscar valor de uma chave
        double nota = notasAlunos.get("Alice");
        System.out.println("Nota da Alice: " + nota);

        System.out.println();

        // Retornar quantidade de pares de chave-valor do HashMap
        int tamanhoHash = notasAlunos.size();
        System.out.println(tamanhoHash);

        System.out.println();

        // Remover valor de uma chave do HashMap
        notasAlunos.remove("Maria");
        for (String nomeAluno : notasAlunos.keySet()) {
            double nota2 = notasAlunos.get(nomeAluno);
            System.out.println(nomeAluno + ": " +nota2);
        }
    }
}