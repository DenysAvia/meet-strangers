package com.epam.rd.autotasks.meetstrangers;

import java.io.IOException;
import java.util.Scanner;
public class HelloStrangers {
    public static void main(String[] args) throws IOException {
        //Write a program, asks for a number - amount of strangers to meet.
        //Then reads stranger names line by line and prints line by line "Hello, ...".
    Scanner sc = new Scanner(System.in);
    String numStr = sc.nextLine();
     int number = Integer.parseInt(numStr);
     if (number == 0) System.out.println( "Oh, it looks like there is no one here");
         else {if (number < 0) System.out.println ( "Seriously? Why so negative?"); else {


    for (int i=1; i<=number; i++) {
       System.out.println("Hello, " + sc.nextLine());}}
    }
    }
}
