package com.java.dataStructures;

import java.util.ArrayList;

public class List {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        // Add elements to the ArrayList
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        list.add("Date");
        list.add("Elderberry");

        // Print the ArrayList
        System.out.println("Original list: " + list);

        // Get an element at a specific index
        System.out.println("Element at index 2: " + list.get(2)); // Cherry

        // Set (replace) an element at a specific index
        list.set(2, "Blueberry");
        System.out.println("After setting index 2: " + list); // [Apple, Banana, Blueberry, Date, Elderberry]

        // Remove an element by index
        list.remove(3);
        System.out.println("After removing element at index 3: " + list); // [Apple, Banana, Blueberry, Elderberry]

        // Remove an element by value
        list.remove("Banana");
        System.out.println("After removing 'Banana': " + list); // [Apple, Blueberry, Elderberry]

        // Check if the list contains a specific element
        boolean hasBlueberry = list.contains("Blueberry");
        System.out.println("Contains 'Blueberry': " + hasBlueberry); // true

        // Get the size of the ArrayList
        int size = list.size();
        System.out.println("Size of the list: " + size); // 3

        // Clear all elements from the ArrayList
        list.clear();
        System.out.println("After clearing, list: " + list); // []


        // Get a sublist from the ArrayList
        ArrayList<String> subList = new ArrayList<>(list.subList(0, 1));
        System.out.println("Sublist (0 to 1): " + subList); // [Fig]
    }
}
