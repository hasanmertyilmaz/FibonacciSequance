import java.util.Scanner;

public class FibonacciCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of terms: ");
        int terms = scanner.nextInt();


        if (terms <= 0) {
            System.out.println("Please Enter a Positive Number.");
            return;
        }


        if (terms == 1) {
            System.out.println("Fibonacci Sequence: 0");
            return;
        }

        // First and second term
        int a = 0, b = 1;

        System.out.println("Fibonacci Sequence: ");
        System.out.print(a + " " + b);  // print first and sec. term

        // calc fibonacci and print
        for (int i = 2; i < terms; i++) {
            int next = a + b;
            System.out.print(" " + next);
            a = b;
            b = next;
        }

        System.out.println(); // space
    }
}
