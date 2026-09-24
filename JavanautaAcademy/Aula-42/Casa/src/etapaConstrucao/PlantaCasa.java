/*
Parâmetros de Métodos
*/

package etapaConstrucao;

public class PlantaCasa {
    // Atributos / Variáveis / Características
    public int metragemCasa;
    public int numeroQuartosCasa;
    public int numeroBanheirosCasa;
    public  String tipoMaterialCasa;
    public  String corCasa;

    // Método ou Função (ordens)
    public void Construir(){
        System.out.println("Metragem: " + metragemCasa);
        System.out.println("Número de quartos: : " + numeroQuartosCasa);
        System.out.println("Número de banheiros: " + numeroBanheirosCasa);
        System.out.println("Tipo de Material: " + tipoMaterialCasa);
    }
    // Método ou Função (ordem)
    public void Pintar(){
        System.out.println(corCasa);
    }

    // Método ou Função (ordens) com Retorno
    public int somarMetragem(){
        return metragemCasa * (numeroBanheirosCasa + numeroQuartosCasa);
    }
}