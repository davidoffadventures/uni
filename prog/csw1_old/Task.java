import java.text.DecimalFormat;
import java.util.ArrayList;

/*
* Create task class
* creater private property name string, completion double (needs getter/setters)
* constructor contains name and complete values
* */

public class Task {
    /**
     * gnameID is my main global variable for Task ID
     */

    /**
     * gTaskMarks is my main global variable for Task marks
     */
    private String gNameId;
    private ArrayList<Comp> gCompletionAmnt;

    public Task(String nameID) {
        gNameId = nameID;
        gCompletionAmnt = new ArrayList<Comp>();
    }

    public String getnameID() {
        return gNameId;
    }

    public void setnameID(String nameID) {
        gNameId = nameID;
    }

    public void addComp(Comp c) {
        gCompletionAmnt.add(c);
    }

    public ArrayList<Comp> getComp() {
        return gCompletionAmnt;
    }

    public double calculateAvgComp() {
        if(gCompletionAmnt.size() == 0) {
            return 0.0;
        }
        
      //  if(Mark.getMark() !=null) {
      //    average = Double.parseDouble(Mark.getMark());
      //}
        
        double total = 0.0;
        
        
        
        for (Comp c : gCompletionAmnt) {
            total = total + c.getComp();
        }
        
        double average = total / gCompletionAmnt.size();
        
        return average;
    }
}