import java.util.ArrayList;

public class testProjectClass {
    
    public void testProjectSetup(){
        Project project = new Project("word");
        
        System.out.println(project);
        System.out.println(project.getProjectName());
    }
    
    public void testProjectSetName(){
        Project project = new Project("Word");
        project.setProjectName("DIY #1");
        System.out.println("Expected project name: DIY #1");
        System.out.println("Actual project name: " + project.getProjectName());
    }
    
    public void testAddTasks(){
        
        Task task1 = new Task("wheels", 10);
        Project project = new Project("DIY Motorbike");
        project.addTask(task1);
        ArrayList<Task> tasks = project.getTasks(); 
        Task listTasks = tasks.get(0);
        
        System.out.println("Hello?");
        System.out.println(project);
        
        System.out.println(listTasks.getTaskName());
        System.out.println(listTasks.getCompNum());
        System.out.println(project.getProjectName());
    } 
    
    public void testAverageCompletion(){
        Project project = new Project("Car work");
        Task task = new Task("Engine", 50);
        project.addTask(task);
        Task task2 = new Task("Wheels", 50);
        project.addTask(task2);
        System.out.println(project.calculateAverageTaskCompletion());
        
        
        
        
        
    }
    
    
}