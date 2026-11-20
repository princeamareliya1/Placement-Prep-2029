/**
 * Question 18: Octal to Hexadecimal conversion
 * Description: WAP to convert Octal into Hexadecimal
 */

import java.util.*;

public class OctalToHexadecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Octal Number: ");
        int octn = sc.nextInt();

        int temp = octn,decn=0,last,fact=1;
        while(octn!=0){
            last = octn%10;
            decn += (fact*last);
            octn /= 10;
            fact *= 8;
        }

        String hexa = "";
        char ch;
        int qu=decn,rem;
        while(qu!=0){
            rem = qu%16;
            if(rem<10){
                ch= (char)('0'+ rem);
            }else{
                rem -= 10;
                ch = (char)('A' + rem);
            }
            hexa = ch + hexa;
            qu /= 16;
        }

        octn = temp;
        System.out.println(octn+" = "+hexa);
        
        sc.close();
    }
}
