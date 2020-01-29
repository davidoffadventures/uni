import java.util.ArrayList;


/**
 * Implement a generic class modelling a Stack.
A stack has the following operations:
• push(elem) – add elem to the top of the stack.
• pop() – remove the top element of the (non-empty) stack
• top() – get (return) the top element of the (non-empty) stack. This does not modify the
top element of the stack.
• isEmpty() – Returns true if the stack is empty; false otherwise.
Hint: A stack can be implemented very easily using an array list.
Your stack should also throw an IllegalStateException exception (with an appropriate message) if you try to pop or top an empty stack. IllegalStateException is a standard exception
which signals that a method has been invoked at an illegal or inappropriate time (i.e., when a
stack is empty).

 * @author 993591
 *
 */

public class Main {
	
public static void main(String[] args) {
		
		
	 Stack newStack = new Stack();
	 
	 newStack.push("Harry Potter - Philosophers stone");
	 newStack.push("Harry Potter - Chamber of Secrets");
	 newStack.push("Harry Potter - Prisoner of Azkaban");
	 newStack.push("Harry Potter - Goblet of Fire");
	 newStack.push("Harry Potter - Order of the phoenix");
	 newStack.push("Harry Potter - Half blood prince");
	 newStack.push("Harry Potter - Deathly Hallows");
	 
	 System.out.println(newStack.top());
	 
	 newStack.pop();
	 
	 System.out.println(newStack.top());
	 
	 newStack.pop();
	 newStack.pop();
	 
	 System.out.println(newStack.top());
		
		
		
		
		

}
}