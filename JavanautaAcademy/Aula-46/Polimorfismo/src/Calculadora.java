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
Java Polymorphism

Polymorphism means "many forms", and it occurs when we have many classes that are related to each other by inheritance.

Like we specified in the previous lesson; Inheritance lets us inherit attributes and methods from another class. Polymorphism uses those methods to perform different tasks. This allows us to perform a single action in different ways.

For example, think of a superclass called Animal that has a method called animalSound(). Subclasses of Animals could be Pigs, Cats, Dogs, Birds - And they also have their own implementation of an animal sound (the pig oinks, and the cat meows, etc.):

Em programação, Polimorfismo permite que um único método possa se referir a diferentes comportamentos dependendo do objeto que o chama.

Existem 2 tipos de polimorfismo:

1. Polimorfismo de Compilação (sobrecarga de métodos)
2. Polimorfismo de Tempo de Execução (sobrescrita de métodos)
*/

/*
Tempo de Compilação

É a fase em que o código-fonte (o que você escreve) é transformado em código de máquina (bytecode) pelo compilador.

Nessa fase, é verificado:

- sintaxe: o compilador verifica se a linguagem foi usada corretamente (sem erros de sintaxe);
- tipos: o compilador verifica se as variáveis e métodos são usados com os tipos corretos;
- checagem de erros: erros como métodos que não existem ou uso incorreto de métodos são detectados.
*/

/*
Tempo de Execução

É a fase em que o código compilado é executado pela máquina virtual (JVM) ou pelo sistema operacional.

O programa é carregado na memória e começa a ser executado.

Variáveis são inicializadas, métodos são chamados e o fluxo do programa é seguido.

Decisões sobre qual método chamar (no caso do polimorfismo) são feitas com base no tipo real do objeto.
*/

/*
1. Polimorfismo de Compilação (sobrecarga de métodos)

A sobrecarga de métodos ocorre quando você define múltiplos métodos com o mesmo nome, mas com diferentes assinaturas (diferente número ou tipo de parâmetros) na mesma classe.

O compilador decide qual método chamar com base na lista de argumentos fornecidos na chamada do método.
*/

/*
2. Polimorfismo de Tempo de Execução (sobrescrita de métodos)

A sobrescrita de métodos ocorre quando uma classe filha fornece uma implementação específica de um método que já está definido na sua classe pai.

Neste caso, a decisão sobre qual método usar é feita durante a execução do programa (runtime).


*/

/*
Why And When To Use "Inheritance" and "Polymorphism"?

- It is useful for code reusability: reuse attributes and methods of an existing class when you create a new class.
*/

// Polimorfismo de Compilação (Cobrecarga de Métodos):
public class Calculadora {

    public static int somar(int a, int b){
        return a+b;
    }

    public static double somar(double a, double b){
        return a+b;
    }

    public static Integer somar(Integer a, Integer b, Integer c){
        return a+b+c;
    }
}