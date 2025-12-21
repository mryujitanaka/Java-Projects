public class ArithmeticOperators {
    public static void main(String[] args) {
        double bread = 10.00;
        double cheese = 7.50;
        double coffee = 16.00;
        double storeDiscount = 5.00;
        int willSplitBill = 2;
        int month = 30;

        double totalToPay = bread + cheese + coffee;
        double totalToPayWithDiscount = totalToPay - storeDiscount;
        double totalDividing = totalToPayWithDiscount / willSplitBill;
        double totalAmountSpentInTheMonth = totalToPayWithDiscount * month;

        System.out.println("Total: R$" + totalToPay);
        System.out.println("Discount: R$" + storeDiscount);
        System.out.println("Total to pay with discount: R$" + totalToPayWithDiscount);
        System.out.println("Split the bill: " + totalDividing);
        System.out.println("Total amount spent in the store during the month: R$" + totalAmountSpentInTheMonth);
    }
}