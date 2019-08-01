package com.company.assignment3;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.stream.Stream;

public class FileManager {
    Scanner scan = new Scanner(System.in);

    public FileManager() {

//        System.out.println("Type in the path you would like to list");
//        String path = scan.nextLine();
//        printDirectory(path);
//        printDirectory("C:\\Program Files\\Java\\jdk1.8.0_221");

//        File testFile = new File("testFile.txt");
//        appendFile(testFile, "Add this!");
    }

    public void printDirectory(String url) {
        Path path = Paths.get(url);
        try (Stream<Path> subPath = Files.walk(path, 1)) {
            subPath.forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void appendFile(java.io.File fileName, String appendToFile) {
        try (FileWriter write = new FileWriter(fileName, true)) {
            BufferedWriter buffer = new BufferedWriter(write);
            PrintWriter writer = new PrintWriter(buffer);

            if (fileName.exists() == false) {
                fileName.createNewFile();
                System.out.println("The file has been created");

            } else {
                System.out.println("File already exists");
            }

            writer.print(appendToFile);
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void charCounter(char letter){

    }
}
