public class Caneta {
    String modelo;
    String cor;
    double ponta;
    boolean carga;
    boolean tampada;

    void status(){
        System.out.println("MODELO: " + this.modelo);
        System.out.println("COR: " + this.cor);
        System.out.println("PONTA: " + this.ponta);
        System.out.println("CARGA: " + this.carga);
        System.out.println("TAMPADA: " + this.tampada);
    }

    void tampar(){
        this.tampada = true;
    }

    void destampar(){
        this.tampada = false;
    }

    void rabiscar(){
        if (this.tampada){
            System.out.println("Caneta tampada. Não pode rabiscar!");
        } else {
            System.out.println("Caneta destampada. Pode rabiscar! :)");
        }
    }
}