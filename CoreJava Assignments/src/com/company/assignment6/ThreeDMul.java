package com.company.assignment6;

import java.util.Scanner;

/**
 * Created by deept on 2/2/2017.
 */
public class ThreeDMul {
    public static void main(String args[])
    {
        int n, c1,c2;
        System.out.println("Enter an integer to print it's multiplication table");
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        System.out.println("Multiplication table of "+n+" is :-");

        for ( c1 = 1 ; c1 <= 10 ; c1++ ){
            for(c2=1;c2<=10;c2++){
                System.out.println(n+"*"+c1+"*"+c2+" = "+(n*c1*c2));
            }
        }

    }
}
