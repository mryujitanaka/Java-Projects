public class Caneta {
    public String modelo;
    public String cor;
    private double ponta;
    protected boolean carga;
    private boolean tampada;

    public void status(){
        System.out.println("MODELO: " + this.modelo);
        System.out.println("COR: " + this.cor);
        System.out.println("PONTA: " + this.ponta);
        System.out.println("CARGA: " + this.carga);
        // System.out.println("TAMPADA: " + this.tampada);
    }

    public void tampar(){
        this.tampada = true;
    }

    public void destampar(){
        this.tampada = false;
    }

    public void rabiscar(){
        if (this.tampada){
            System.out.println("Caneta tampada. Não pode rabiscar!");
        } else {
            System.out.println("Caneta destampada. Pode rabiscar! :)");
        }
    }
}