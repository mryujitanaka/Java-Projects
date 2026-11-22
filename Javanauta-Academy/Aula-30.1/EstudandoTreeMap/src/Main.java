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

/*
Java TreeMap

A TreeMap is a collection that stores key/value pairs in sorted order by key.

It is part of the java.util package and implements the Map interface.

Tip: Unlike HashMap, which does not maintain order, TreeMap keeps its keys sorted.
*/

import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {

        TreeMap<String, Double> notasAlunos = new TreeMap<>();

        notasAlunos.put("Alice", 10.0);
        notasAlunos.put("Mateus", 8.0);
        notasAlunos.put("Maria", 9.9);

        // Iterar sobre o TreeMap com Key-Set
        for (String nomeAluno : notasAlunos.keySet()) {
            double nota = notasAlunos.get(nomeAluno);
            System.out.println(nomeAluno + ": " +nota);
        }

        System.out.println();

        // Iterar sobre o TreeMap com Entry-Set
        for (Map.Entry<String, Double> nota : notasAlunos.entrySet()) {
            String nomeAluno = nota.getKey();
            double valorNota = nota.getValue();
            System.out.println(nomeAluno + ": " + valorNota);
        }

        System.out.println();

        // Retornar a primeira chave
        System.out.println("Primeira chave: " + notasAlunos.firstKey());
        // Retornar a última chave
        System.out.println("Última chave: " + notasAlunos.lastKey());
    }
}