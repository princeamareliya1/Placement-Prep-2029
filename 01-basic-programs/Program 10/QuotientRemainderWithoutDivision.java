/**
 * Question 10: Quotient and remainder without division and modulo
 * Description: WAP to find quotient and remainder of 2 numbers without division and modulo operators
 */

import java.util.*;

public class QuotientRemainderWithoutDivision {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a Number: ");
        int n = sc.nextInt();
        System.out.print("Enter a Divisor: ");
        int d = sc.nextInt();

        int q=0,r=n;
        while(true){
            if(r>=d){
                r = r-d;
                q++;
            }else{
                break;
            }
        }
        System.out.println(n+" / "+d+" = "+q);
        System.out.println(n+" % "+d+" = "+r);
        
        sc.close();
    }
}
