package com.company.assignment4;

import java.lang.reflect.Array;

/**
 * Created by deept on 2/3/2017.
 */
public class Index {
    public static void main(String[] args) {

        String s = "This is a java class";
        /* index of each Letter*/
        System.out.println("index of each letter in a string");
        for (int i = 0; i < s.length(); i++) {
            int a = s.indexOf(s.charAt(i));
            System.out.println(a + "   " + s.charAt(i));
        }
    /*index of each word*/
        String[] words = s.split(" ");
        System.out.println("Index of each word in a string");
        for (int c = 0; c < Array.getLength(words); c++) {

            int b = s.indexOf(words[c].charAt(0));
            System.out.println(b + " " + words[c]);
        }
        System.out.println("Given string in upper case- " + s.toUpperCase());
        System.out.println("Given string in lower case- " + s.toLowerCase());
    }
}