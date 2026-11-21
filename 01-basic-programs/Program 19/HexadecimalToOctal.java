/**
 * Question 19: Hexadecimal to Octal conversion
 * Description: WAP to convert Hexadecimal to Octal
 */

import java.util.*;

public class HexadecimalToOctal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a Hexadecimal Number: ");
        String str = sc.next();


        int fact=1,decn=0,last;
        int len=str.length();
        char ch;

        for(int i=len-1;i>=0;i--){
            ch = str.charAt(i);
            last = Character.getNumericValue(ch);
            decn += last*fact;
            fact *= 16;
        }
        
        String octn = "";
        int rem;
        if(decn==0){
            octn = "0";
        }
        while (decn!=0) {
            rem = decn%8;
            ch = (char)('0'+rem);
            octn = ch + octn;
            decn /= 8;
        }
        
        System.out.println("Octal Number = "+octn);
        sc.close();
    }
}
