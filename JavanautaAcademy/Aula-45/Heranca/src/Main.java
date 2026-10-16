public class Main {
    public static void main(String[] args){

        Cachorro cachorro = new Cachorro();
        cachorro.latir();
        cachorro.comer("ração");
        cachorro.beber();
        cachorro.dormir();

        Gato gato = new Gato();
        gato.miar();
        gato.comer("ração");
        gato.beber();
        gato.dormir();

        Galinha galinha = new Galinha();
        galinha.ciscar();
        galinha.comer("grão de milho");
        galinha.beber();
        galinha.dormir();
    }
}