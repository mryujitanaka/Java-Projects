public class Main {
    public static void main(String[] args) {

        Funcionario yoshi = new Funcionario("Rua Azul", "1", "Jijoca", "Ceará", "12345-678", "Yoshi", "000.111.333-44", "Desenvolvedor Java");

        Cliente santiago = new Cliente("Oriximiná", "Pará", "Santiago", "555.666.777-88");

        System.out.println(yoshi);
        yoshi.mostrarEndereco();
        System.out.println(santiago);
        santiago.mostrarEndereco();
    }
}