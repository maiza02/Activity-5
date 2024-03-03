package app;
//Maiza Falcon Rojas
//CST-239
//02/28/2024
//This coded is from Assignment Activity 5 Word Doc Part 2

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
/**
 * The PlayQueue class demonstrates the usage of Java's Queue interface
 * with a LinkedList implementation. It exercises various operations such
 * as adding elements to the queue, retrieving and removing elements from
 * the head, peeking at the head element, and getting the size of the queue.
 */
public class PlayQueue {

    /**
     * Exercise a Queue (a FIFO):
     * - offer() - inserts an element into the head of the Queue
     * - add() - inserts an element into the head of the Queue
     * - peek() - retrieves but does not remove from the head element of the Queue
     * - remove() - retrieves and removes an element from the head of the Queue
     * - size() - returns the number of elements in the Queue
     *
     * @param args Command line arguments (unused in this example).
     */
    public static void main(String[] args) {

        // Set up a Queue of Strings
        Queue<String> stringQueue = new LinkedList<String>();
        stringQueue.offer("Mark Reha");
        stringQueue.add("Mary Reha");
        stringQueue.offer("Justine Reha");
        stringQueue.add("Brianna Reha");

        // Setup a Queue of Integers
        Queue<Integer> integerQueue = new LinkedList<Integer>();
        integerQueue.add(1);
        integerQueue.offer(-1);
        integerQueue.add(5);
        integerQueue.offer(10);

        // Print out size and head element of the Queue
        System.out.println(integerQueue);
        System.out.printf("Integer Queue Tests: size is %d and head element is %d\n",
                integerQueue.size(), integerQueue.peek());

        // Use Iterator to get elements from the Queue,
        // could have used a loop over size() and used remove()
        // to achieve the same functionality
        Iterator<String> itr = stringQueue.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
