package Functions_practice;
import java.util.*;

public class CheckPrime {
    public static void checkPrime(int n) {
        if (n <= 1) {
            System.out.println("Invalid input, please enter a number greater than 1.");
            return;
        }

        boolean isPrime = true; // assume prime initially

        // check divisibility from 2 to sqrt(n)
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                isPrime = false; 
                break;
            }
        }

        if (isPrime) {
            System.out.println(n + " is a Prime number");
        } else {
            System.out.println(n + " is Not a Prime number");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive number: ");
        int n = sc.nextInt();

        checkPrime(n);

        sc.close(); 
    }
}
