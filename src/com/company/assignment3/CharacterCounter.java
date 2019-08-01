package com.company.assignment3;

import java.io.*;
import java.util.Scanner;

public class CharacterCounter {

    private int numberOfChar = 0;

    public  CharacterCounter(File fileName,char userChar) {
        try (Scanner scan = new Scanner(fileName)) {
            while (scan.hasNext()) {
                String letters = scan.nextLine();
                int index = 0;

                while (index<letters.length()){
                    if(letters.charAt(index)==userChar){
                        numberOfChar++;
                    }
                    index++;
                }
            }
            System.out.println("There are "+numberOfChar+" "+ userChar+("'s"));

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


