/**
 * Question 13: Automorphic number check
 * Description: WAP to find whether given number is Automorphic or not
 * number whose square ends with the number itself.
 */

import java.util.*;

public class AutomorphicNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a NUmber: ");
        int n = sc.nextInt();
        int temp = n,sq = n*n,fact=1;
        while(n!=0){
            n /= 10;
            fact *= 10;
        }
        n = temp;
        if((sq%fact) == n){
            System.out.println(n+" is Automorphic Number");
        }else{
            System.out.println(n+" is not Automorphic Number");
        }
        
        sc.close();
    }
}
