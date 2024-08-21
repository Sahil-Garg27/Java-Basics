package com.java.looping;

public class LoopingExamples {
    public static void main(String[] args) {

        // For Loop
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }

        // While Loop
        int j = 0;
        while (j < 5) {
            System.out.println(j);
            j++;
        }

        //Enhanced For-each Loop
        int[] numbers = {1, 2, 3, 4, 5};
        for (int number : numbers) {
            System.out.println(number);
        }

//        Break and Continue
//        Break: Exits the loop.
        for (int i = 0; i < 5; i++) {
            if (i == 3) break;
            System.out.println(i);
        }
//        Continue: Skips the current iteration.
        for (int i = 0; i < 5; i++) {
            if (i == 3) continue;
            System.out.println(i);
        }
//        Pass Equivalent in Java
//        Java does not have a pass keyword, but you can use empty blocks {} or comments.

        boolean condition = true;
        if (condition) {
            // pass equivalent
        } else {
            // do something
        }

    }
}
