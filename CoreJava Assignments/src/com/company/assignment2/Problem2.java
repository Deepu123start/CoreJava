package com.company.assignment2;

import java.util.Scanner;

/**
 * Created by deept on 2/4/2017.
 */
public class Problem2 {

    public static void main(String[] args) {
        B b = new B();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first name");
        String f = sc.nextLine();
        System.out.println("Enter last name");
        String l = sc.nextLine();
        b.name(f, l);
        D c = new D();
        c.name(f,l);
        sc.close();
    }

}
interface MyName1{
    void name(String first, String last);
}

interface PName1{
    int name(String first, String last);
}

class B implements MyName1{
    public void name(String first, String last){
        System.out.println("First Name:" +first+" Last Name:"+last);
    }

}
class D implements PName1{
    public int name(String first, String last){
        System.out.println("First Name:" +first+" Last Name:"+last);
        return 0;
    }
}

