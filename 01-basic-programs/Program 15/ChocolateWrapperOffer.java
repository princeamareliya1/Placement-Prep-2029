/**
 * Question 15: Chocolate and wrapper exchange scenario
 * Description: WAP to calculate total chocolates you can eat with n rupees and wrapper exchange offer
 */

import java.util.*;

public class ChocolateWrapperOffer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a Rupees: ");
        int rs = sc.nextInt();
        int wrappers=0,totalchocolates=0,chocolates=0;
        System.out.print("Enter price of Chocolates: ");
        int rpc = sc.nextInt();
        System.out.print("how many wrappers require for one chocolate: ");
        int wpc = sc.nextInt();
        
        chocolates = (rs/rpc);
        rs = rs%rpc;
        totalchocolates = chocolates;
        wrappers = chocolates;

        while(wrappers>=wpc){
            chocolates = (wrappers/wpc);
            wrappers = (wrappers%wpc);
            totalchocolates += chocolates;
            wrappers += chocolates;
        }

        System.out.println("Total chocolates = "+totalchocolates);
        System.out.println("Wrappers = "+wrappers);
        System.out.println("Rupee not used: = "+rs);

        sc.close();
    }
}
