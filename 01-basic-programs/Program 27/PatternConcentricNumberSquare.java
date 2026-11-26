/**
 * Question 27: Pattern 4: Concentric square number pattern
 * Description: Write a program to print concentric number square pattern (4 4 4 ... 1)
 */

import java.util.*;

public class PatternConcentricNumberSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a n: ");
        int n = sc.nextInt();

        for(int i=1;i<=n;i++){
            for(int j=1;j<=2*n-1;j++){
                if(i<=j && j<=((2*n)-1)-i+1){
                    System.out.print((n-i+1));
                }else if(i>j){
                    System.out.print(n-j+1);
                }else{
                    System.out.print(j-n+1);
                }
            }
            System.out.println();
        }

        for(int i=n-1;i>=1;i--){
            for(int j=1;j<=2*n-1;j++){
                if(i<=j && j<=(2*n-1)-i+1){
                    System.out.print(n-i+1);
                }else if(i>j){
                    System.out.print(n-j+1);
                }else{
                    System.out.print(j-n+1);
                }
            }
            System.out.println();
        }
        
        sc.close();
    }
}
