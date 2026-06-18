public class Casa {
    public static void main(String[] args) {

        // Criar objeto Casa utilizando a classe PlantaCasa
        PlantaCasa casa = new PlantaCasa();

        // Inicializar atributos (variáveis) / Características do objeto Casa
        casa.metragem = 100;
        casa.numeroQuartos = 4;
        casa.numeroBanheiros = 5;
        casa.material = "Tijolos";
        casa.cor = "Cinza";

        // Chamar métodos (funções) para construir o objeto Casa
        System.out.println("A casa foi construída! As características são:");

        casa.construir();

        casa.pintar();
    }
}