package Functions_practice;
import java.util.*;

public class PrintTable {
    
    // function to print the table of n
    public static void printTable(int n) {
        if (n <= 0) {
            System.out.println("Please enter a positive number");
            return;
        }

        System.out.println("Multiplication Table of " + n + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " x " + i + " = " + (n * i));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to print its table: ");
        int n = sc.nextInt();

        printTable(n);

        sc.close();
    }
}
