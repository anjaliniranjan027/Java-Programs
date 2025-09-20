package Functions_practice;
import java.util.*;

public class CheckEven {
    public static void checkEven(int n) {
        if (n < 0) {
            System.out.println("Invalid number");
        }
        else if (n % 2 == 0) {
            System.out.println("It’s even");
        }
        else {
            System.out.println("It’s not even");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();

        checkEven(n);

        sc.close();
    }
}
