/*
Parâmetros de Métodos
Os parâmetros são variáveis que são passadas ao método.
Essas variáveis/características são definidas dentro dos parênteses após o nome do método.
*/

/*
Criar novo objeto, além da "casa".
*/

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
        System.out.println("Soma da metragem da casa: " + resultadoSomaMetragem + "m³");

        System.out.println();

        // Chamar/ordernar método/função mudarCorCasa() com parâmetro (mudar cor da casa)
        System.out.println("A cor da casa foi alterada para: ");
        casa.mudarCorCasa("Branco");

        System.out.println();

        System.out.println("As características da casa foram alteradas: ");
        casa.mudarPlantaCasa(250, 6, 8, "Concreto");

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