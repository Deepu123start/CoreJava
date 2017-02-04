package com.company.assignment1;

import java.util.Scanner;

/**
 * Created by deept on 2/2/2017.
 */
public class MinNumbers {
    public static void main(String[] args){

        Scanner scan= new Scanner(System.in);
        System.out.println("Enter 4 Numbers:");
        int a=scan.nextInt();
        int b=scan.nextInt();
        int c=scan.nextInt();
        int d=scan.nextInt();
        if(a<b && a<c && a<d){
            System.out.println(a + "is the minimum");
        }else if(b<c && b<d){
            System.out.println(b + "is the minimum");
        }else if(c<d){
            System.out.println(c + "is the minimum");
        }else{
            System.out.println(d + "is the minimum");
        }



    }
}
