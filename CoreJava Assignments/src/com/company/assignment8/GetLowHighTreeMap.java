package com.company.assignment8;

import java.util.TreeMap;

/**
 * Created by deept on 2/4/2017.
 */
public class GetLowHighTreeMap {
     public static void main(String[] args) {
    TreeMap treeMap = new TreeMap();

     treeMap.put("1","One");
     treeMap.put("3","Three");
     treeMap.put("2","Two");
     treeMap.put("5","Five");
     treeMap.put("4","Four");

     System.out.println("Lowest key Stored in Java TreeMap is : " + treeMap.firstKey());
     System.out.println("Highest key Stored in Java TreeMap is : "+ treeMap.lastKey());

    }
}
