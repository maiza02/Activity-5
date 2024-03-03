package app;
//Maiza Falcon Rojas
//CST-239
//02/28/2024
//This coded is from Assignment Activity 5 Word Doc Part 2

import java.util.Iterator;
import java.util.Stack;

/**
 * The PlayStack class demonstrates the usage of Java's Stack class
 * with both String and Integer elements. It showcases pushing elements
 * onto the stack, retrieving stack size, accessing specific elements,
 * and iterating through the stack using an Iterator.
 */
public class PlayStack {

    /**
     * The main method serves as the entry point of the program.
     * It demonstrates the usage of a Stack with String and Integer elements,
     * prints information about the Integer stack, and iterates through
     * the String stack using an Iterator.
     *
     * @param args Command line arguments (unused in this example).
     */
    public static void main(String[] args) {

        // Set up a Stack of Strings
        Stack<String> stringStack = new Stack<String>();
        stringStack.push("Mark Reha");
        stringStack.push("Mary Reha");
        stringStack.push("Justine Reha");
        stringStack.push("Brianna Reha");

        // Set up a Stack of Integers
        Stack<Integer> integerStack = new Stack<Integer>();
        integerStack.push(1);
        integerStack.push(-1);
        integerStack.push(5);
        integerStack.push(10);

        // Print out size and second element in the Stack
        System.out.println(integerStack);
        System.out.printf("Integer Stack Tests: size is %d and 2nd element is %d\n",
                integerStack.size(), integerStack.elementAt(1));

        // Use Iterator to get elements from the Stack,
        // could have used a loop over size() and used pop()
        // to achieve the same functionality
        Iterator<String> itr = stringStack.iterator();
        while (itr.hasNext()) {
            System.out.println(stringStack.pop());
        }
    }
}