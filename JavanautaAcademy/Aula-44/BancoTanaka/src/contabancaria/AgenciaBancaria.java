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

public class AgenciaBancaria {
    public static void main(String[] args){

        ContaBancaria minhaConta = new ContaBancaria("Yuji Tanaka", 1500);
        System.out.println("Titular da conta: " + minhaConta.getTitular());
        System.out.println("Saldo da conta: $"+ minhaConta.getSaldo());

        // Mudar o titular da conta
        minhaConta.setTitular("Yoshi Tanaka");
        // Depositar ou transferir mais saldo para a conta
        minhaConta.setSaldo(minhaConta.getSaldo() + 500);
        String titularConta = minhaConta.getTitular();
        Double saldoConta = minhaConta.getSaldo();
        System.out.println("Titular da conta: " + titularConta);
        System.out.println("Saldo da conta: $"+ saldoConta);

        // Criar conta da esposa
        ContaBancaria contaEsposa = new ContaBancaria("Simone Tanaka");
        System.out.println("Titular da conta: " + contaEsposa.getTitular());
        System.out.println("Saldo da conta: $"+ contaEsposa.getSaldo());
    }
}
