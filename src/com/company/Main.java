package com.company;

import java.util.Scanner;


public class Main {

    int i,j,k,choice,rows;
    Scanner Uinput;

    public Main(){
        Uinput = new Scanner(System.in);
        System.out.println("How Would You Like to sort?\n" +
                "Half Pyramid(1), Upside Down Half Pyramid(2), Pyramid(3), or Upside Down Pyramid(4)?");
        choice = Uinput.nextInt();


        switch (choice){
            case 1:
                System.out.println("How many rows would you like?");
                rows = Uinput.nextInt();
                for(i = 0; i < rows;i++){
                    for(j=0; j<=i;j++){
                        System.out.print("*");
                    }
                    System.out.print("\n");
                }
                break;

            case 2:
                System.out.println("How many rows would you like?");
                rows = Uinput.nextInt();
                for(i = 0; i < rows;i++){

                    for(j=rows;j>i;j--){
                        System.out.print("*");
                    }

                    System.out.print("\n");
                }
                break;

            case 3:
                System.out.println("How many rows would you like?");
                rows = Uinput.nextInt();
                for(i = 0; i < rows;i++){

                    for(j=i;j<=rows;j++){
                        System.out.print(" ");
                    }
                    for(k=0; k<=i*2;k++){
                        System.out.print("*");
                    }
                    System.out.print("\n");
                }
                break;
            case 4:
                System.out.println("How many rows would you like?");
                rows = Uinput.nextInt();
                for(i = rows; i >= 0;i--) {
                    for (j = 0; j < rows -i; j++) {
                        System.out.print(" ");
                    }
                    for (k = 0; k <(i*2)-1; k++) {
                        System.out.print("*");
                    }

                    System.out.print("\n");
                }
                break;

            default:
                System.out.println("enter correct option");
                break;
        }
    }
    public static void main(String[] args) {
        Main runMain = new Main();


    }
}
