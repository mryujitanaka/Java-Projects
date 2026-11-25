// Métodos Getters, Setters e Constructors

public class Caneta {

    // Variáveis ou atributos
    private String modelo;
    private double ponta;
    private String cor;
    private boolean tampada;

    // Método Constructor
    public Caneta(String modelo, double ponta, String cor, boolean tampada) {
        this.modelo = modelo;
        this.ponta = ponta;
        this.cor = cor;
        this.tampada = tampada;
    }

    // MODELO
    // Getter
    public String getModelo() {
        return modelo;
    }
    // Setter
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    // PONTA
    // Getter
    public double getPonta() {
        return ponta;
    }
    // Setter
    public void setPonta(double ponta) {
        this.ponta = ponta;
    }

    // COR
    // Getter
    public String getCor() {
        return cor;
    }
    // Setter
    public void setCor(String cor) {
        this.cor = cor;
    }

    // TAMPADA
    // Getter
    public boolean getTampada() {
        return tampada;
    }
    // Setter
    public void setTampada(boolean tampada) {
        this.tampada = tampada;
    }

    // Exibir resultado do código em tela
    public void status(){
        System.out.println("CANETA");
        System.out.println("Modelo: " + modelo);
        System.out.println("Ponta: " + ponta);
        System.out.println("Cor: " + cor);
        System.out.println("Tampada: " + tampada);
        System.out.println("Tenho uma caneta " + getModelo() + " de ponta " + getPonta() + ". Ela é de cor " + getCor() + "!");
        if (getTampada()){
            System.out.println("A caneta está tampada. Não pode rabiscar :(");
        } else {
            System.out.println("A caneta não está tampada. Pode rabiscar! :)");
        }
    }
}