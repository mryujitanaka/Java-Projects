public class PlantaCasa {
    // Atributos / Variáveis / Características
    int metragemCasa;
    int numeroQuartosCasa;
    int numeroBanheirosCasa;
    String tipoMaterialCasa;
    String corCasa;

    // Método ou Função (ordens)
    public void Construir(){
        System.out.println("Metragem: " + metragemCasa);
        System.out.println("Número de quartos: : " + numeroQuartosCasa);
        System.out.println("Número de banheiros: " + numeroBanheirosCasa);
        System.out.println("Tipo de Material: " + tipoMaterialCasa);
    }
    // Método ou Função (ordem)
    public void Pintar(){
        System.out.println("Cor: " + corCasa);
    }
}