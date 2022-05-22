public class CreditPaymentService {
    public double calculate(double ps, int n, int s) {
        double i = ps / 100 / 12;
        double x = 1 + i;
        double y = Math.pow(x, n);
        double k1 = i * y / (y - 1);

        return k1 * s;
    }

}







