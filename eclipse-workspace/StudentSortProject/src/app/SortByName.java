package app;


import java.util.Comparator;

/**
 * Comparator to sort students by their name.
 */
public class SortByName implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        return s1.name.compareTo(s2.name);
    }
}
