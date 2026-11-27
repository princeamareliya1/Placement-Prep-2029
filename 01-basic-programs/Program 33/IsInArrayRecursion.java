/**
 * Question 33: Check if number is present in array using recursion only
 * Description: WAP to check whether number is present in array using recursion only: int isInArray(int a[], int m)
 */

import java.util.*;

public class IsInArrayRecursion {
    int searchingFunction(int[] arr,int se,int le){
        if(le<0){
            System.out.print("Number is not present");
            return 0;
        }else if(arr[le]==se){
            System.out.print("Number is found");
            return 0;
        }else{
            return searchingFunction(arr, se, le-1);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter size: ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        for(int i=0;i<size;i++){
            System.out.print("Enter a element of ["+(i+1)+"]:");
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter a searching element: ");
        int se = sc.nextInt();
        
        IsInArrayRecursion newfun = new IsInArrayRecursion();
        newfun.searchingFunction(arr,se,size-1);

        sc.close();
    }
}
