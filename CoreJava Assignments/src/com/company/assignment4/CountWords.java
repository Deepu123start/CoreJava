package com.company.assignment4;

import java.util.Scanner;

/**
 * Created by deept on 2/3/2017.
 */

public class CountWords{
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in)   ;
        System.out.print("Enter string: ");
        String st=input.nextLine();
        int count=0;
        String arr[]=st.split(" ");
        System.out.println("Number of words are: "+arr.length);
    }
}