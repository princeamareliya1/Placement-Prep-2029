/**
 * Question 05: Prime numbers between range
 * Description: WAP to find prime numbers between a user-entered range
 */

import java.util.*;

public class PrimeRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a starting number of this range: ");
        int a = sc.nextInt();
        System.out.println("Enter a ending number of this range: ");
        int b = sc.nextInt();
        int count = 0;
        for(int i=a;i<=b;i++){
            for(int j=2;j<=(i/2);j++){
                if(i%j==0){
                    count++;
                }
            }
            if(count==0){
                System.out.print(i+" ");
            }
            count=0;
        }
        sc.close();
    }
}
