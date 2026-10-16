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
Java Inheritance (Subclass and Superclass)

In Java, it is possible to inherit attributes and methods from one class to another. We group the "inheritance concept" into two categories:

- subclass (child) - the class that inherits from another class
- superclass (parent) - the class being inherited from

To inherit from a class, use the extends keyword.

Why And When To Use "Inheritance"?

- It is useful for code reusability: reuse attributes and methods of an existing class when you create a new class.
*/

/*
Difference between Java Inheritance and Interface

- In Java, inheritance (class extension) reuses code and establishes an "is-a" relationship, whereas an interface defines a behavioral contract and establishes a "can-do" relationship.
- Keyword Used: Inheritance uses the extends keyword, while an Interface is adopted using the implements keyword.
- Herança só pode herdar/estender uma única classe. Interface pode implementar mais de uma classe/interface.
- Herança não é obrigatório de ser utilizado. Interface é obrigatório implementar todos os métodos/funções.

When to Use Which

- Use Inheritance when: You have closely related classes that need to share common underlying code, state, and structure (e.g., a Dog and a Cat extending an Animal class).
- Use an Interface when: Unrelated classes need to share a common behavior or standard protocol (e.g., both a Car and a Printer implementing a Startable or Loggable contract).
*/

public class Animal {

    public void comer(String alimento) {
        System.out.println("O animal come " + alimento);
    }

    public void beber() {
        System.out.println("O animal bebe água");
    }

    public void dormir() {
        System.out.println("O animal dorme");
    }
}