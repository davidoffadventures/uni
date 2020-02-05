
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.text.DecimalFormat;


public class Main {

    /**
     * This is an important global array that will collect all data into students
     */
    public static ArrayList<Task> tasks = new ArrayList();


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
     * I was unable to sort the student averages, there were many ways explained online using packages,
     * but none of these were taught in class currently
     */
    public static void printSortedStudentAverages() {
        printStudentAverages();
    }

    /**
     * The readData method will read the contents of a file, capturing the student ID, student tasknme and marks
     * using the number of students modules we're able to capture the correct amount of marks for that student before
     * moving onto the next student.
     * @throws FileNotFoundException
     */

    public static void readData() throws FileNotFoundException {

        File inputFile = new File("./StudentData.txt");
        Scanner in = new Scanner(inputFile);

        while (in.hasNextLine()) {
            String capID = in.nextLine();
            Task taskName = new Task(capID);
            double taskNum = Double.parseDouble(in.nextLine());
            //System.out.println("Project name: " + capID);
            //System.out.println("Tasks in project: " + taskNum);

            for (int i = 0; i < taskNum; i++) {
                String tasknme = in.nextLine();
                double mark = Double.parseDouble(in.nextLine());
                System.out.println("Task name: " + tasknme);
                System.out.println(mark);
                Mark m = new Mark(tasknme, mark);
                
                taskName.addComp(c);
            }
            students.add(task);
        }
    }

    /**
     * PrintStudentAverages will capture the numder of tasknmes a student has taken then calculate the average per student, assigning it to their ID
     *
     * I had used a DecimalFormat text to display the correct format.
     */
    public static void printStudentAverages() {
        DecimalFormat df = new DecimalFormat();
        df.setMaximumFractionDigits(2);
        System.out.println("Project Completion Averages 22");
        System.out.println("============================");
        for (int i = 0; i < students.size(); i++) {
            Student student = students.get(i);
            String averageMark = df.format(student.calculateAverageMark());
            System.out.println(student.getStudentID() + ": " + averageMark);
        }
    }

    /**
     * Test marks calls on my testMArkClass
     * This tests numerous getters and setters for the marks class using different test scenarios
     */
    public static void testMarks() {

        testMarkClass testMark = new testMarkClass();
        testMark.test_Mark_tasknme_constructor();
        testMark.test_Mark_mark_constructor();

        testMark.test_Mark_setMark();
        testMark.test_Mark_settasknme();
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