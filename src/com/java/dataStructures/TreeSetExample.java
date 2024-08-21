package com.java.dataStructures;
import java.util.TreeSet;
public class TreeSetExample {
    public static void main(String[] args) {
        // Create a TreeSet
        TreeSet<String> treeSet = new TreeSet<>();

        // Add elements to the TreeSet
        treeSet.add("Banana");
        treeSet.add("Apple");
        treeSet.add("Cherry");
        treeSet.add("Date");
        treeSet.add("Elderberry");

        // Print the TreeSet (elements are sorted in natural order)
        System.out.println("Original TreeSet: " + treeSet); // [Apple, Banana, Cherry, Date, Elderberry]

        // Get the first (lowest) element
        System.out.println("First element: " + treeSet.first()); // Apple

        // Get the last (highest) element
        System.out.println("Last element: " + treeSet.last()); // Elderberry

        // Get a subset of elements (from "Banana" inclusive to "Date" exclusive)
        TreeSet<String> subSet = new TreeSet<>(treeSet.subSet("Banana", "Date"));
        System.out.println("SubSet (Banana to Date): " + subSet); // [Banana, Cherry]

        // Get a headSet (elements less than "Cherry")
        TreeSet<String> headSet = new TreeSet<>(treeSet.headSet("Cherry"));
        System.out.println("HeadSet (less than Cherry): " + headSet); // [Apple, Banana]

        // Get a tailSet (elements greater than or equal to "Cherry")
        TreeSet<String> tailSet = new TreeSet<>(treeSet.tailSet("Cherry"));
        System.out.println("TailSet (greater than or equal to Cherry): " + tailSet); // [Cherry, Date, Elderberry]

        // Remove a specific element
        treeSet.remove("Banana");
        System.out.println("After removing 'Banana': " + treeSet); // [Apple, Cherry, Date, Elderberry]

        // Check if the TreeSet contains a specific element
        boolean containsApple = treeSet.contains("Apple");
        System.out.println("Contains 'Apple': " + containsApple); // true

        // Get the size of the TreeSet
        int size = treeSet.size();
        System.out.println("Size of the TreeSet: " + size); // 4

        // Iterate through the elements in the TreeSet
        System.out.println("Iterating through TreeSet:");
        for (String fruit : treeSet) {
            System.out.println(fruit);
        }

        // Clear all elements from the TreeSet
        treeSet.clear();
        System.out.println("After clearing, TreeSet: " + treeSet); // []
            }
        }

