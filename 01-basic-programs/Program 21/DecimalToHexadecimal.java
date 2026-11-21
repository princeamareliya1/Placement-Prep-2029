/**
 * Question 21: Decimal to Hexadecimal and Vice versa
 * Description: WAP to convert Decimal to Hexadecimal
 */

import java.util.*;

public class DecimalToHexadecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a Number: ");
        int n = sc.nextInt();

        String hexn = "";
        int rem;
        char ch;
        do{
            ch = 'A';
            rem = n%16;
            if(rem<10){
                ch = (char)('0'+rem);
            }else{
                ch = (char)(ch+(rem-10));
            }
            hexn = ch + hexn;
            n /= 16;
        }while(n!=0);
        
        System.out.println("Hexadecimal = "+hexn);
        sc.close();
    }
}
