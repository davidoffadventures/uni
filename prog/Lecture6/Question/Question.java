/**
 * A question with a text and an answer.
 */
public class Question {
	private String text;
	private String answer;
	
	/**
	 * Constructs a question with empty question ans answer.
	 */
	public Question()
	{
		text = "";
		answer = "";
	}
	
	/**
	 * Sets the question text.
	 * @param questionText the text of this question
	 */
	public void setText(String questionText) 
	{
		text = questionText;
	}
	
	/**
	 * Sets the answer for this question
	 * @param answerText the answer text
	 */
	public void setAnswer(String answerText)
	{
		answer = answerText;
	}
	
	/**
	 * Checks if the given response is correct
	 * @param response the response to check
	 * @return true if response is correct, false otherwise
	 */
	public boolean checkAnswer(String response)
	{
		return response.equals(answer);
	}
	
	/**
	 * Displays this question
	 */
	public void display()
	{
		System.out.println(text);
	}
}
