package com.company;

import com.company.assignment3.CharacterCounter;
import com.company.assignment3.FileManager;
import com.company.interfaceShapes.Triangle;
import com.company.interfaceShapes.iShapes;

import java.io.File;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
//        StarPattern runStars = new StarPattern();

//        int a = Integer.parseInt(args[0]);
//        int b = Integer.parseInt(args[1]);
//        int c = Integer.parseInt(args[2]);
//        CommandLineAddition addNums = new CommandLineAddition(a,b,c);

//        Max2dArray findMax = new Max2dArray();

//        iShapes tritri = new Triangle(24,26,27);
//        tritri.calculateArea();
//        tritri.display();

        File testFile = new File("testFile.txt");

        FileManager files = new FileManager();

        files.appendFile(testFile,"hello people");
        new CharacterCounter(testFile,'d');
//        files.createFile(testFile);

    }
}
