public class Main {
    public static void main(String[] args) {

        Caneta caneta = new Caneta();

        caneta.modelo = "BIC Cristal";
        caneta.cor = "Azul";
        // caneta.ponta = 0.5;
        caneta.carga = true;
        // caneta.tampada = true;

        caneta.status();
        caneta.tampar();
        caneta.rabiscar();
    }
}