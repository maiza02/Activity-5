package app;
//Maiza Falcon Rojas
//CST-239
//02/28/2024
//This coded is from Assignment Activity 5 Word Doc Part 1

/**
 * The MyNumberArray class contains a generic method {@code printArray}
 * that iterates over an array and prints each element. The type parameter
 * E is restricted to subclasses of the Number class using the bounds
 * {@code <E extends Number>}. The main method demonstrates the usage of
 * this class with arrays of different types (Integer, Double, Float),
 * all extending the Number class.
 */
public class MyNumberArray {

    /**
     * Prints the elements of the input array.
     *
     * @param inputArray The array containing elements of type E.
     * @param <E>        The generic type of the array elements, restricted to subclasses of Number.
     */
    public <E extends Number> void printArray(E[] inputArray) {
        // Iterate over the array and print each element
        for (E element : inputArray) {
            System.out.printf("%s ", element);
        }
    }

    /**
     * The main method serves as the entry point of the program.
     * It creates arrays of Integer, Double, and Float types, all
     * extending the Number class, and uses the {@code printArray}
     * method to print the elements.
     *
     * @param args Command line arguments (unused in this example).
     */
    public static void main(String[] args) {

        // Create arrays of Integer, Double, and Float
        Integer[] intArray = {1, 2, 3, 4, 5};
        Double[] doubleArray = {1.1, 2.2, 3.3, 4.4};
        Float[] floatArray = {0.0f, 1.0f, 2.5f, 3.5f};

        // Print each array out
        MyNumberArray mna = new MyNumberArray();
        System.out.println("Array integerArray contains:");
        mna.printArray(intArray); // pass an Integer array
        System.out.println("\nArray doubleArray contains:");
        mna.printArray(doubleArray); // pass a double array
        System.out.println("\nArray floatArray contains:");
        mna.printArray(floatArray);   // pass a Float array
    }
}
