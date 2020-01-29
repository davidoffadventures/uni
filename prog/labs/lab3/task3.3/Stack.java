import java.util.ArrayList;

public class Stack {
	
	private ArrayList<String> stack = new ArrayList<String>();
	
	public void push(String value){
		
	stack.add(0, value);	
	}
	
	
	public void pop() {
		if (stack.isEmpty()){
			
			throw new IllegalStateException ("Stack is empty");
		}
		stack.remove(0);
		
	}
	
	
	
	public String top(){
		
        if (stack.isEmpty()){
			
			throw new IllegalStateException ("Stack is empty");
        }
			
		return stack.get(0);
		
	}
	
	public boolean isEmpty(){
		
		return stack.isEmpty();
		
		
	}
	
	

}
