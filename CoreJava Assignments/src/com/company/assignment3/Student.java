package com.company.assignment3;

import java.util.Scanner;

/**
 * Created by deept on 2/3/2017.
 */
public class Student {
    private static Scanner scan =new Scanner(System.in);
    private int id;
    private String name;
    private double fee;
    private String section;
    // private int[] student=new int[scan.nextInt()];

    public Student(int id,String name,double fee,String section) {
        this.id = id;
        this.name = name;
        this.fee = fee;
        this.section = section;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getFee() {
        return fee;
    }

    public String getSection() {
        return section;
    }

    public static Student Stdmtd(int[] id,String[] name,double[] fee,String[] section ){
        System.out.println("Enter Number of students");
        int[] students=new int[scan.nextInt()];
        id=new int[students.length];
        name=new String[students.length];
        fee= new double[students.length];
        section= new String[students.length];
        for (int i = 0; i < students.length; i++) {
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
        for (int i = 0; i < students.length; i++) {
            System.out.println(id[i]+"\t"+name[i]+"\t"+fee[i]+"\t"+section[i]);
        }
        return new Student(1,"Deepthi",50.6,"a");

    }

}
