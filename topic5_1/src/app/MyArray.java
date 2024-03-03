package app;
//Maiza Falcon Rojas
//CST-239
//02/28/2024
//This coded is from Assignment Activity 5 Word Doc Part 1

/**
 * The MyArray class contains a generic method {@code printArray} that
 * iterates over an array and prints each element. The main method
 * demonstrates the usage of this class with arrays of different types
 * (Integer, Double, Character).
 */
public class MyArray {

    /**
     * Prints the elements of the input array.
     *
     * @param inputArray The array containing elements of type E.
     * @param <E>        The generic type of the array elements.
     */
    public <E> void printArray(E[] inputArray) {
        // Iterate over the array and print each element
        for (E element : inputArray) {
            System.out.printf("%s ", element);
        }
    }

    /**
     * The main method serves as the entry point of the program.
     * It creates arrays of Integer, Double, and Character types and
     * uses the {@code printArray} method to print the elements.
     *
     * @param args Command line arguments (unused in this example).
     */
    public static void main(String[] args) {

        // Create arrays of Integer, Double, and Character
        Integer[] intArray = {1, 2, 3, 4, 5};
        Double[] doubleArray = {1.1, 2.2, 3.3, 4.4};
        Character[] charArray = {'H', 'E', 'L', 'L', 'O'};

        // Print each array out
        MyArray ma = new MyArray();
        System.out.println("Array integerArray contains:");
        ma.printArray(intArray); // pass an Integer array
        System.out.println("\nArray doubleArray contains:");
        ma.printArray(doubleArray); // pass a double array
        System.out.println("\nArray characterArray contains:");
        ma.printArray(charArray);   // pass a Character array
    }
}
