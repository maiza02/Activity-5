package app;
//Maiza Falcon Rojas
//CST-239
//02/28/2024
//This coded is from Assignment Activity 5 Word Doc Part 2
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * The PlayList class demonstrates the usage of Java's List interface with
 * ArrayList implementation. It creates lists with different element types
 * (integers, strings), adds elements, retrieves elements by index, and iterates
 * through the lists using both a for-each loop and an Iterator.
 */
public class PlayList {

    /**
     * The main method serves as the entry point of the program.
     * It demonstrates the usage of lists with different element types,
     * adds elements, retrieves elements by index, and iterates through
     * the lists using both a for-each loop and an Iterator.
     *
     * @param args Command line arguments (unused in this example).
     */
    public static void main(String[] args) {

        // Create a List of Integers and add elements using add()
        List<Integer> integerList = new ArrayList<Integer>();
        integerList.add(Integer.valueOf(10));
        integerList.add(Integer.valueOf(11));

        // Create a List of Strings and add elements using add()
        List<String> stringList = new ArrayList<String>();
        stringList.add("Hello World");
        stringList.add("Hi World");

        // Get the first element from the List using get()
        System.out.printf("Integer Value: %d\n", integerList.get(0));
        System.out.printf("String Value: %s\n", stringList.get(0));

        // Loop over the List using a For loop
        for (Integer data : integerList) {
            System.out.printf("Integer Value: %d\n", data);
        }

        // Loop over the list using an Iterator
        Iterator<String> stringIterator = stringList.iterator();
        while (stringIterator.hasNext()) {
            System.out.printf("String Value: %s\n", stringIterator.next());
        }
    }
}
