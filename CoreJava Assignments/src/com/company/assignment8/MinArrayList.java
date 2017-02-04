package com.company.assignment8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * Created by deept on 2/4/2017.
 */
public class MinArrayList {
       public static void main(String[] args) {
           Scanner scan=new Scanner(System.in);

    //create an ArrayList object
     ArrayList arrayList = new ArrayList();

 //Add elements to Arraylist
    arrayList.add(scan.nextInt());
    arrayList.add(scan.nextInt());
    arrayList.add(scan.nextInt());
    arrayList.add(scan.nextInt());
    arrayList.add(scan.nextInt());
    arrayList.add(scan.nextInt());


 /*
       To find minimum element of Java ArrayList use,
       static Object min(Collection c) method of Collections class.
     
       This method returns the minimum element of Java ArrayList according to
       its natural ordering.
    */

     Object obj = Collections.min(arrayList);
     System.out.println("Minimum Element of Java ArrayList is : " + obj);
     }
    }
