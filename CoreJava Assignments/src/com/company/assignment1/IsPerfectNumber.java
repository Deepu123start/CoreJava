package com.company.assignment1;

import java.util.Scanner;

/**
 * Created by deept on 2/2/2017.
 */
public class IsPerfectNumber {
    public boolean isPerfectNumber(int number){

        int temp = 0;
        for(int i=1;i<=number/2;i++){
            if(number%i == 0){
                temp += i;
            }
        }
        if(temp == number){
            System.out.println("It is a perfect number");
            return true;
        } else {
            System.out.println("It is not a perfect number");
            return false;
        }
    }

    public static void main(String a[]){
        Scanner scan=new Scanner(System.in);
        System.out.println("enter the number");
        IsPerfectNumber ipn = new IsPerfectNumber();
        System.out.println("Is perfect number: "+ipn.isPerfectNumber(scan.nextInt()));
    }

}
