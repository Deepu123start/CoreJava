package com.company.assignment2;

/**
 * Created by deept on 2/4/2017.
 */
public class Problem3 {

    public static void main(String[] args) {
        Block b = new Block(){
            public void type() {
                System.out.println("this is interface block");
                System.out.println(Block.method());
            }
            {
                System.out.println("this is instance block");
            }
        };
        b.type();
    }
    interface Block{
        static String method(){
            return "this is static block";
        }
        void type();
    }
}
