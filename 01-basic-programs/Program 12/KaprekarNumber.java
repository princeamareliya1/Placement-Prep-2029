/**
 * Question 12: Kaprekar number check
 * Description: WAP to find whether given number is Kaprekar or not
 * non-negative number whose square can be split into two parts that add back to the original number
 */

import java.util.*;

public class KaprekarNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a Number: ");
        int n = sc.nextInt();
        int square = n*n;

        String sq = Integer.toString(square);

        int len = sq.length();
        
        String s1 = sq.substring(0,(len/2));
        String s2 = sq.substring((len/2),len);

        int n1 = Integer.parseInt(s1);
        int n2 = Integer.parseInt(s2);

        if(n1+n2 == n){
            System.out.println(n+" is Kaprekar Number");
        }else{
            System.out.println(n+" is not Kaprekar Number");
        }
        
        sc.close();
    }
}
