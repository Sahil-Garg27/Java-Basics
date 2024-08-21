package com.java.inputOutput;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class BufferIO {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader((System.in)));
        try {
            System.out.println("Enter your age --> ");
            int age = Integer.parseInt(reader.readLine());
            System.out.println("You are " + age + " years old.");
        } catch (NumberFormatException e) {
            System.out.println("Invalid input! Please enter a valid integer.");
        } catch (IOException e) {
            System.out.println("An error occurred while reading the input.");
        } finally {
            System.out.println("Operation finished");
        }
    }
}
