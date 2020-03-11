import java.util.ArrayList;
import java.util.Scanner;

/**
 * A menu that is displayed on a console.
 */
public class Menu {
	private String title;
	private ArrayList<String> options;
	private Scanner in;

	/**
	 * Constructs an empty menu (i.e., a menu with no options).
	 * @param title The title of the menu.
	 * @param in The scanner object for reading the menu input from (probably based on System.in).
	 */
	public Menu(String title, Scanner in) {
		this.title = title;
		this.options = new ArrayList<String>();
		this.in = in;
	}

	/**
	 * Adds an option to the end of this menu.
	 * @param option the option to add.
	 */
	public void addOption(String option) {
		options.add(option);
	}

	/**
	 * Display the menu, with options numbered starting with 1,
	 * and prompts the user for input. Repeat the prompt until a valid input 
	 * is supplied. The prompt is the string "Choice: ".
	 * @return the option number that the user chose.
	 */
	public int executeMenu() {
		return executeMenu("Choice: ");
	}
	
	/**
	 * Display the menu, with options numbered starting with 1,
	 * and prompts the user for input. Repeat the prompt until a valid input 
	 * is supplied.
	 * @param prompt the prompt the user is shown.
	 * @return the option number that the user chose.
	 */
	public int executeMenu(String prompt) {
		printTitle();		
		printOptions();
		
		int userChoice = ReadUtility.readIntBetween(in, prompt, 1, options.size());
		
		return userChoice;
	}
	
	/**
	 * Print the title of the menu
	 */
	private void printTitle() {
		System.out.println(title);
		for (int i = 0; i < title.length(); i++) {
			System.out.print("-");
		}
		System.out.println();
	}
	
	/**
	 * Print the options of the menu.
	 */
	private void printOptions() {
		for (int i = 0; i < options.size(); i++) {
			// We want the choices to be numbered from 1 (not 0).
			int choice = i + 1;
			System.out.println(choice + ") " + options.get(i)); 
		}
	}
	
	/**
	 * Gets the number of options currently added to the menu.
	 * @return The number of options.
	 */
	public int numberOfOptions() {
		return options.size();
	}
}