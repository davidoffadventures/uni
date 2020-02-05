
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;


public class Main {

    /**
     * This is an important global array that will collect all data into students
     */
    public static ArrayList<Student> students = new ArrayList();

    /**
     * My main method for the project. calls all relevant methods.
     *
     * I've commented out my test classes by default.
     *
     *
     * @param args
     * @throws FileNotFoundException I was going to put the FileNotFoundException into the readData method, but my IDE decided to push it up a layer.
     */
    public static void main(String[] args) throws FileNotFoundException {


/**
 * Please uncomment testMarks and TestStudents to see the unit test working.
 */
//         testMarks();
//         testStudents();

        readData();
        printStudentAverages();
    }


    /**
     * I was unable to sort the student averages
     */
    public static void printSortedStudentAverages() {
        printStudentAverages();
    }

    /**
     * The readData method will read the contents of a file, capturing the student ID, student module and marks
     * using the number of students modules we're able to capture the correct amount of marks for that student before
     * moving onto the next student.
     * @throws FileNotFoundException
     */

    public static void readData() throws FileNotFoundException {

        File inputFile = new File("./StudentData.txt");
        Scanner in = new Scanner(inputFile);
        while (in.hasNextLine()) {
            String capID = in.nextLine();
            Student student = new Student(capID);
            int modNum = Integer.parseInt(in.nextLine());
            for (int i = 0; i < modNum; i++) {
                String module = in.nextLine();
                int mark = Integer.parseInt(in.nextLine());
                Mark m = new Mark(module, mark);
                student.addMark(m);
            }
            students.add(student);
        }
    }

    /**
     * PrintStudentAverages will capture the numder of modules a student has taken then calculate the average per student, assigning it to their ID
     *
     * I had used a DecimalFormat text to display the correct format.
     */
    public static void printStudentAverages() {
        System.out.println("Student Averages");
        System.out.println("================");
        for (int i = 0; i < students.size(); i++) {
            Student student = students.get(i);
            System.out.println(student.getStudentID() + ": " + student.calculateAverageMark());
        }
    }

    /**
     * Test marks calls on my testMArkClass
     * This tests numerous getters and setters for the marks class using different test scenarios
     */
    public static void testMarks() {

        testMarkClass testMark = new testMarkClass();
        testMark.test_Mark_module_constructor();
        testMark.test_Mark_mark_constructor();

        testMark.test_Mark_setMark();
        testMark.test_Mark_setModule();
    }

    /**
     * testStudents calls on my testStudentClass
     * This tests numerous getters and setters and my calculate average test for the Student class using different test scenarios
     */
    public static void testStudents() {

        testStudentClass testID = new testStudentClass();
        testID.studentTestSetup();
        testID.studentTestSetID();
        testID.addTestModMarks();
        testID.testAverageMarks();
    }
}