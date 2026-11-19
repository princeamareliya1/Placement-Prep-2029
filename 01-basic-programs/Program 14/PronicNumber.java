/**
 * Question 14: Pronic number check
 * Description: WAP to find whether given number is Pronic or not (N = k * (k + 1))
 *              Number you get by multiplying two consecutive integers
 */

import java.util.*;

public class PronicNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a Number: ");
        int n = sc.nextInt();
        int flag = -1;

        for(int i=0;i<=(n/2);i++){
            if(n == (i*(i+1))){
                flag = i;
                break;
            }
        }
        if(flag==-1){
            System.out.println(n+" is not Pronic Number");
        }else{
            System.out.println(n+" = "+flag+" x "+(flag+1));
        }
        
        sc.close();
    }
}
