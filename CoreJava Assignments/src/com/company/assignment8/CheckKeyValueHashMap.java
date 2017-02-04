package com.company.assignment8;

import java.util.HashMap;

/**
 * Created by deept on 2/4/2017.
 */
public class CheckKeyValueHashMap {
    public static void main(String[] args) {
 //create HashMap object
     HashMap hMap = new HashMap();
     hMap.put("1","One");
     hMap.put("2","Two");
    hMap.put("3","Three");
    boolean blnExists = hMap.containsKey("30");
    boolean bln= hMap.containsValue("One");
    System.out.println("30 exists in HashMap ? : " + blnExists);
    System.out.println("Does One Exists?"+bln);
    }
}
