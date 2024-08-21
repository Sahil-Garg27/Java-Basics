package com.java.decisionMaking;

public class IfElseExample {
    public static void main(String[] args) {
        // If Statement
        int age = 20;
        if (age >= 18) {
            System.out.println("Adult");
        }

        // If-else Statement
         age = 16;
        if (age >= 18) {
            System.out.println("Adult");
        } else {
            System.out.println("Minor");
        }
//        Nested If-Else

        age = 25;
        boolean hasID = true;
        if (age >= 18) {
            if (hasID) {
                System.out.println("Adult with ID");
            } else {
                System.out.println("Adult without ID");
            }
        } else {
            System.out.println("Minor");
        }

    }
}
