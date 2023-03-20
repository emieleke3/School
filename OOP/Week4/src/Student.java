import java.util.ArrayList;

public class Student extends Person {
    private int studentNumber;

    public Student(String firstName, String lastName, int studentNumber) {
        super(firstName, lastName);
        this.studentNumber = studentNumber;
    }

    public int getStudentNumber() {
        return studentNumber;
    }

    public ArrayList<Student> readStudentsFromFile() {
        return null;
    }
    @Override
    public String toString() {
        return "studentNumber=" + studentNumber;
    }
}
