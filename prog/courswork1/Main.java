
import java.io.FileNotFoundException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;


public class Main {

    public static ArrayList<Project> projects = new ArrayList();

    public static void main(String[] args) throws FileNotFoundException {


        readData();
        printSComplettionAverage();

        //testTasksClass();
        //uncomment above to test Task Class

        //testProjectClass();
        //uncomment above to test Project Class

    }

    public static void readData() throws FileNotFoundException {

        //File inputFile = new File ( "./src/ProjectData.txt");
        File inputFile = new File ( "./ProjectData.txt");
        Scanner in = new Scanner(inputFile);

        while (in.hasNextLine()) {
            String projectID = in.nextLine();
            Project project = new Project(projectID);
            double taskNum = Double.parseDouble(in.nextLine());
            //System.out.println(" Project name: " + projectID);
            //System.out.println("Tasks in project " + taskNum);

            for (int i = 0; i < taskNum; i++) {
                String task = in.nextLine();
                double comp = Double.parseDouble(in.nextLine());
                //System.out.println("Task name: " + task);
                //System.out.println(comp);
                Task t = new Task(task, comp);
                project.addTask(t);

            }
            projects.add(project);
        }

    }

    public static void printSComplettionAverage() {
        DecimalFormat df = new DecimalFormat();
        df.setMaximumFractionDigits(2);

        System.out.println("Project Completion Averages");
        System.out.println("============================");
        for (int i = 0; i < projects.size(); i++) {
            Project project = projects.get(i);
            String completionPercentage = df.format(project.calculateAverageTaskCompletion());
            System.out.println(project.getProjectName() + ": " + completionPercentage + "%");
        }
    }


    public static void testTasksClass() {
        testTaskClass testTask = new testTaskClass();
        testTask.test_Task_Constructor();

    }

    public static void testProjectClass() {

        testProjectClass testProject = new testProjectClass();

        //testProject.testProjectTestSetup();
        //testProject.testProjectTestSetup();

        testProjectClass testProject1 = new testProjectClass();

        testProject1.testProjectSetName();

        testProjectClass testProject2 = new testProjectClass();

        testProject2.testAddTasks();

        testProjectClass testProject3 = new testProjectClass();

        testProject3.testAverageCompletion();

    }
}
