/*
- Java Classes
Everything in Java is associated with classes and objects, along with its attributes and methods. For example: in real life, a car is an object. The car has attributes, such as weight and color, and methods, such as drive and brake.
A Class is like an object constructor, or a "blueprint" for creating objects.

- Java Interface
An interface is a completely "abstract class" that is used to group related methods with empty bodies.
Interface é uma referência a um conjunto de métodos que uma classe deve implementar.
Interfaces são usadas para garantir que diferentes classes implementem os mesmos métodos, promovendo a intereroperabilidade.
Interfaces são como Manuais, mas sem instruções. Elas dizem "o que" deve fazer, mas não "como" fazer algo. A interface será usada para quando houver mais de uma classe poder reutilizar os mesmos métodos/funções.

- Java Packages
A package in Java is used to group related classes. Think of it as a folder in a file directory. We use packages to avoid name conflicts, and to write a better maintainable code. Packages are divided into two categories:
> Built-in Packages (packages from the Java API)
> User-defined Packages (create your own packages)
*/

package etapaPlanejamentoConstrucao;

public class PlantaCasa implements Construcao{
    // Atributos / Variáveis / Características
    public int metragemCasa;
    public int numeroQuartosCasa;
    public int numeroBanheirosCasa;
    public String tipoMaterialCasa;
    public String corCasa;

    // Método ou Função (ordens)
    @Override
    public void Construir(){
        System.out.println("Metragem: " + metragemCasa);
        System.out.println("Número de quartos: : " + numeroQuartosCasa);
        System.out.println("Número de banheiros: " + numeroBanheirosCasa);
        System.out.println("Tipo de Material: " + tipoMaterialCasa);
    }

    // Método ou Função (ordem)
    @Override
    public void Pintar(){
        System.out.println(corCasa);
    }

    @Override
    public int calcularCustoConstrucao(int custoPorMetro) {
        return metragemCasa + custoPorMetro;
    }

    // Método ou Função (ordens) com Retorno
    public int somarMetragem(){
        return metragemCasa * (numeroBanheirosCasa + numeroQuartosCasa);
    }

    // Método ou Função (ordens) com parâmetros (mudar características da casa)
    public void mudarPlantaCasa(int novaMetragemCasa, int novoNumeroQuartosCasa, int novoNumeroBanheirosCasa, String novoTipoMaterialCasa){
        metragemCasa = novaMetragemCasa;
        numeroQuartosCasa = novoNumeroQuartosCasa;
        numeroBanheirosCasa = novoNumeroBanheirosCasa;
        tipoMaterialCasa = novoTipoMaterialCasa;
        Construir();
    }

    // Método ou Função (ordens) com parâmetros (mudar cor da casa)
    public void mudarCorCasa(String novaCorCasa){
        corCasa = novaCorCasa;
        Pintar();
    }
}