/**
 * Question 01: Factorial of given integer (iterative and recursive)
 * Description: WAP to find a factorial of a given integer (Iterative approach)
 */

import java.util.*;

public class FactorialIterative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int fact = 1;
        for(int i=1;i<=n;i++){
            fact = fact * i;
        }
        System.out.println("Factorial = "+fact);
        sc.close();
    }
}
