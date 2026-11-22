/*
Java OOP

OOP stands for Object-Oriented Programming.

Procedural programming is about writing procedures or methods that perform operations on the data, while object-oriented programming is about creating objects that contain both data and methods.

OOP is ideal for building scalable, reusable, and maintainable code.

Object-oriented programming has several advantages over procedural programming:
- OOP provides a clear structure for the programs;
- OOP helps to keep the Java code DRY "Don't Repeat Yourself", and makes the code easier to maintain, modify and debug;
- OOP makes it possible to create full reusable applications with less code and shorter development time

Tip: The "Don't Repeat Yourself" (DRY) principle is about reducing the repetition of code. You should extract out the codes that are common for the application, and place them at a single place and reuse them instead of repeating it.
*/

/*
Composition and Aggregation in Java

In Java, composition and aggregation are specialized forms of association that describe "has-a" relationships between classes, with composition representing strong ownership and aggregation representing shared ownership where objects can exist independently.

Ambos são formas de "associação" onde um objeto contém outro objeto, mas há diferenças sutis entre eles.
*/

/*
Composition

Definition:
Composition represents a strong "belongs-to" relationship. In this case, one class (the container) owns another class (the contained).

Characteristics:
The lifecycle of the contained object is tied to the container. If the container is destroyed, the contained object is also destroyed.
It implies a strong ownership where the contained object cannot exist independently of the container.

Example:
A Building class that contains Room objects. If the Building is demolished, the Rooms are also destroyed.

Composição é uma relação forte entre duas classes onde uma classe contém uma instância de outra classe como um de seus atributos.
A vida do objeto contido está diretamente ligada à vida do objeto que o contém.
Se o objeto que contém for destruído, o objeto contido também será destruído.
Isso significa que a composição respresenta "parte-todo" onde o ciclo de vida dos objetos é dependente.
*/

/*
Aggregation

Definition:
Aggregation is a weaker "has-a" relationship. It indicates that one class contains references to another class, but does not own it.

Characteristics:
The contained objects can exist independently of the container. If the container is destroyed, the contained objects remain intact.
It allows for shared ownership, meaning multiple containers can reference the same contained object.

Example:
A Department class that has Professor objects. If the Department is closed, the Professors still exist and can belong to other departments.

Agregação é uma relação mais fraca onde uma classe contém uma referência a outra classe, mas o ciclo da vida dos objetos não está estritamente ligado.
Em outras palavras, o objeto contido pode existir independentemente do objeto que o contém.
Isso representa uma relação "associação" onde a parte pode existir sem o todo.
*/

package composicao;

public class Motor {

    private int cilindradas;

    // Construtor: same name as the class; no return type
    public Motor(int cilindradas) {
        this.cilindradas = cilindradas;
    }

    // Getters: return field values
    public int getCilindradas() {
        return cilindradas;
    }

    // Setters: update field values
    public void setCilindradas(int cilindradas) {
        this.cilindradas = cilindradas;
    }
}