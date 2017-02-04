package com.company.assignment8;

import java.util.Collections;
import java.util.HashSet;

/**
 * Created by deept on 2/4/2017.
 */
public class MinHashSet {
    public static void main(String[] args) {
 //create a HashSet object
     HashSet hashSet = new HashSet();
    //Add elements to HashSet
     hashSet.add(new Long("923740927"));
     hashSet.add(new Long("4298748382"));
     hashSet.add(new Long("2374324832"));
     hashSet.add(new Long("2473483643"));
     hashSet.add(new Long("32987432984"));

 /*
       To find minimum element of Java HashSet use,
       static Object min(Collection c) method of Collections class.
     
       This method returns the minimum element of Java HashSet according to
       its natural ordering.
    */
     Object obj = Collections.min(hashSet);
        System.out.println("Minimum Element of Java HashSet is : " + obj);
  }
    }

