/**
 * Question 06: Armstrong number check
 * Description: WAP to find whether given number is Armstrong number or not
 */

import java.util.*;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int n = sc.nextInt();
        int temp = n,digit=0,sum=0,a,fact=1;
        while(n!=0){
            n /= 10; 
            digit++;
        }
        n = temp;
        while(n!=0){
            a = n%10;
            for(int i=1;i<=digit;i++){
                fact *= a;
            }
            sum += fact;
            fact = 1;
            n /= 10;
        }
        if(sum == temp){
            System.out.println(temp+" is armstrong number");
        }else{
            System.out.println(temp+" isn't armstrong number");
        }
        sc.close();
    }
}
