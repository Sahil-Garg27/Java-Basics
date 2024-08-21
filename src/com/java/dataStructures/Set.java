package com.java.dataStructures;
import java.util.HashSet;
public class Set {
    public static void main(String[] args) {
        // Create a HashSet
        HashSet<String> set = new HashSet<>();

        // Add elements to the HashSet
        set.add("Apple");
        set.add("Banana");
        set.add("Cherry");
        set.add("Date");
        set.add("Elderberry");

        // Print the HashSet
        System.out.println("Original HashSet: " + set);

        // Check if the HashSet contains a specific element
        boolean containsApple = set.contains("Apple");
        System.out.println("Contains 'Apple': " + containsApple); // true

        // Remove an element from the HashSet
        set.remove("Date");
        System.out.println("After removing 'Date': " + set);

        // Check if the HashSet is empty
        boolean isEmpty = set.isEmpty();
        System.out.println("Is the HashSet empty? " + isEmpty);

        // Get the size of the HashSet
        int size = set.size();
        System.out.println("Size of the HashSet: " + size); // 4

        // Add all elements from another collection
        HashSet<String> anotherSet = new HashSet<>();
        anotherSet.add("Fig");
        anotherSet.add("Grape");
        set.addAll(anotherSet);
        System.out.println("After adding all elements from anotherSet: " + set); // [Apple, Banana, Cherry, Elderberry, Fig, Grape]

        // Remove all elements from another collection
        set.removeAll(anotherSet);
        System.out.println("After removing all elements from anotherSet: " + set); // [Apple, Banana, Cherry, Elderberry]

        // Retain only the elements that are contained in another collection
        HashSet<String> commonSet = new HashSet<>();
        commonSet.add("Banana");
        commonSet.add("Cherry");
        set.retainAll(commonSet);
        System.out.println("After retaining only common elements with commonSet: " + set); // [Banana, Cherry]

        // Clear all elements from the HashSet
        set.clear();
        System.out.println("After clearing, HashSet: " + set); // []
    }
}
