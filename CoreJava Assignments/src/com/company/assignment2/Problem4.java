package com.company.assignment2;

/**
 * Created by deept on 2/4/2017.
 */
public class Problem4 {

    public static void main(String[] args) {
        Simple si = new Simple(){
            void car(){
                System.out.println("Porsche");
            }
        };
        si.car();
    }

}

abstract class Simple{
    static{
        System.out.println("this is static method");
    }
    {
        System.out.println("This is instance block");
    }
    abstract void car();
}