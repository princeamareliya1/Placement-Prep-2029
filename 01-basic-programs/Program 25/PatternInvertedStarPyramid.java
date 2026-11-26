/**
 * Question 25: Pattern 2: Inverted star pyramid
 * Description: Print pattern:
*********
*******
*****
***
*
 */

import java.util.*;

public class PatternInvertedStarPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a no. of Rows: ");
        int n = sc.nextInt();

        for(int i=n;i>=1;i--){
            for(int j=(2*i)-1;j>=1;j--){
                System.out.print("*");
            }
            System.out.println();
        }
        
        sc.close();
    }
}
