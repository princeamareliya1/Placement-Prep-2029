/**
 * Question 28: Pattern 5: Symmetric asterisk product pattern
 * Description: Print pattern:
1
1 * 1
1 * 3 * 1
1 * 3 * 5 * 3 * 1
 */

import java.util.*;

public class PatternAsteriskSymmetric {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a Number of Rows: ");
        int n = sc.nextInt();

        int p,l=1;

        for(int i=1;i<=n;i++){
            p=1;
            while(p!=l){
                System.out.print(p+" * ");
                p += 2;
            }
            System.out.print(p);
            p-=2;
            while(p>=1){
                System.out.print(" * "+p);
                p -= 2;
            }
            l+=2;
            System.out.println();
        }

        sc.close();
    }
}
