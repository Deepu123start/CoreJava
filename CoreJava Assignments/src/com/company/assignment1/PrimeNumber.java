package com.company.assignment1;

import java.util.Scanner;

/**
 * Created by deept on 2/2/2017.
 */
public class PrimeNumber {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the Number:");
        System.out.println("Is the number prime?"+ " " +isPrime(scan.nextInt()));
    }
    public static boolean isPrime(int n){
        if(n%2==0){
            return false;
        }
        for (int i=3;i<=n;i++){
            if(n%i==0){
                return false;
            }else {
                return true;
            }
        }
        return true;

    }
    }
