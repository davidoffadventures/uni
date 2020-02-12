import java.util.Stack;

public class Main{
	public static void main(String[] args)
	{
		int result = evaluateRPN("512+4x+3-");

		System.out.println("Expected result of evaluation: 14");
		System.out.println("Result of evaluation: "+result);
	}

	public static int evaluateRPN(String exp)
	{
		int result = 0;
		Stack<Integer> stack = new Stack<Integer>();

		for(int i = 0; i < exp.length(); i++)
		{
			char c = exp.charAt(i);

			//Process

		}
	
		return result;

	}
}

