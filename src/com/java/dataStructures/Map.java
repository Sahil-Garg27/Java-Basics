package com.java.dataStructures;
import java.util.HashMap;

public class Map {
    public static void main(String[] args) {
        // Create a HashMap
        HashMap<String, Integer> map = new HashMap<>();

        // Add key-value pairs to the HashMap
        map.put("Apple", 1);
        map.put("Banana", 2);
        map.put("Cherry", 3);
        map.put("Date", 4);

        // Print the entire HashMap
        System.out.println("Original HashMap: " + map); // {Apple=1, Banana=2, Cherry=3, Date=4}

        // Get the value associated with a specific key
        System.out.println("Value for key 'Apple': " + map.get("Apple")); // 1

        // Check if a key exists in the HashMap
        boolean hasBanana = map.containsKey("Banana");
        System.out.println("Contains key 'Banana': " + hasBanana); // true

        // Check if a value exists in the HashMap
        boolean hasValue3 = map.containsValue(3);
        System.out.println("Contains value 3: " + hasValue3); // true

        // Remove a key-value pair from the HashMap
        map.remove("Date");
        System.out.println("After removing key 'Date': " + map); // {Apple=1, Banana=2, Cherry=3}

        // Replace the value for a specific key
        map.replace("Cherry", 5);
        System.out.println("After replacing value for 'Cherry': " + map); // {Apple=1, Banana=2, Cherry=5}

        // Get the size of the HashMap
        int size = map.size();
        System.out.println("Size of the HashMap: " + size); // 3

        // Iterate over the keys in the HashMap
        System.out.println("Iterating over keys:");
        for (String key : map.keySet()) {
            System.out.println(key);
        }

        // Iterate over the values in the HashMap
        System.out.println("Iterating over values:");
        for (Integer value : map.values()) {
            System.out.println(value);
        }

        // Clear all key-value pairs from the HashMap
        map.clear();
        System.out.println("After clearing, HashMap: " + map); // {}
    }
}
