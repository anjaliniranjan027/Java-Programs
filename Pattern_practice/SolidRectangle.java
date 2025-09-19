package Pattern_practice;

public class SolidRectangle {
    public static void main(String[] args) {
        int n = 5;

        //outer loop -> for rows
        for(int i=1; i<=n; i++) {
            //inner loop -> for columns
            for(int j=1; j<=n; j++) {
                System.out.print("*");
            
            }
            System.out.println();
        }

    }
    
}
