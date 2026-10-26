
import java.util.Scanner;

public class PrimeNumberChecker {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Get input
        System.out.print("Enter a positive integer: ");
        int number = input.nextInt();

        boolean isPrime = true;

        // Check if number is prime
        if (number <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i <= number / i; i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        // Display result
        if (isPrime) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }

        input.close();
    }
}
