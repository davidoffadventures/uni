import java.util.ArrayList;
import java.text.DecimalFormat;

public class Project {
    
    //Task C: Creating a project class
    
    private String gProjectName;
    private ArrayList<Task> gProjectTasks;
    
    public Project(String projectName){
        gProjectName = projectName;
        gProjectTasks = new ArrayList<Task>();
    }
    
    public void setProjectName(String projectName){
        gProjectName = projectName;
    }
    
    /*
    public void setName(String name){
        this.name = name;
    }
    */
    
    public String getProjectName(){
        return gProjectName;
    }
    
    public void addTask(Task t){
        gProjectTasks.add(t);
    }
    
    /*
    public void addTask(Task t){
        tasks.add(t);
    }
    */
    
    public ArrayList<Task> getTasks() {
        return gProjectTasks;
    }
    
    public double calculateAverageTaskCompletion(){
        if(gProjectTasks.size() == 0) {
            return 0.0;
        }
        
        double total = 0.0;
        for (Task t : gProjectTasks){
            total = total + t.getCompNum();
        }
        
        double average = total / gProjectTasks.size();
        return average;
    }
    
    


}