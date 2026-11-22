// Polimorfismo de Tempo de Execução (sobrescrita de métodos):
public class Carro extends Transporte{
    @Override
    public void mover(){
        System.out.println("O carro está se movendo");
    }
}