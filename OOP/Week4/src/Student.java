import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Student extends Person {
    private int studentNumber;

    public Student(String firstName, String lastName, int studentNumber) {
        super(firstName, lastName);
        this.studentNumber = studentNumber;
    }

    public int getStudentNumber() {
        return studentNumber;
    }

    public static ArrayList<Student> readStudentsFromFile(String file) {
        ArrayList<Student> result = new ArrayList<>();

        try {
            Scanner scanner = new Scanner(new File(file));

            // Skip header row
            scanner.nextLine();

            while (scanner.hasNext()) {
                String lineFromScanner = scanner.nextLine(); // Read the entire line
                String[] lineParts = lineFromScanner.split(","); // Break it into parts

                String firstName = lineParts[0];
                String lastName = lineParts[1];
                int studentNumber = st; // Parse the String into an int.

                Student s = new Student(firstName, lastName); // Let's assume this exists!
                result.add(s);
            }

            scanner.close();
        } catch (FileNotFoundException ex) { // Note that this exception MUST be caught. We'll discuss later why.
            System.err.println("Cannot find CSV file: " + ex);
        }

        return result;
    }
    @Override
    public String toString() {
        return "studentNumber=" + studentNumber;
    }
}
