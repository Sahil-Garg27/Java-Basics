package com.java.dataStructures;

import java.util.LinkedList;

public class Linkedlist {
    public static void main(String[] args) {
        // Create a LinkedList
        LinkedList<String> linkedList = new LinkedList<>();

        // Add elements to the LinkedList
        linkedList.add("Apple");
        linkedList.add("Banana");
        linkedList.add("Cherry");
        linkedList.add("Date");
        linkedList.add("Elderberry");

        // Print the LinkedList
        System.out.println("Original linkedList: " + linkedList);

        // Get an element at a specific index
        System.out.println("Element at index 2: " + linkedList.get(2)); // Cherry

        // Set (replace) an element at a specific index
        linkedList.set(2, "Blueberry");
        System.out.println("After setting index 2: " + linkedList); // [Apple, Banana, Blueberry, Date, Elderberry]

        // Remove an element by index
        linkedList.remove(3);
        System.out.println("After removing element at index 3: " + linkedList); // [Apple, Banana, Blueberry, Elderberry]

        // Remove an element by value
        linkedList.remove("Banana");
        System.out.println("After removing 'Banana': " + linkedList); // [Apple, Blueberry, Elderberry]

        // Add an element at the beginning
        linkedList.addFirst("Fig");
        System.out.println("After adding 'Fig' at the beginning: " + linkedList); // [Fig, Apple, Blueberry, Elderberry]

        // Add an element at the end
        linkedList.addLast("Grape");
        System.out.println("After adding 'Grape' at the end: " + linkedList); // [Fig, Apple, Blueberry, Elderberry, Grape]

        // Get the first element
        System.out.println("First element: " + linkedList.getFirst()); // Fig

        // Get the last element
        System.out.println("Last element: " + linkedList.getLast()); // Grape

        // Remove and return the first element
        String removedFirst = linkedList.removeFirst();
        System.out.println("Removed first element: " + removedFirst); // Fig
        System.out.println("After removing first element: " + linkedList); // [Apple, Blueberry, Elderberry, Grape]

        // Remove and return the last element
        String removedLast = linkedList.removeLast();
        System.out.println("Removed last element: " + removedLast); // Grape
        System.out.println("After removing last element: " + linkedList); // [Apple, Blueberry, Elderberry]

        // Peek at the first element without removing it
        System.out.println("Peek at first element: " + linkedList.peekFirst()); // Apple

        // Peek at the last element without removing it
        System.out.println("Peek at last element: " + linkedList.peekLast()); // Elderberry

        // Add an element at a specific index
        linkedList.add(1, "Date");
        System.out.println("After adding 'Date' at index 1: " + linkedList); // [Apple, Date, Blueberry, Elderberry]

        // Get the size of the LinkedList
        int size = linkedList.size();
        System.out.println("Size of the linkedList: " + size); // 4

        // Clear all elements from the LinkedList
        linkedList.clear();
        System.out.println("After clearing, linkedList: " + linkedList); // []
    }
}
