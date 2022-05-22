public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        int s = 1_000_000;
        double ps = 9.99;
        int n = 12;
        double monthPay = service.calculate(ps, n, s);

        System.out.println(" ежемесячный платеж " + monthPay + " рублей ");


    }
}
