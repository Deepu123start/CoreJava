package com.company.assignment4;

import java.util.Scanner;

/**
 * Created by deept on 2/3/2017.
 */
public class StringLength {
        public static void main(String[] args)
        {
            Scanner input=new Scanner(System.in);
            System.out.print("Enter string: ");
            String st=input.nextLine();
            System.out.println("Length of the string is"+ "\t" +st.length());
        }
    }

