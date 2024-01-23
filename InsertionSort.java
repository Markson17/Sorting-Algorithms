// Importing the Arrays class from java.util package for using the toString method later
import java.util.Arrays;

// Declaring a class named InsertionSort
public class InsertionSort {
    // Declaring a static method named 'insertion' that takes an integer array as a parameter and sorts it using the Insertion Sort algorithm
    public static void insertion(int[] array) {
        // Loop through each element in the array starting from the second element
        for (int i = 1; i < array.length; i++) {
            // Store the current element in a temporary variable
            int current = array[i];
            int j = i - 1;

            // Use a while loop to shift previous items to the right if they are greater than the current element
            while (j >= 0 && array[j] > current) {
                // Shift the element to the right
                array[j + 1] = array[j];
                // Update the index for further comparisons
                int c = j--;
            }

            // Place the current element in its correct sorted position
            array[j + 1] = current;
        }
    }

    // Main method, the entry point of the program
    public static void main(String[] args) {
        // Initializing two arrays, 'age' and 'salaries', with unsorted values
        int[] age = { 19, 17, 25, 32, 36, 18, 38, 42, 45, 21, 52, 20 };
        int[] salaries = { 120000, 180000, 90000, 160000, 200000, 30000, 110000, 350000, 700000, 330000, 35000, 20000 };

        // Creating an instance of the InsertionSort class
        InsertionSort sorter = new InsertionSort();

        // Sorting the 'age' array using the 'insertion' method of the InsertionSort class
        sorter.insertion(age);
        // Sorting the 'salaries' array using the 'insertion' method of the InsertionSort class
        sorter.insertion(salaries);

        // Printing the sorted ages of workers using Arrays.toString method
        System.out.println("The sorted ages of workers is in this order: ");
        System.out.println(Arrays.toString(age));

        // Printing the sorted salaries of workers using Arrays.toString method
        System.out.println(" \nThe sorted salaries of workers is in this order: ");
        System.out.println(Arrays.toString(salaries));
    }
}
