package com.company.assignment1;

import java.util.Scanner;

/**
 * Created by deept on 2/2/2017.
 */
public class ReverseNum {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the number:");
        int i=scan.nextInt(), reverse=0;
        while(i!=0){
            reverse= reverse*10;
            reverse=reverse+i%10;
            i=i/10;
        }
        System.out.println("The reverse of the number"+ " " +reverse);

    }
}
