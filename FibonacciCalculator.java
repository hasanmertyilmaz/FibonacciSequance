import java.util.InputMismatchException;
import java.util.Scanner;

public class FibonacciCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int terms = 0;

        // Try-catch block to handle user input errors

        try {
            System.out.println("Enter the number of terms: ");
            terms = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Please enter a valid number.");
            return;
        }

        // Input validation

        if (terms <= 0) {
            System.out.println("Please enter a positive number.");
            return;
        }

        // Special case if only one term is requested

        if (terms == 1) {
            System.out.println("Fibonacci Sequence: 0");
            return;
        }

        // Initialize the first two terms

        int a = 0, b = 1;

        System.out.println("Fibonacci Sequence: ");
        System.out.print(a + " " + b);  // Print the first two terms

        // Calculate and print the Fibonacci sequence

        for (int i = 2; i < terms; i++) {
            int next = a + b;
            System.out.print(" " + next);
            a = b;
            b = next;
        }

        // Print a newline after the sequence

        System.out.println();
    }
}
