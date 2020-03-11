import java.util.Scanner;

/**
 * Useful utilities to read valid input from a user.
 * @author Liam O'Reilly
 *
 */
public class ReadUtility {

	/**
	 * Read a string off the user which does not include commas.
	 * @param in The scanner object for reading the menu input from (probably based on System.in).
	 * @param prompt The string that should be used to prompt the user for input.
	 * @return The read string.
	 */
	public static String readStringWithoutCommas(Scanner in, String prompt) {
		// Get the user's input
		boolean validInputEntered = false;
		String input = null;
		do {			
			System.out.print(prompt);
			input = in.nextLine();
			
			if(input.isEmpty()) {
				System.out.println();
				System.out.println("Error: You must provide a string.");
				System.out.println();
			} else if(input.contains(",")) {
				System.out.println();
				System.out.println("Error: \"" + input + "\" is an invalid input as it contains a comma.");
				System.out.println("You must enter a string that does not contain commas.");
				System.out.println();
			} else {
				validInputEntered = true;
			}
		} while (!validInputEntered);

		return input;
	}
	
	/**
	 * Read an integer between two bounds.
	 * @param in The scanner object for reading the menu input from (probably based on System.in).
	 * @param lowerBound The lower bound of the integer (inclusive).
	 * @param upperBound The upper bound of the integer (inclusive).
	 * @return The read integer.
	 */
	public static int readIntBetween(Scanner in, String prompt, int lowerBound, int upperBound) {

		// Get the user's input
		boolean validInputEntered = false;
		String input = null;
		int inputAsInt = 0;
		do {			
			System.out.print(prompt);
			input = in.nextLine();
			
			try {
				inputAsInt = Integer.parseInt(input);
				// We now definitely have an integer as a choice.
				if (inputAsInt >= 1 && inputAsInt <= upperBound) {
					validInputEntered = true;					
				} else {
					// Out of range integer has been input.
					printInputError(input, "You must input a number between " + lowerBound + " and " + upperBound + ".");
				}
			} catch (NumberFormatException e) {
				// A non-integer has been input.
				printInputError(input, "You must input a number between " + lowerBound + " and " + upperBound + ".");
			}
		} while (!validInputEntered);

		return inputAsInt;
	}
	
	/**
	 * Print a error message for invalid input.
	 * @param input The input that is invalid.
	 * @param message The message that should be displayed.
	 */
	private static void printInputError(String input, String message) {
		System.out.println();
		System.out.println("Error: " + input + " is an invalid input.");
		System.out.println(message);
		System.out.println();
	}
}
