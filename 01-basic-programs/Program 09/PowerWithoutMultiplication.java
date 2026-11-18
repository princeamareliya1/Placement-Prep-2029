/**
 * Question 09: Power a^b without power and multiplication
 * Description: WAP to find power a^b without using power and multiplication operation
 */

import java.util.*;

public class PowerWithoutMultiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a Base: ");
        int x = sc.nextInt();
        System.out.print("Enter a Power: ");
        int y = sc.nextInt();

        int sum = 0,fact=x;
        for(int i=1;i<y;i++){
            sum = 0;
            for(int j=1;j<=x;j++){
                sum += fact;
            }
            fact = sum;
        }
        System.out.println(x+"^"+y+"="+sum);
        sc.close();
    }
}
