/**
 * Question 21: Decimal to Hexadecimal and Vice versa
 * Description: WAP to convert Hexadecimal to Decimal
 */

import java.util.*;

public class HexadecimalToDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a  Hexadecimal Number: ");
        String str = sc.next();

        int len = str.length();
        int fact = 1,decn=0,last;
        char ch;
        for(int i=len-1;i>=0;i--){
            ch = str.charAt(i);
            last = Character.getNumericValue(ch);
            decn += (last*fact);
            fact *= 16; 
        }
        
        System.out.println("Decimal Number = "+decn);

        sc.close();
    }
}
