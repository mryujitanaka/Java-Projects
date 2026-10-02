/*
- Java Classes
Everything in Java is associated with classes and objects, along with its attributes and methods. For example: in real life, a car is an object. The car has attributes, such as weight and color, and methods, such as drive and brake.
A Class is like an object constructor, or a "blueprint" for creating objects.

- Java Interface
An interface is a completely "abstract class" that is used to group related methods with empty bodies.
Interface é uma referência a um conjunto de métodos que uma classe deve implementar.
Interfaces são usadas para garantir que diferentes classes implementem os mesmos métodos, promovendo a intereroperabilidade.
Interfaces são como Manuais, mas sem instruções. Elas dizem "o que" deve fazer, mas não "como" fazer algo. A interface será usada para quando houver mais de uma classe, poder reutilizar os mesmos métodos/funções.

- Java Packages
A package in Java is used to group related classes. Think of it as a folder in a file directory. We use packages to avoid name conflicts, and to write a better maintainable code. Packages are divided into two categories:
> Built-in Packages (packages from the Java API)
> User-defined Packages (create your own packages)
*/

import etapaPlanejamentoConstrucao.PlantaCasa;

public class Casa {
    public static void main(String[] args){

        // Criar objeto "Casa"
        PlantaCasa casa = new PlantaCasa();

        // Definir/Inicializar quais os "valores" dos atributos/variáveis/características do objeto "Casa"
        casa.metragemCasa = 125;
        casa.numeroQuartosCasa = 3;
        casa.numeroBanheirosCasa = 4;
        casa.tipoMaterialCasa = "Tijolo";
        casa.corCasa = "Cinza escuro";

        // Chamar/ordernar método/função para "construir" o objeto "Casa"
        System.out.println("A casa foi construída! Características da casa: ");
        casa.Construir();

        System.out.println();

        // Chamar/ordernar método/função para "pintar" o objeto "Casa"
        System.out.println("A casa foi pintada! Cor da casa: ");
        casa.Pintar();

        System.out.println();

        // Chamar/ordernar método/função para retornar o tipo de dado de somarMetragem()
        int resultadoSomaMetragem = casa.somarMetragem();
        System.out.println("Soma da metragem da casa: " + resultadoSomaMetragem + "m²");

        System.out.println();

        System.out.println("As características da casa foram alteradas: ");
        casa.mudarPlantaCasa(250, 6, 8, "Concreto");

        System.out.println();

        // Chamar/ordernar método/função mudarCorCasa() com parâmetro (mudar cor da casa)
        System.out.println("A cor da casa foi alterada para: ");
        casa.mudarCorCasa("Branco");

        /*****************************************************************/
        /* NOVO OBJETO */
        /*****************************************************************/

        System.out.println();

        // Criar novo objeto "Casa do Vizinho"
        PlantaCasa casaVizinho = new PlantaCasa();

        // Definir/Inicializar quais os "valores" dos atributos/variáveis/características do novo objeto "Casa do Vizinho"
        casaVizinho.metragemCasa = 100;
        casaVizinho.numeroQuartosCasa = 2;
        casaVizinho.numeroBanheirosCasa = 2;
        casaVizinho.tipoMaterialCasa = "Madeira";
        casaVizinho.corCasa = "Marrom Amadeirado";

        System.out.println("A casa do vizinho foi construída! Características da casa: ");
        casaVizinho.Construir();

        System.out.println();

        System.out.println("Cor da casa do vizinho: ");
        casa.Pintar();
    }
}