package app;
//Maiza Falcon Rojas
//CST-239
//02/28/2024
//This coded is from Assignment Activity 5 Word Doc Part 1

/**
 * The Storage class is a generic class that represents a simple storage container
 * holding an element of type T. It includes a constructor to initialize the storage
 * with a value of type T and a method to retrieve the stored data.
 *
 * @param <T> The type of data that the Storage class can hold.
 */
public class Storage<T> {

    private T s = null;

    /**
     * Constructor to initialize the storage with a value of type T.
     *
     * @param s The data to be stored in the container.
     */
    public Storage(T s) {
        this.s = s;
    }

    /**
     * Retrieves the stored data from the container.
     *
     * @return The data of type T stored in the container.
     */
    public T getData() {
        return this.s;
    }

    /**
     * The main method serves as the entry point of the program.
     * It demonstrates the usage of the Storage class with different
     * types (String and Integer) and prints the stored data.
     *
     * @param args Command line arguments (unused in this example).
     */
    public static void main(String[] args) {

        Storage<String> storage1 = new Storage<String>("Mark Reha");
        System.out.println("This is the data: " + storage1.getData());

        Storage<Integer> storage2 = new Storage<Integer>(0);
        System.out.println("This is the data: " + storage2.getData());
    }
}
