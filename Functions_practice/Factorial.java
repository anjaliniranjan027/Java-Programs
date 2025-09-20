package Functions_practice;
import java.util.*;
public class Factorial {
    public static void printFactorial(int n) {
        //loop
        if(n<0) {
            System.out.println("Invalod number");
            return;
        }
        int factorial = 1;
        for(int i=n; i>=1; i--) {
            factorial = factorial * i;

        }
       System.out.println(factorial);
        return;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int n = sc.nextInt();

        System.out.print("Here is resulted factorial : ");
        printFactorial(n);

        sc.close();
    }
    
}
