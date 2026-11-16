/**
 * Question 07: Max Min Average of n numbers without array
 * Description: WAP to find Max, Min, Average of n numbers without using an array
 */

import java.util.*;

public class MaxMinAverageNoArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many numbers do you give as an input? \n Answer: ");
        int n = sc.nextInt();
        System.out.print("Enter a number of [1]: ");
        int num = sc.nextInt();
        int min = num , max = num , sum = num , temp=n;
        n--;
        do{
            System.out.print("Enter a number of ["+(temp-n+1)+"]: ");
            num = sc.nextInt();
            if(num>max){
                max = num;
            }
            if(num<min){
                min = num;
            }
            sum += num;
            n--;
        }while(n!=0);
        float avg = sum / (float)temp;
        System.out.println("Max = "+max);
        System.out.println("Min = "+min);
        System.out.println("Avg = "+avg);
        sc.close();
    }
}
