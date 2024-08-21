package com.java.dataStructures;
import java.util.*;
public class TreeMapExample {
    public static void main(String[] args) {
        // Create a TreeMap
        TreeMap<String, Integer> treeMap = new TreeMap<>();

        // Add key-value pairs to the TreeMap
        treeMap.put("Banana", 2);
        treeMap.put("Apple", 1);
        treeMap.put("Cherry", 3);
        treeMap.put("Date", 4);
        treeMap.put("Elderberry", 5);

        // Print the entire TreeMap (keys are sorted in natural order)
        System.out.println("Original TreeMap: " + treeMap); // {Apple=1, Banana=2, Cherry=3, Date=4, Elderberry=5}

        // Get the first (lowest) key
        System.out.println("First key: " + treeMap.firstKey()); // Apple

        // Get the last (highest) key
        System.out.println("Last key: " + treeMap.lastKey()); // Elderberry

        // Get the value associated with a specific key
        System.out.println("Value for key 'Banana': " + treeMap.get("Banana")); // 2

        // Remove a key-value pair from the TreeMap
        treeMap.remove("Date");
        System.out.println("After removing key 'Date': " + treeMap); // {Apple=1, Banana=2, Cherry=3, Elderberry=5}

        // Get a sub-map of elements (from "Banana" inclusive to "Elderberry" exclusive)
        TreeMap<String, Integer> subMap = new TreeMap<>(treeMap.subMap("Banana", "Elderberry"));
        System.out.println("SubMap (Banana to Elderberry): " + subMap); // {Banana=2, Cherry=3}

        // Get a headMap (elements less than "Cherry")
        TreeMap<String, Integer> headMap = new TreeMap<>(treeMap.headMap("Cherry"));
        System.out.println("HeadMap (less than Cherry): " + headMap); // {Apple=1, Banana=2}

        // Get a tailMap (elements greater than or equal to "Cherry")
        TreeMap<String, Integer> tailMap = new TreeMap<>(treeMap.tailMap("Cherry"));
        System.out.println("TailMap (greater than or equal to Cherry): " + tailMap); // {Cherry=3, Elderberry=5}

        // Check if a key exists in the TreeMap
        boolean hasApple = treeMap.containsKey("Apple");
        System.out.println("Contains key 'Apple': " + hasApple); // true

        // Replace the value for a specific key
        treeMap.replace("Cherry", 6);
        System.out.println("After replacing value for 'Cherry': " + treeMap); // {Apple=1, Banana=2, Cherry=6, Elderberry=5}

        // Iterate over the keys in the TreeMap
        System.out.println("Iterating over keys:");
        for (String key : treeMap.keySet()) {
            System.out.println(key);
        }

        // Iterate over the values in the TreeMap
        System.out.println("Iterating over values:");
        for (Integer value : treeMap.values()) {
            System.out.println(value);
        }
    }
}
