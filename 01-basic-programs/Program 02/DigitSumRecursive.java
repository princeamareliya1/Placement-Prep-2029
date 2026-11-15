/**
 * Question 02: Summation of digits of a given number (iterative and recursive)
 * Description: WAP to find summation of digits of a given number (Recursive approach)
 */

import java.util.*;

public class DigitSumRecursive {
    int SumOfDigit(int n){
        if(n==0){
            return 0;
        }else{
            return (n%10)+SumOfDigit(n/10);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int n = sc.nextInt();

        DigitSumRecursive dsr = new DigitSumRecursive();
        int result = dsr.SumOfDigit(n);
        System.out.println("Sum of Digit = "+result);
        sc.close();
    }
}
