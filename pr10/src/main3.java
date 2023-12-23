public class main3 {
    public static void main(String[] args) {
        int n = 315;
        primeFactors(n, 2);
    }

    public static void primeFactors(int n, int divisor) {
        if (n <= 1) {
            return;
        }
        if (n % divisor == 0) {
            System.out.print(divisor + " ");
            primeFactors(n / divisor, divisor);
        } else {
            primeFactors(n, divisor + 1);
        }
    }
}