public class PlantaCasa {

    // Atributos
    int metragem;
    int numeroQuartos;
    int numeroBanheiros;
    String cor;
    String material;

    // Primeiro Método
    public void construir() {
        System.out.println("Metragem: " + metragem);
        System.out.println("Número de Quartos: " + numeroQuartos);
        System.out.println("Número de Banheiros: " + numeroBanheiros);
        System.out.println("Material: " + material);
    }

    // Segundo Método
    public void pintar() {
        System.out.println("Cor: " + cor);
    }
}