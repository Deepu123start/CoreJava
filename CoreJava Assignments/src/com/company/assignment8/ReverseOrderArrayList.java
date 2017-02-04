package com.company.assignment8;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by deept on 2/4/2017.
 */
public class ReverseOrderArrayList {
    public static void main(String[] args) {
     ArrayList arrayList = new ArrayList();

     arrayList.add("A");
     arrayList.add("B");
    arrayList.add("C");
    arrayList.add("D");
    arrayList.add("E");

    System.out.println("Before Reverse Order, ArrayList Contains : " + arrayList);
        Collections.reverse(arrayList);
        System.out.println("After Reverse Order, ArrayList Contains : " + arrayList);

    }
}
