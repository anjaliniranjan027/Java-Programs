package Pattern_practice;

public class HollowRectangle {
    public static void main(String[] args) {
        int n = 5;

        //outer loop
        for(int i=1; i<=n; i++) {
            //innerloop
            for(int j=1; j<=n; j++) {
                //condition check for printing star or space
                if(i==1 || j==1 || i==n || j==n) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }  

            }
             System.out.println();


        }
    }
}