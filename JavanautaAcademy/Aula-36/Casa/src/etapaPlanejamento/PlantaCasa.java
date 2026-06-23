// Estudando Modificadores de Acesso
// public: The code is accessible for all classes
// private: The code is only accessible within the declared class
// protected: The code is accessible in the same package (folder) and subclasses.

package etapaPlanejamento;

public class PlantaCasa {

    // Atributos
    public int metragem;
    public int numeroQuartos;
    public int numeroBanheiros;
    public String cor;
    public String material;

    // Primeiro Método
    protected void construir() {
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