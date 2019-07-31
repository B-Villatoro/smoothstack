package com.company;

import java.util.Scanner;

public class CommandLineAddition {

    CommandLineAddition(){
        Scanner scan = new Scanner(System.in);//initiate scanner

        //prompt for array size and initiate
        System.out.println("How many numbers would you like to add?");
        int arraySize = scan.nextInt();
        int[] numArray = new int[arraySize];

        //prompt for variables
        System.out.println("What numbers would you like to add?");
        for(int i=0;i<arraySize;i++) {
            numArray[i] = scan.nextInt();
            System.out.println("Please enter your next number!");
        }
        add(numArray);
    }

    public void add(int ... a){
        int total = 0;
        for(int i : a){
            total += i;
        }
        System.out.println("Your answer is " + total+"!");
    }
}
