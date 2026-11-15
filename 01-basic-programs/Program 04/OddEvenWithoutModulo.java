/**
 * Question 04: Odd or Even without using % operator
 * Description: WAP to find whether a number is Odd or Even without using % operator
 */

import java.util.*;

public class OddEvenWithoutModulo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int n = sc.nextInt();
        if((n&1)==0){
            System.out.println(n + " is even number");
        }else{
            System.out.println(n + " is odd number");
        }
        
        sc.close();
    }
}
