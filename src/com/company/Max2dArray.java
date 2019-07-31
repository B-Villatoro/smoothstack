package com.company;

import java.util.Scanner;

public class Max2dArray {

    public Max2dArray(){



        Scanner scan = new Scanner(System.in);
        //prompts for rows and columns
        System.out.println("I can find the max number in a random 2d array!");
        System.out.println("How many rows would you like to create in your 2d array?");
        int rows = scan.nextInt();
        System.out.println("How many columns would you like?");
        int cols = scan.nextInt();
        System.out.println("Creating your 2d array!\n");

        int[][] userArray = new int[rows][cols];

        for (int i = 0; i < userArray.length; i++) {
            for (int j = 0; j < userArray[i].length; j++) {
                userArray[i][j] = (int)(Math.random()*100);
            }
        }

        int maxNum = userArray[0][0];

        for(int i = 0; i < userArray.length; i++){
            for(int j = 0; j < userArray[i].length;j++){
                if(userArray[i][j] > maxNum){
                    maxNum = userArray[i][j];
                }
                System.out.print(userArray[i][j]+" ");
            }
            System.out.println();
        }//end i for
        System.out.println("\nYour max number is "+maxNum);
    }
}
