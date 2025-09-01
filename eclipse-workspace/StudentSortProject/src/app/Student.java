package app;


/**
 * Represents a Student with roll number, name, and address.
 */
public class Student {
    int rollno;
    String name;
    String address;

    /**
     * Constructs a Student object.
     * @param rollno The student's roll number
     * @param name The student's name
     * @param address The student's address
     */
    public Student(int rollno, String name, String address) {
        this.rollno = rollno;
        this.name = name;
        this.address = address;
    }

    /**
     * Returns a string representation of the student object.
     * @return String with rollno, name, and address
     */
    @Override
    public String toString() {
        return rollno + " " + name + " " + address;
    }
}

