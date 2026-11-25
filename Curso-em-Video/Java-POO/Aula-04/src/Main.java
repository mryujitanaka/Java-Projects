public class Main {
    public static void main(String[] args) {

        // Criar objeto
        Caneta caneta = new Caneta("BIC",0.5, "Azul", true);

        // Chamar método
        /*
        caneta.setModelo("NIC");
        caneta.setPonta(1.0);
        caneta.setCor("Vermelha");
        caneta.setTampada(false);
        */
        caneta.status();
    }
}