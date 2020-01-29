import java.util.ArrayList;

public class Stack<E> {
	

	
	private ArrayList<E> stack = new ArrayList<E>();
	
	public void push(E value){
		
	stack.add(0, value);	
	}
	
	
	public void pop() {
		if (stack.isEmpty()){
			
			throw new IllegalStateException ("Stack is empty");
		}
		stack.remove(0);
		
	}
	
	
	
	public E top(){
		
        if (stack.isEmpty()){
			
			throw new IllegalStateException ("Stack is empty");
        }
			
		return stack.get(0);
		
	}
	
	public boolean isEmpty(){
		
		return stack.isEmpty();
		
		
	}
	
	

}
