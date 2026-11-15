/**
 * Question 03: Total odd and total even digits of a given number
 * Description: WAP to find total odd and total even digits of a given number
 */

import java.util.*;

public class CountOddEvenDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a Number: ");
        int n = sc.nextInt();
        int oddc=0,evenc=0,a;
        while(n!=0){
            a = n%10;
            if(a%2==0){
                evenc++;
            }else{
                oddc++;
            }
            n /= 10;
        }

        System.out.println("Odd Count ="+oddc);
        System.out.println("Even Count ="+evenc);
        sc.close();
    }
}
