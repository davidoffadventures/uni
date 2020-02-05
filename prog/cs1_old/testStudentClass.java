
import java.util.ArrayList;

public class testStudentClass {

    public void studentTestSetup() {
        String expectecStudentID = "ID001";
        Student student = new Student("ID001");
        System.out.println("Student: " + expectecStudentID);
        System.out.println("Expected output -- Student: " + student.getStudentID());
    }

    public void studentTestSetID() {
        String expectecStudentID = "ID001";
        Student student = new Student("IDTEST");
        student.setStudentID("ID001");
        System.out.println("Student: " + expectecStudentID);
        System.out.println("Expected output -- Student: " + student.getStudentID());
    }

    public void addTestModMarks() {

        String expectedModule = "Mod1";
        int expectedMark = 21;
        Mark objectMark1 = new Mark("Mod1", 21);
        Student student = new Student("Test");
        student.addMark(objectMark1);
        ArrayList<Mark> marks = student.getMarks();
        Mark actualMark = marks.get(0);
        System.out.println("Module: " + expectedModule);
        System.out.println("Expected output -- Module: " + actualMark.getModule());
        System.out.println("Mark: " + expectedMark);
        System.out.println("Expected output -- Mark: " + actualMark.getMark());
    }

    public void testAverageMarks() {

        String expectedAverage = "60.0";
        Student student = new Student("TestAVG");
        Mark objectMark1 = new Mark("Mod1", 50);
        student.addMark(objectMark1);
        Mark objectMark2 = new Mark("Mod2", 50);
        student.addMark(objectMark2);
        Mark objectMark3 = new Mark("Mod3", 80);
        student.addMark(objectMark3);
        System.out.println("Expected output -- Average marks " + expectedAverage);
        System.out.println("Average marks " + student.calculateAverageMark());

    }
}