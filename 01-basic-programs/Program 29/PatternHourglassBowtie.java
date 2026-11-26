/**
 * Question 29: Pattern 6: Star hour-glass / bowtie pattern
 * Description: Implement star pattern with boundary and diagonals
 */

import java.util.*;

public class PatternHourglassBowtie {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a n: ");
        int n = sc.nextInt();

        for(int i=1;i<=n;i++){
            for(int j=1;j<=i-1;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=(2*n)-(2*i)+1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=1;i<=n-1;i++){
            for(int j=1;j<=n-i-1;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=(2*i)+1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        
        sc.close();
    }
}
