/**
 * Question 02: Summation of digits of a given number (iterative and recursive)
 * Description: WAP to find summation of digits of a given number (Iterative approach)
 */

import java.util.*;

public class DigitSumIterative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int n = sc.nextInt();
        int sum = 0,a;
        while(n!=0){
            a = n%10;
            sum += a;
            n /= 10;
        }
        System.out.println("Sum of digit = "+sum);
        sc.close();
    }
}
