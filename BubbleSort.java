// Importing the Arrays class from java.util package for using the toString method later
import java.util.Arrays;

// Declaring a class named BubbleSort
public class BubbleSort{
    // Declaring a method named 'sort' that takes an integer array as a parameter and sorts it using the Bubble Sort algorithm
    public static void bubblesort(int[] array ){
        // Outer loop iterating over each element in the array
        for (int i = 0; i < array.length; i++)
            // Inner loop comparing adjacent elements and swapping them if they are in the wrong order
            for (int j = 1; j < array.length; j++)
                if (array[j] < array[j-1]){
                    // Swap the elements if they are in the wrong order
                    int temp = array[j];
                    array[j] = array[j-1];
                    array[j-1] = temp;
                }
    }

    // Main method, the entry point of the program
    public static void main(String[] args){
        // Initializing two arrays, 'age' and 'salaries', with unsorted values
        int[] age = {19, 17, 25, 32, 36, 18, 38, 42, 45, 21, 52, 20};
        int[] salaries = {120000, 180000, 90000, 160000, 200000, 30000, 110000, 350000, 700000, 330000, 35000, 20000};
        
        // Creating an instance of the BubbleSort class
        BubbleSort sorter = new BubbleSort();
        
        // Sorting the 'age' array using the 'sort' method of the BubbleSort class
        sorter.bubblesort(age);
        // Sorting the 'salaries' array using the 'sort' method of the BubbleSort class
        sorter.bubblesort(salaries);
        
        // Printing the sorted ages of workers using Arrays.toString method
        System.out.println("The sorted ages of workers is in this order: ");
        System.out.println(Arrays.toString(age));

        // Printing the sorted salaries of workers using Arrays.toString method
        System.out.println(" \nThe sorted salaries of workers is in this order: ");
        System.out.println(Arrays.toString(salaries));
    }
}
