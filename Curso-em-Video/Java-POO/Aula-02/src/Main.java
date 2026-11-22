public class Main {
    public static void main(String[] args) {

        // CANETA AZUL
        // Instanciar a classe Caneta (criar objeto):
        Caneta canetaAzul = new Caneta();
        // Atribuir valores aos atributos declarados na classe Caneta
        canetaAzul.modelo = "Esferográfica";
        canetaAzul.cor = "Azul";
        canetaAzul.ponta = 1.0;
        canetaAzul.carga = true;
        // Chamar métodos da caneta
        canetaAzul.status();
        canetaAzul.tampar();
        canetaAzul.rabiscar();

        // CANETA VERMELHA
        Caneta canetaVermelha = new Caneta();
        canetaVermelha.modelo = "Esferográfica";
        canetaVermelha.cor = "Vermelha";
        canetaVermelha.ponta = 0.8;
        canetaVermelha.carga = true;
        canetaVermelha.status();
        canetaVermelha.destampar();
        canetaVermelha.rabiscar();
    }
}