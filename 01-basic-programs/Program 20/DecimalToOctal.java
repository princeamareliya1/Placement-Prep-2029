/**
 * Question 20: Decimal to Octal and Vice versa
 * Description: WAP to convert Decimal to Octal
 */

import java.util.*;

public class DecimalToOctal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a Decimal Number: ");
        int decn = sc.nextInt();
        String octn = "";
        char ch;


        int rem;
        do{
            rem = decn % 8;
            ch = (char)('0'+rem);
            octn = ch + octn;
            decn /= 8;
        }while(decn!=0);

        System.out.println("Octal Number = "+octn);
        
        sc.close();
    }
}
