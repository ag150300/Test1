package com.company;

import java.util.Scanner;

public class Test6 {
    public static void main (String args[]) {
        Scanner scn = new Scanner(System.in);
            int chi = scn.nextInt();
            int eng = scn.nextInt();
            int math = scn.nextInt();
            System.out.println(chi+eng+math);
            System.out.println((chi+eng+math)/3);
    }
}
