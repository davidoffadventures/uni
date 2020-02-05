public class testTaskClass {
    
    public void test_Task_Constructor() {
        //String expectedTask = "Shopping List";
        //Double expectedCompNum = 50;
        
        Task newTask = new Task("Shopping List", 50);
        
        System.out.println("Expected: Shopping List");
        System.out.println("Actual: " + newTask.getTaskName()); 
        System.out.println("Expected: 50");
        System.out.println("Actual: " + newTask.getCompNum());
    }
}