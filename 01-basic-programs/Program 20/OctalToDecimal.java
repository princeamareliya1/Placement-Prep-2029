/**
 * Question 20: Decimal to Octal and Vice versa
 * Description: WAP to convert Octal to Decimal
 */

import java.util.*;

public class OctalToDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a Octal Number: ");
        int octn = sc.nextInt();

        int fact=1,decn=0,last;
        do{
            last = octn%10;
            decn += (last*fact);
            fact *= 8;
            octn/=10;
        }while(octn!=0);
        
        System.out.println("Decimal Number = "+decn);

        sc.close();
    }
}
