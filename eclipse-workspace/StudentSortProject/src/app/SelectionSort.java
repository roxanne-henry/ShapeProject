package app;


import java.util.ArrayList;
import java.util.Comparator;

/**
 * Implements selection sort for a list of Student objects.
 */
public class SelectionSort {

    /**
     * Sorts the given ArrayList of students using Selection Sort.
     * @param list ArrayList of students
     * @param comparator Comparator to decide sorting order
     */
    public static void selectionSort(ArrayList<Student> list, Comparator<Student> comparator) {
        int n = list.size();
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (comparator.compare(list.get(j), list.get(minIndex)) < 0) {
                    minIndex = j;
                }
            }
            // Swap students
            Student temp = list.get(minIndex);
            list.set(minIndex, list.get(i));
            list.set(i, temp);
        }
    }
}
