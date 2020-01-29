import java.util.ArrayList;

public class Main {
		public enum Day  {MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY}

public static void main(String[] args) {
		
		
	 Stack<Day> newStack = new Stack<Day>(); //the <Day> is a generic stack
	 
	 newStack.push(Day.MONDAY);
	 newStack.push(Day.TUESDAY);
	 newStack.push(Day.WEDNESDAY);
	 newStack.pop();
	 
	 
	 	 System.out.println(newStack.top());
	 
	 newStack.pop();
	 
	 
}
}