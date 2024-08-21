package com.java.dataOperators;

public class Bitwise {
    public static void main(String[] args) {
        int a = 5; // 0101 in binary
        int b = 3; // 0011 in binary
        System.out.println(a & b); // 1 (0001 in binary)
        System.out.println(a | b); // 7 (0111 in binary)
        System.out.println(a ^ b); // 6 (0110 in binary)
        System.out.println(~a);   // -6 (inverted bits)
        System.out.println(a << 1); // 10 (1010 in binary)
        System.out.println(a >> 1); // 2 (0010 in binary)
    }
}
