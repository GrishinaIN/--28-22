import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int sum = 0;


        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        System.out.println("Sum using for : " + sum);


        sum = 0;
        int i = 0;
        while (i < array.length) {
            sum += array[i];
            i++;
        }
        System.out.println("Sum using while : " + sum);

        sum = 0;
        i = 0;
        do {
            sum += array[i];
            i++;
        } while (i < array.length);
        System.out.println("Sum using do-while: " + sum);


        System.out.println("Command line arguments:");
        for (String arg : args) {
            System.out.println(arg);
        }

        //
        System.out.println("First 10 numbers of harmonic series:");
        for (int j = 1; j <= 10; j++) {
            double harmonicNumber = 1.0 / j;
            System.out.println(harmonicNumber);
        }


        int[] randomArray = generateRandomArray(10);
        System.out.println("Random array: " + Arrays.toString(randomArray));

        Arrays.sort(randomArray);
        System.out.println("Sorted array: " + Arrays.toString(randomArray));


        int number = 5;
        int factorial = calculateFactorial(number);
        System.out.println("Factorial of " + number + " is " + factorial);
    }

    public static int[] generateRandomArray(int size) {
        Random random = new Random();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(100);
        }
        return array;
    }

    public static int calculateFactorial(int number) {
        int factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }
        return factorial;
    }
}