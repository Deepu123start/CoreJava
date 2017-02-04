package com.company.assignment2;

/**
 * Created by deept on 2/4/2017.
 */
public class Problem5 {

    public static void main(String[] args) {
        Test t = new Test();
    }

}

class Test{
    static{
        System.out.println("this is static method");
    }

    {
        System.out.println("Audi");
    }
    Test(){
        System.out.println("This is Constructor block");
    }
}