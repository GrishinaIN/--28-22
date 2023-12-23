public class Main {
    public static void main(String[] args) {
        int N = 123456;
        int sum = sumOfDigits(N);
        System.out.println("Сумма цифр числа: " + sum);
    }

    public static int sumOfDigits(int n) {
        if (n < 10) {
            return n;
        } else {
            return n % 10 + sumOfDigits(n / 10);
        }
    }
}
