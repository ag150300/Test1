package com.company;

import java.util.Scanner;

public class Test7 {
    public static void main (String args[]) {
        Scanner scn = new Scanner(System.in);
            int cm = scn.nextInt();
            int kg = scn.nextInt();
            double cd = cm/2.54;
            double kd = kg/0.454;
            System.out.println(cd);
            System.out.println(kd);
    }
}
