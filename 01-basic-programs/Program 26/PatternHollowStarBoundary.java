/**
 * Question 26: Pattern 3: Hollow diamond star boundary
 * Description: Print pattern with star boundary and spaces
 */

import java.util.*;

public class PatternHollowStarBoundary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a no. of Rows: ");
        int n = sc.nextInt();

        for(int i=1;i<=(2*n)-1;i++){
            if(i==1 || i==(2*n)-1){
                for(int j=1;j<=n-1;j++){
                    System.out.print(" ");
                }
                System.out.print("*");
                System.out.println();
            }else if(i<=n){
                for(int j=1;j<=n-i;j++){
                    System.out.print(" ");
                }
                System.out.print("*");
                for(int j=1;j<=(2*i)-3;j++){
                    System.out.print(" ");
                }
                System.out.print("*");
                System.out.println();
            }else{
                for(int j=1;j<=i-n;j++){
                    System.out.print(" ");
                }
                System.out.print("*");
                for(int j=1;j<=2*(((2*n)-1)-i)-1;j++){
                    System.out.print(" ");
                }
                System.out.print("*");
                System.out.println();
            }
        }
        
        sc.close();
    }
}
