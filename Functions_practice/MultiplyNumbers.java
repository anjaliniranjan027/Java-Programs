package Functions_practice;
import java.util.*;

public class MultiplyNumbers {
    public static int multiplyTwoNumbers(int a, int b) {
        int product = a * b;
        return product;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your first number :");
        int a = sc.nextInt();
        System.out.print("Enter your second number :");
        int b = sc.nextInt();

        int product = multiplyTwoNumbers(a, b);
        System.out.println("Here is the product : "+ product);
        sc.close();
    }
    
}
