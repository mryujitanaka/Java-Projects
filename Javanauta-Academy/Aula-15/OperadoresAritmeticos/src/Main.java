public class Main {
    public static void main(String[] args) {

        double pao = 9.50;
        double queijo = 7.00;
        double acucar = 1.00;

        double desconto = 5.00;

        int totalDiasMes = 30;

        double valorTotal = pao + queijo + acucar;
        double valorTotalComDesconto = valorTotal - desconto;
        double valorTotalDividido = valorTotalComDesconto / 2;
        double valorTotalMensal = valorTotalComDesconto * totalDiasMes;

        System.out.println("Valor total = R$ " + valorTotal);
        System.out.println("Valor total com desconto= R$ " + valorTotalComDesconto);
        System.out.println("Valor total com desconto dividido para duas pessoas = " + valorTotalDividido);
        System.out.println("Valor total mensal = " + valorTotalMensal);
    }
}