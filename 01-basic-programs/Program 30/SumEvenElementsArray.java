/**
 * Question 30: Sum of even numbers in 1D array
 * Description: WAP to find sum of even numbers in 1D array
 */

import java.util.*;

public class SumEvenElementsArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a Size of Array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];

        for(int i=0;i<size;i++){
            System.out.print("Enter a number of index ["+(i+1)+"]: ");
            arr[i] = sc.nextInt();
        }
        
        int sum=0;

        for(int i=0;i<size;i++){
            if(arr[i]%2==0){
                sum += arr[i];
            }
        }
        System.out.print("Sum = "+sum);
        sc.close();
    }
}
