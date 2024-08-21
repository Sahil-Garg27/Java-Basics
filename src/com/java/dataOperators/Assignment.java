package com.java.dataOperators;

public class Assignment {
    public static void main(String[] args) {
        // Assignment operator
        int a = 10;
        int b = 5;

        System.out.println("Initial values: ");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        // += (Addition assignment operator)
        a += 5;  // equivalent to a = a + 5
        System.out.println("After a += 5, a = " + a);

        // -= (Subtraction assignment operator)
        b -= 2;  // equivalent to b = b - 2
        System.out.println("After b -= 2, b = " + b);

        // *= (Multiplication assignment operator)
        a *= 3;  // equivalent to a = a * 3
        System.out.println("After a *= 3, a = " + a);

        // /= (Division assignment operator)
        b /= 3;  // equivalent to b = b / 3
        System.out.println("After b /= 3, b = " + b);

        // %= (Modulus assignment operator)
        a %= 4;  // equivalent to a = a % 4
        System.out.println("After a %= 4, a = " + a);
    }
}
