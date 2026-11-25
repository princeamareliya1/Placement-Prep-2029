/**
 * Question 23: Nth digit of infinite integer sequence
 * Description: Given integer n, return nth digit of infinite sequence [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, ...]
 */

import java.util.*;

public class NthDigitInfiniteSequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a Number: ");
        int n = sc.nextInt();

        String str = "";
        int i=1;
        do{
            str = str + i;
            i++;
        }while(i<=n);

        str = str.substring(0, n);

        System.out.println(str);

        sc.close();
    }
}
