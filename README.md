# Sorting Algorithms

This folder contains my implementations of various sorting algorithms in Java. I'm currently working on learning and implementing different sorting techniques, so this collection will grow over time.


## Bubble Sort

### Implementation (`BubbleSort.java`):
- The `BubbleSort` class provides a static method `bubblesort` for sorting an integer array using the Bubble Sort algorithm.
- The algorithm compares adjacent elements and swaps them if they are in the wrong order. This process is repeated until the entire array is sorted.
- The main method demonstrates the usage of the Bubble Sort algorithm on two arrays: `age` and `salaries`.
- The sorted arrays are then printed using the `Arrays.toString` method.

### Usage:
1. Compile the `BubbleSort.java` file.
   ```bash
   javac BubbleSort.java
   ```
2. Run the compiled program.
   ```bash
   java BubbleSort
   ```

## Selection Sort

### Implementation (`SelectionSort.java`):
- The `SelectionSort` class contains a static method `selectionSort` for sorting an integer array using the Selection Sort algorithm.
- The algorithm divides the array into a sorted and an unsorted region. It repeatedly selects the minimum element from the unsorted region and swaps it with the first element of the unsorted region.
- The main method demonstrates the usage of the Selection Sort algorithm on two arrays: `ages` and `salaries`.
- The sorted arrays are then printed using the `Arrays.toString` method.

### Usage:
1. Compile the `SelectionSort.java` file.
   ```bash
   javac SelectionSort.java
   ```
2. Run the compiled program.
   ```bash
   java SelectionSort
   ```

## Future Additions
Common sorting algorithms include Insertion Sort, Merge Sort, Quick Sort, and Heap Sort. Each algorithm provides a unique approach to sorting and I would understand their differences to deepen my understanding of algorithmic efficiency and implement them.

Feel free to explore!