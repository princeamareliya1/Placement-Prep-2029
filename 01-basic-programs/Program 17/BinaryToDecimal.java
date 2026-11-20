/**
 * Question 17: Binary to Decimal conversion
 * Description: WAP to convert Binary to Decimal
 */

import java.util.*;

public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a Binary Number: ");
        int n = sc.nextInt();

        int temp = n,fact=1,last,sum=0;
        while(n!=0){
            last = n%10;
            sum += (fact*last);
            n /= 10;
            fact *= 2;
        }
        n = temp;
        System.out.println(n+" = "+sum);
        
        sc.close();
    }
}
