package com.java.dataOperators;

public class Identity {
    public static void main(String[] args) {
        String a = new String("Hello");
        String b = new String("Hello");
        System.out.println(a == b);       // false
        System.out.println(a.equals(b));  // true

    }
}
