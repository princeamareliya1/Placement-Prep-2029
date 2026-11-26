/**
 * Question 31: Insert element at specific position in array in-place
 * Description: WAP to enter an element at specific position into array (in-place)
 */

import java.util.*;

public class InsertElementInPlace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a size: ");
        int size = sc.nextInt();

        int[] arr = new int[size+1];

        for(int i=0;i<size;i++){
            System.err.print("Enter a no. of position["+(i+1)+"]: ");
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter position where insert: ");
        int position = sc.nextInt();
        position--;

        System.out.print("Enter a no which insert: ");
        int insert = sc.nextInt();

        for(int i=size-1;i>=position;i--){
            arr[i+1] = arr[i];
        }
        arr[position] = insert;

        for(int i=0;i<=size;i++){
            System.out.print(arr[i]+" ");
        }
        
        sc.close();
    }
}
