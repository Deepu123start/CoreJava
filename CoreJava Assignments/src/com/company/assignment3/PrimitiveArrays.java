package com.company.assignment3;

import java.util.Scanner;

/**
 * Created by deept on 2/3/2017.
 */
public class PrimitiveArrays {
    private static Scanner scan =new Scanner(System.in);
    public static void main(String[] args) {
      System.out.println("Enter Number of students");
        int[] numofstudents=new int[scan.nextInt()];
        int[] id=new int[numofstudents.length];
        String[] name=new String[numofstudents.length];
        double[] fee= new double[numofstudents.length];
         String[] section= new String[numofstudents.length];
        for (int i = 0; i < numofstudents.length; i++) {
            System.out.println("Enter Student " + (i + 1) + "id");
            id[i] = scan.nextInt();
            System.out.println("Enter Student" + (i + 1) + "name");
            name[i] = scan.next();
            System.out.println("Enter Student" + (i + 1) + "fee");
            fee[i] = scan.nextDouble();
            System.out.println("Enter Student" + (i + 1) + "section");
            section[i] = scan.next();

        }
        System.out.println("id"+"\t"+"name"+"\t"+"fee"+"\t"+"section"+"\n");
        for (int i = 0; i < numofstudents.length; i++) {
            System.out.println(id[i]+"\t"+name[i]+"\t"+fee[i]+"\t"+section[i]);
        }

    }
}
