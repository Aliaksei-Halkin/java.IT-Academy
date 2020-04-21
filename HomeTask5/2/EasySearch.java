package com.company;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;


public class EasySearch implements ISearchEngine {

        String filePath = "D:/Война и мир.txt";
       // System.out.println( readAllBytesJava7(filePath));
        String a= "вОйНа";
        String b = " и ";
        String c= "мИр";


    public  int search(String text, String word) {
        word = word.toLowerCase();
        text = text.toLowerCase();

        int i = word.indexOf(text);
        int count = 0;
        while (i >= 0) {
            count++;
            i = word.indexOf(text, i + 1);
        }
        return count;
    }

    static String readAllBytesJava7(String filePath) {
        String content = "";

        try {
            content = new String(Files.readAllBytes(Paths.get(filePath)));
        } catch (IOException e) {
            e.printStackTrace();
        }

        return content;

    }


}