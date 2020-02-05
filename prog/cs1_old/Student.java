import java.text.DecimalFormat;
import java.util.ArrayList;

public class Student {
    /**
     * gStudentID is my main global variable for Student ID
     */

    /**
     * gStudentMarks is my main global variable for Student marks
     */
    private String gStudentID;
    private ArrayList<Mark> gStudentMarks;

    public Student(String studentID) {
        gStudentID = studentID;
        gStudentMarks = new ArrayList<Mark>();
    }

    public String getStudentID() {
        return gStudentID;
    }

    public void setStudentID(String studentID) {
        gStudentID = studentID;
    }

    public void addMark(Mark m) {
        gStudentMarks.add(m);
    }

    public ArrayList<Mark> getMarks() {
        return gStudentMarks;
    }

    public double calculateAverageMark() {
        DecimalFormat value = new DecimalFormat("#.#");
        double average = 0.0;
        for (Mark m : gStudentMarks) {
            average = average + m.getMark();
        }
        average = average / gStudentMarks.size();
        return Double.parseDouble(value.format(average));
    }
}