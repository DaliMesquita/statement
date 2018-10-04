package com.bateedjalla;

import java.util.Scanner;

public class statement {
    public static void main(String[] args){
        //statement
        int a = 76;

        //operator
        //operation
        Scanner s = new Scanner(System.in);
        a = s.nextInt();

        //Conditional
        if(a > 50) {
            System.out.println("hallo");
        } else if (a == 5) {
            System.out.println("hoi");
        } else {
            System.out.println("doei");

        }
    }
}
