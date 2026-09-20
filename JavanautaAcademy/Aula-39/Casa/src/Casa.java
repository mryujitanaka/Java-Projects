import etapaConstrucao.PlantaCasa;

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
    }
}
