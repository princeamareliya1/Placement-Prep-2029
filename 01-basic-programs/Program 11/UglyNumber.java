/**
 * Question 11: Ugly number check
 * Description: WAP to find whether given number is Ugly or not (prime factors only 2, 3, 5)
 */

import java.util.*;

public class UglyNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Number: ");
        int n = sc.nextInt();
        int temp = n;
        while(true){
            if(n<=0){
                System.out.println(temp+" is not an Ugly Number");
                break;
            }
            if(n==1){
                System.out.println(temp+" is an Ugly Number");
                break;
            }else if(n%2==0){
                n /= 2;
            }else if(n%3==0){
                n /= 3;
            }else if(n%5==0){
                n /= 5;
            }else{
                System.out.println(temp + " is not an Ugly Number");
                break;
            }
        }

        sc.close();
    }
}
