package com.company.assignment1;

import java.util.Scanner;

/**
 * Created by deept on 2/2/2017.
 */
public class Palindrome {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the number:");
        int a=scan.nextInt(),reverse,sum=0;
        int temp=a;
        while(a>0){
            reverse=a%10;
            sum=reverse+sum*10;
            a=a/10;
        }
        if(temp==sum){
            System.out.println("palindrome");
        }else{
            System.out.println("Not palindrome");
        }


    }
}
