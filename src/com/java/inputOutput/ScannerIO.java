package com.java.inputOutput;
import java.util.Scanner;
public class ScannerIO {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        // here we took the input with the help of Scanner
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your name: ");
        String name = sc.nextLine();
        // here we are showing the output the input we took above
        System.out.println("Hello " + name);
    }
}
