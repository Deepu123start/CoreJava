package com.company.assignment4;

/**
 * Created by deept on 2/3/2017.
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReverseEachWord {
    public static void main(String[] args) {
        String input="";
        System.out.println("Enter the input string");
        try
        {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            input = br.readLine();
            char[] try1= input.toCharArray();
            for (int i=try1.length-1;i>=0;i--)
                System.out.print(try1[i]);
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }}
