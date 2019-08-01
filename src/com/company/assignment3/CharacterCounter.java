package com.company.assignment3;

import java.io.*;

public class CharacterCounter {
    public CharacterCounter(char letter){
        try(FileInputStream file = new FileInputStream("testFile.txt")){
            BufferedReader read = new BufferedReader(new FileReader("testFile.txt"));
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
