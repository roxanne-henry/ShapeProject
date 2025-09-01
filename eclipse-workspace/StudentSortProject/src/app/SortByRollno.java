package app;


import java.util.Comparator;

/**
 * Comparator to sort students by their roll number.
 */
public class SortByRollno implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        return s1.rollno - s2.rollno;
    }
}
