/**
 * Question 01: Factorial of given integer (iterative and recursive)
 * Description: WAP to find a factorial of a given integer (Recursive approach)
 */

import java.util.*;

public class FactorialRecursive {
    int factorial(int n){
        if(n<=1){
            return 1;
        }else{
            return n * factorial(n-1);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        FactorialRecursive fr = new FactorialRecursive();
        int result = fr.factorial(n);
        System.out.println("Factorial = "+result);
        sc.close();
    }
}
