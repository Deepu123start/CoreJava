package com.company.assignment1;

import java.util.Scanner;

/**
 * Created by deept on 2/2/2017.
 */
public class Fibonacci {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the Number:");
        int n1=0,n2=1;
        int n3,i,count=scan.nextInt();
        System.out.print(n1+" "+n2);

        for(i=2;i<count;++i)
        {
            n3=n1+n2;
            System.out.print(" "+n3);
            n1=n2;
            n2=n3;
        }
    }
}
