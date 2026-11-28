/**
 * Question 34: Remove duplicates from sorted array
 * Description: WAP to remove duplicates from a sorted array in-place
 */

import java.util.*;

public class RemoveDuplicatesSortedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int[] arr = {1, 2, 2, 3, 3, 3, 4, 5, 5, 6, 6, 7};
        int count=0;

        for(int i=arr.length-1;i>0;i--){
            if(arr[i]==arr[i-1]){
                arr[i] = -1;
                count++;
            }
        }
        int j;
        for(int i=0;i<=arr.length-1-count;i++){
            if(arr[i]==-1){
                j = i+1;  
                while(arr[j]==-1){
                    j++;
                }
                arr[i] = arr[j];
                arr[j] = -1;
            }
        }
        
        for(int i=0;i<=arr.length-1-count;i++){
            System.out.print(arr[i]+" ");
        }
        
        sc.close();
    }
}
