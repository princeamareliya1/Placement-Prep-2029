/**
 * Question 16: Decimal to BCD conversion
 * Description: WAP to convert a Decimal number to BCD
 */

import java.util.*;

public class DecimalToBCD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a Decimal Number: ");
        int n = sc.nextInt();
        int temp = n,qu;
        char rem;
        String bcd = "";

        while(n!=0){
            bcd = ' ' + bcd;
            qu = n%10;
            for(int i=1;i<=4;i++){
                rem = (char)('0'+(qu%2));
                bcd = rem + bcd;
                qu /= 2;
            }
            n /= 10;
        }
        n = temp;
        System.out.println(n +" = " +bcd);
        sc.close();
    }
}
