public class Task {

private String gTaskName;
private double gCompNum;

public Task (String taskName, double compNum){
    setTaskName(taskName);
    setCompNum(compNum);
}

public void setTaskName(String taskName) {
    gTaskName = taskName;
}

public String getTaskName() {
    return gTaskName;
}

public void setCompNum(double compNum){
    if (compNum < 0 || compNum > 100){
        throw new IllegalArgumentException();
    }
    gCompNum = compNum;
}

public double getCompNum(){
    return gCompNum;
}

/*public String toString() {
    return "name"+name"
}
*/

}