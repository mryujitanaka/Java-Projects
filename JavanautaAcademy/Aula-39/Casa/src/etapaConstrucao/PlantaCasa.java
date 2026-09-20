/*
Modificadores de Acesso (Java Modifiers):
* public: acessível de qualquer lugar.
* private: acessível apenas dentro da classe onde foi declarado.
* protected: acessível dentro do mesmo pacote ou subclasses.
*/

package etapaConstrucao;

public class PlantaCasa {
    // Atributos / Variáveis / Características
    public int metragemCasa;
    public int numeroQuartosCasa;
    public int numeroBanheirosCasa;
    public  String tipoMaterialCasa;
    public  String corCasa;

    // Método ou Função (ordens)
    protected void Construir(){
        System.out.println("Metragem: " + metragemCasa);
        System.out.println("Número de quartos: : " + numeroQuartosCasa);
        System.out.println("Número de banheiros: " + numeroBanheirosCasa);
        System.out.println("Tipo de Material: " + tipoMaterialCasa);
    }
    // Método ou Função (ordem)
    public void Pintar(){
        System.out.println("Cor: " + corCasa);
    }
}