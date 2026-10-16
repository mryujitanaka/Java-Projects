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
Java Encapsulation

The meaning of Encapsulation, is to make sure that "sensitive" data is hidden from users. To achieve this, you must:
- declare class variables/attributes as private;
- provide public Get and Set methods to access and update the value of a private variable.
*/

/*
Get and Set (Getters & Setters)

You learned from previous lessons that private variables can only be accessed within the same class (an outside class has no access to it). However, it is possible to access them if we provide public Get and Set methods.

The Get method returns the variable value, and the Set method sets the value.

Syntax for both is that they start with either get or set, followed by the name of the variable, with the first letter in upper case.

Getter e Setter - Métodos padrões para acessar e modificar os atributos.
*/

/*
Java Constructors

A constructor in Java is a special method that is used to initialize objects.

The constructor is called when an object of a class is created.

It can be used to set initial values for object attributes
*/

package contabancaria;

// OOP - Encapsulamento
// Classe ContaBancaria
public class ContaBancaria {
    // Atributos privados
    private String titular;
    private double saldo;

    // Método GET - para obter o titular
    public String getTitular(){
        return titular;
    }

    // Método SET - para modificar o titular
    public void setTitular(String titular){ // a string TITULAR é um parâmetro
        this.titular = titular; // o TITULAR sendo "anotado" pelo this é o atributo privado declarado na linha 54
    }

    // Método GET - para obter o saldo
    public double getSaldo(){
        return saldo;
    }

    // Método SET - para modificar o saldo
    public void setSaldo(double saldo){ // a string SALDO é um parâmetro
        this.saldo = saldo; // o SALDO sendo "anotado" pelo this é o atributo privado declarado na linha 55
    }

    // Construtor com Atributos dentro do parâmetro
    public ContaBancaria(String titular, double saldo){
        this.titular = titular;
        this.saldo = saldo;
    }

    // Construtor sem Atributos
    public ContaBancaria(){
    }

    // Construtor com 1 Atributo
    public ContaBancaria(double saldo){
        this.saldo = saldo;
    }

    // Construtor que inicializa a conta bancária com saldo 0
    public ContaBancaria(String titular){
        this.titular = titular;
        this.saldo = 0;
    }
}