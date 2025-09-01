package app;

import java.util.ArrayList;

/**
 * Main class to demonstrate sorting of Student objects.
 */
public class Main {
    /**
     * Entry point of the program.
     * @param args Command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();

        // Add 10 student objects
        students.add(new Student(10, "Roxanne", "Henry"));
        students.add(new Student(5, "Marlon", "Dallas"));
        students.add(new Student(2, "Charlie", "Vaughner"));
        students.add(new Student(8, "Emery", "Smith"));
        students.add(new Student(1, "Eve", "Paso"));
        students.add(new Student(9, "Frank", "Fort"));
        students.add(new Student(6, "Grace", "Plano"));
        students.add(new Student(3, "Hank", "Land"));
        students.add(new Student(7, "Ivy", "Hodges"));
        students.add(new Student(4, "Jack", "Arlington"));

        System.out.println("Original List:");
        for (Student s : students) {
            System.out.println(s);
        }

        // Sort by name
        SelectionSort.selectionSort(students, new SortByName());
        System.out.println("\nSorted by Name:");
        for (Student s : students) {
            System.out.println(s);
        }

        // Sort by roll number
        SelectionSort.selectionSort(students, new SortByRollno());
        System.out.println("\nSorted by Roll Number:");
        for (Student s : students) {
            System.out.println(s);
        }
    }
}
