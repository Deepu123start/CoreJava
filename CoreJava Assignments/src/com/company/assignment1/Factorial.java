package com.company.assignment1;

import java.util.Scanner;

/**
 * Created by deept on 2/2/2017.
 */
public class Factorial {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the number:");
        int n=scan.nextInt();
        int result=1;
        for(int i=1;i<=n;i++){
            result=result*i;
        }
        System.out.println("The factorial of "+ n + " is "+ result);

    }
}
