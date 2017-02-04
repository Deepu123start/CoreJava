package com.company.assignment7;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by deept on 2/3/2017.
 */
public class WriteToFile {

    private static String filepath = "C:\\Users\\deept\\Desktop\\Java Assignments\\src\\com\\company\\assignment7\\words.txt";

        public static void main(String[] args) {
            try {

                String content = "Java is the best Object oriented programming language!";

                BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(filepath));
                bufferedWriter.write(content);
                bufferedWriter.close();
                System.out.println("The file was successfully updated");
            } catch (IOException e) {
                e.printStackTrace();
            }

        }


    }
