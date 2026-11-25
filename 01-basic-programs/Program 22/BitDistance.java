/**
 * Question 22: Bit distance between two numbers without binary conversion
 * Description: Write a program to find distance/Hamming distance between 2 numbers without binary conversion
 */

import java.util.*;

public class BitDistance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n1: ");
        int n1 = sc.nextInt();
        System.out.print("Enter n2: ");
        int n2 = sc.nextInt();

        int xor = n1^n2;
        String binary = Integer.toBinaryString(xor);
        int distance=0;
        for(int i=0;i<binary.length();i++){
            if(binary.charAt(i)=='1'){
                distance++;
            }
        }
        System.out.println("Bit Distance = "+distance);
        sc.close();
    }
}
