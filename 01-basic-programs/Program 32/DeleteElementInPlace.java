/**
 * Question 32: Delete element from array in-place
 * Description: WAP to delete an element from array specified by user (in-place)
 */

import java.util.*;

public class DeleteElementInPlace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter size of Array: ");
        int size = sc.nextInt();

        int[] arr = new int[size];
        
        for(int i=0;i<size;i++){
            System.out.print("Enter a element of ["+(i+1)+"]:");
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter a element which deleted: ");
        int delete = sc.nextInt();

        int t=0;
        while(arr[t]!=delete){
            t++;
        }
        while(t<size-1){
            arr[t] = arr[t+1];
            t++;
        }
        
        for(int i=0;i<size-1;i++){
            System.out.print(arr[i]+" ");
        }
        
        sc.close();
    }
}
