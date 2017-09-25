package com.company;

import java.util.Scanner;

public class Test1 {
    public static void main (String args[]){
        Scanner scn = new Scanner(System.in);
        String in = scn.next();
        String c = scn.next();
        int howl = in.length();
        String[] Sl = new String[howl];
        String sum = "";
        for(int i =0;i <howl;i++) {
            char b = in.charAt(i);
            String bn = new Character((char)b).toString();
            String inc = String.valueOf(bn);
            if(inc.equals(c)) {
                System.out.print(sum);
               sum = "";
                System.out.println("");
            }
            else {
                Sl[i] = inc;
                sum = sum+Sl[i];
            }
        }

    }
}
