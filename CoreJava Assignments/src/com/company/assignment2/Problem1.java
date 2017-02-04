package com.company.assignment2;

/**
 * Created by deept on 2/4/2017.
 */

import java.util.Scanner;

public class Problem1 {

    public static void main(String[] args) {
        A a = new A();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first name");
        String f = sc.nextLine();
        System.out.println("Enter last name");
        String l = sc.nextLine();
        a.name(f, l);
        sc.close();
    }

}
interface MyName{
    void name(String first, String last);
}

interface PName{
    void name(String first, String last);
}

class A implements MyName, PName{
    public void name(String first, String last){
        System.out.println("First Name:" +first+" Last Name:"+last);
    }

}