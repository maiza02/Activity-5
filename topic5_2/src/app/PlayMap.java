package app;
//Maiza Falcon Rojas
//CST-239
//02/28/2024
//This coded is from Assignment Activity 5 Word Doc Part 2

import java.util.HashMap;
import java.util.Map; 

/**
 * The PlayMap class demonstrates the usage of Java's Map interface with
 * various implementations (HashMap). It creates maps with different key-value
 * pairs (integers, strings) and performs operations such as adding entries,
 * retrieving values, checking size and emptiness, and iterating through entries.
 */
public class PlayMap {

    /**
     * The main method serves as the entry point of the program.
     * It demonstrates the usage of maps with different key-value pairs,
     * performs operations on them, and prints relevant information.
     *
     * @param args Command line arguments (unused in this example).
     */
    public static void main(String[] args) {

        // Create a Map of integers keyed by integers
        Map<Integer, Integer> integerMap = new HashMap<Integer, Integer>();
        integerMap.put(1, 1);
        integerMap.put(2, 2);

        // Create a Map of Strings keyed by Integers
        Map<Integer, String> stringMap = new HashMap<Integer, String>();
        stringMap.put(1, "One");
        stringMap.put(2, "Two");

        // Create a Map of Strings keyed by Strings
        Map<String, String> nameMap = new HashMap<String, String>();
        nameMap.put("FirstName", "Mark");
        nameMap.put("LastName", "Reha");

        // Print out size and if a Map is empty
        System.out.printf("Name Map Tests: size is %d and is empty %b\n", nameMap.size(), nameMap.isEmpty());

        // Use a For Loop to loop over the Keys to retrieve each Map Value
        for (Map.Entry<String, String> entry : nameMap.entrySet()) {
            System.out.printf("Key %s Value: %s\n", entry.getKey(), entry.getValue());
        }

        // Clear maps
        integerMap.clear();
        stringMap.remove(1);
        stringMap.clear();
        nameMap.clear();
    }
}
