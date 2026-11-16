/**
 * Question 08: Angle between hour and minute hand
 * Description: WAP to calculate angle between hour and minute hand
 */

import java.util.*;

public class ClockAngle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Hour of clock: ");
        int h = sc.nextInt();
        if(h>12){
            h %= 12;
        }
        System.out.print("Enter a Minute of clock: ");
        int m = sc.nextInt();  
        float ha = h*30;
        float ma = m*6;
        float hadmh = m*(float)0.5;
        float ang = (ha+hadmh) - ma;
        if(ang<0){
            ang *= (-1);
        }
        if(ang>180){
            ang = 360-ang;
        }

        System.out.println("Angle between "+h+":"+m+"  = "+ang);
        sc.close();
    }
}
