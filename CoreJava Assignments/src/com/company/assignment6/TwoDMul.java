package com.company.assignment6;

import java.util.Scanner;

/**
 * Created by deept on 2/2/2017.
 */
public class TwoDMul {
    public static void main(String args[])
    {
        int n, c;
        System.out.println("Enter an integer to print it's multiplication table");
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        System.out.println("Multiplication table of "+n+" is :-");

        for ( c = 1 ; c <= 10 ; c++ )
            System.out.println(n+"*"+c+" = "+(n*c));
    }
}
