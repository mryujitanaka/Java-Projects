// Polimorfismo de Compilação (Cobrecarga de Métodos):
public class Main {
    public static void main(String[] args){
        int sabaoLavaRoupas = 20;
        int mamao = 2;
        double sabonete = 1.50;
        double arroz = 3.50;
        Integer batata = 6;
        Integer cenoura = 7;
        Integer melancia = 5;

        int totalInt = Calculadora.somar(sabaoLavaRoupas, mamao);
        double totalDouble = Calculadora.somar(sabonete, arroz);
        Integer totalInteger = Calculadora.somar(batata, cenoura, melancia);

        System.out.println(totalInt);
        System.out.println(totalDouble);
        System.out.println(totalInteger);
    }
}