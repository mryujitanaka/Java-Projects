// Tipos de retorno

package etapaPlanejamento;

public class PlantaCasa {

    // Atributos
    public int metragem;
    public int numeroQuartos;
    public int numeroBanheiros;
    public String cor;
    public String material;

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

    // Terceiro Método com retorno
    public int somarMetragem() {
        return metragem + (numeroBanheiros + numeroQuartos);
    }
}