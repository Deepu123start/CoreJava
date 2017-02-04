package com.company.assignment7;

import java.io.*;

/**
 * Created by deept on 2/4/2017.
 */

public class ReplaceText
{
    public static void main(String args[])
    {
        try
        {
            File file = new File("C:\\Users\\deept\\Desktop\\Java Assignments\\src\\com\\company\\assignment7\\words.txt");
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String line = "", oldtext = "Java is the best Object oriented programming language!";
            while((line = reader.readLine()) != null)
            {
                oldtext += line + "\r\n";
            }
            reader.close();
            // replace a word in a file
            //String newtext = oldtext.replaceAll("drink", "Love");

            //To replace a line in a file
            String newtext = oldtext.replaceAll("This is test string 20000", "blah blah blah");

            FileWriter writer = new FileWriter("C:\\Users\\deept\\Desktop\\Java Assignments\\src\\com\\company\\assignment7\\words.txt");
            writer.write(newtext);
            writer.close();
        }
        catch (IOException ioe)
        {
            ioe.printStackTrace();
        }
    }
}