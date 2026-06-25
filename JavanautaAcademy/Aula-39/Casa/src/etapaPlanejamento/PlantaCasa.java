// Parâmetros de Métodos

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

    // Terceiro Método com parâmetro
    public void mudarCorCasa(String novaCor) {
        cor = novaCor;
        pintar();
    }

    // Quarto Método com retorno
    public int somarMetragem() {
        return metragem * (numeroBanheiros + numeroQuartos);
    }

    // Quinto Método mudando todas os atributos (características)
    public void mudarCaracteristicasCasa(int novaMetragem, int novoNumeroQuartos, int novoNumeroBanheiros, String novoMaterial) {
        metragem = novaMetragem;
        numeroQuartos = novoNumeroQuartos;
        numeroBanheiros = novoNumeroBanheiros;
        material = novoMaterial;
        construir();

        // Criar novo objeto dentro de um método
        PlantaCasa casaSogra = new PlantaCasa();
        System.out.println("CASA DA SOGRA:");
        casaSogra.metragem = 50;
        casaSogra.numeroQuartos = 2;
        casaSogra.numeroBanheiros = 2;
        casaSogra.cor = "Marrom";
        casaSogra.material = "Alvenaria";
        casaSogra.construir();
        casaSogra.pintar();
    }
}