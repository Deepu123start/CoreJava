package com.company.assignment4;

/**
 * Created by deept on 2/3/2017.
 */
public class LetterAtCenter {
    public static void letterAtCenter(String s){
        if(s.length()%2==0){
            System.out.println("Letter at the center is " +s.charAt((s.length()/2)));
        }
        else {
            System.out.println("Letter at the center is" +s.charAt((s.length()/2)+1));
        }
    }
    public static void main(String[] args){
        String s="This is a Java class";
        letterAtCenter(s);
        System.out.println("Index of J is "+ s.indexOf('J'));
    }
}
