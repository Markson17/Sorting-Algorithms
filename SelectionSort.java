import java.util.Arrays;
public class SelectionSort {

    public static void main(String[] args) {
        // Ages and Salaries arrays
        int[] ages = {19, 17, 25, 32, 36, 18, 38, 42, 45, 21, 52, 20};
        int[] salaries = {120000, 180000, 90000, 160000, 200000, 30000, 110000, 350000, 100000, 330000, 35000, 20000};

        // Sort Ages
        selectionSort(ages);
        System.out.println("Sorted Ages: " + Arrays.toString(ages));

        // Sort Salaries
        selectionSort(salaries);
        System.out.println("\nSorted Salaries: " + Arrays.toString(salaries));
    }

    // Selection Sort implementation
    private static void selectionSort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;

            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            // Swap the found minimum element with the first element
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }
}