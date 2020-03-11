import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * The main program for Coursework 2.
 * This class is never instantiated and does not model a real object (such as a book, DVD, or item).
 * @author Liam O'Reilly
 *
 */
public class Main {
	static final String FILENAME = "ItemData.txt";
	static final String LINE_BREAK = "\n************************************************************\n";
	static ArrayList<Item>items;
	static Scanner keyboardScanner = new Scanner(System.in);

	public static void main(String[] args) {
		items = new ArrayList<Item>();

		// Read all data
		try {
			readData();
		} catch (FileNotFoundException e) {
			System.out.println("Data file " + FILENAME + " was not found.");
			System.out.println("Program will quit");
			System.exit(-1);
		}

		// Run the main loop
		mainMenu();
		
		saveFile();
		
		System.out.println("Bye bye");
	}

	/**
	 * Main menu of the program. Once this method returns the user has chosen to quit.
	 */
	public static void mainMenu() {
		boolean done = false;

		do {
			//System.out.println(LINE_BREAK);
			Menu mainMenu = new Menu("Main Menu", keyboardScanner);
			mainMenu.addOption("Print all items");
			mainMenu.addOption("Print items which are currently out");
			mainMenu.addOption("Print detailed information about an item");
			mainMenu.addOption("Lend out item");
			mainMenu.addOption("Return item");
			mainMenu.addOption("Add new item");
			mainMenu.addOption("Delete item");

			mainMenu.addOption("Quit");
			int choice = mainMenu.executeMenu();
			
			System.out.println(LINE_BREAK);

			switch(choice) {
			case 1:
				printItems(false);
				break;
			case 2:
				printItems(true);
				break;
			case 3:
				printDetailedItem();
				break;
			case 4:
				lendOutItem();
				break;
			case 5:
				returnItem();
				break;
			case 6:
				addNewItem();
				break;
			case 7:
				deleteItem();
				break;
			case 8:
				done = true;				
				break;
			}
			
			if (!done) {
				System.out.println(LINE_BREAK);
			}
		} while (!done);		
	}

	/**
	 * Read all the items form the data file.
	 */
	public static void readData() throws FileNotFoundException {
		File inputFile = new File(FILENAME);
		Scanner fileScanner = new Scanner(inputFile);

		while (fileScanner.hasNextLine()) {
			
			// There is a line to read.
			String line = fileScanner.nextLine();
			Scanner lineScanner = new Scanner(line);
			lineScanner.useDelimiter(",");
			
			// Variable to hold our item that we create by parsing this line.
			Item item = null;
			
			String typeOfItem = lineScanner.next();
			String isLentOutString = lineScanner.next();			
			String title = lineScanner.next();
			
			// Convert lent out string to a boolean.
			// We assume the read string is either IN or OUT.
			boolean isLentOut = false;
			if (isLentOutString.equals("OUT")) {
				isLentOut = true;
			}
			
			switch (typeOfItem) {
			case "BOOK":				
				String author = lineScanner.next();
				int bookYear = lineScanner.nextInt();				
				String isbn = lineScanner.next();
				item = new Book(isLentOut, title, author, bookYear, isbn);
				break;
			case "DVD":
				int dvdYear = lineScanner.nextInt();
				String ageRating = lineScanner.next();
				String director = lineScanner.next();
				int runtime = lineScanner.nextInt();				
				item = new DVD(isLentOut, title, dvdYear, ageRating, director, runtime);
				break;			
			default:
				lineScanner.close(); // Don't forget to close the scanner before the exception is thrown
				fileScanner.close();
				throw new RuntimeException("Unexpected item type: " + typeOfItem);				
			}
			
			items.add(item);
			
			lineScanner.close();
		}

		fileScanner.close();
	}

	/**
	 * Prints all the items.
	 * @param onlyPrintItemsWhichAreOut If this is true then only print out items which are currently lent out.
	 * If it is false then all items are printed,
	 */
	public static void printItems(boolean onlyPrintItemsWhichAreOut) {
		
		if (onlyPrintItemsWhichAreOut) {
			System.out.println("Items Which Are Currently Out");
			System.out.println("-------------------");
		} else {
			System.out.println("All Items");
			System.out.println("---------");
		}

		boolean printedAtLeastOneItem = false;
		for (Item item : items) {
			if (item.isLentOut() || !onlyPrintItemsWhichAreOut) {
				System.out.println(item.getShortDescription());
				printedAtLeastOneItem = true;
			}
		}
		if (!printedAtLeastOneItem) {
			System.out.println("<none>");
		}
	}

	/**
	 * Display a menu to allow an item to be lent out.
	 */
	public static void lendOutItem() {
		// Filter out only the items which are out
		ArrayList<Item> notOutItems = new ArrayList<Item>();
		for(int i = 0; i < items.size(); i++) {
			Item item = items.get(i);
			if (!item.isLentOut()) {
				notOutItems.add(item);
			}
		}
		
		if(notOutItems.isEmpty()) {
			System.out.println("All items are currently out. There are no items to lend out.");
			return;
		}


		// Build menu
		Menu lendOutMenu = new Menu("Lend Out Item Menu", keyboardScanner);
		for(int i = 0; i < notOutItems.size(); i++) {
			lendOutMenu.addOption(notOutItems.get(i).getShortDescription());	
		}
		lendOutMenu.addOption("Cancel");

		// Get and process choice
		int choice = lendOutMenu.executeMenu();
		System.out.println(LINE_BREAK);
		
		if (choice == lendOutMenu.numberOfOptions()) {			
			System.out.println("Lend out item cancelled");
			return;
		}

		Item itemToLendOut = notOutItems.get(choice - 1); // Menu starts from 1 not zero.
		itemToLendOut.setIsLentOut(true);
		
		System.out.println("Item successfully lent out: " + itemToLendOut.getShortDescription());
	}

	/**
	 * Display a menu to allow an item to be returned.
	 */
	public static void returnItem() {
		// Filter out only the items which are out
		ArrayList<Item> outItems = new ArrayList<Item>();
		for(int i = 0; i < items.size(); i++) {
			Item item = items.get(i);
			if (item.isLentOut()) {
				outItems.add(item);
			}
		}

		if(outItems.isEmpty()) {
			System.out.println("All items are currently not out. There are no items to return.");
			return;
		}

		
		// Build menu
		Menu returnMenu = new Menu("Return Item Menu", keyboardScanner);
		for(int i = 0; i < outItems.size(); i++) {
			returnMenu.addOption(outItems.get(i).getShortDescription());	
		}
		returnMenu.addOption("Cancel");

		// Get and process choice
		int choice = returnMenu.executeMenu();
		System.out.println(LINE_BREAK);
		
		if (choice == returnMenu.numberOfOptions()) {
			System.out.println("Return item cancelled");
			return;
		}

		Item itemToReturn = outItems.get(choice - 1); // Menu starts from 1 not zero.
		itemToReturn.setIsLentOut(false);
		
		System.out.println("Item successfully returned: " + itemToReturn.getShortDescription());
	}

	/**
	 * Write out the list of items to the data file.
	 * This writes the list out in the same format as the input expects.
	 * @throws FileNotFoundException
	 */
	public static void writeItemsToFile() throws FileNotFoundException {
		PrintWriter out = new PrintWriter(FILENAME);

		for (Item item : items) {
			out.println(item.toStringForFile());
		}

		out.close();
	}

	/**
	 * Displays a menu to allow detailed information about an item to be displayed.
	 */
	public static void printDetailedItem() {
		if(items.size() == 0) {
			System.out.println("There are no items to print out detailed information for.");
			return;
		}

		// Build menu
		Menu detailedInfoMenu = new Menu("Detailed Information Menu", keyboardScanner);
		for(int i = 0; i < items.size(); i++) {
			detailedInfoMenu.addOption(items.get(i).getShortDescription());	
		}
		detailedInfoMenu.addOption("Cancel");

		// Get and process choice
		int choice = detailedInfoMenu.executeMenu();
		System.out.println(LINE_BREAK);
		
		if (choice == detailedInfoMenu.numberOfOptions()) {
			System.out.println("Detailed information cancelled");
			return;
		}
		
		System.out.println("Detailed Information");
		System.out.println("--------------------");

		Item item = items.get(choice - 1); // Menu starts from 1 not zero.
		System.out.println(item.getDetailedDescription());
	}
	
	/**
	 * Save the item data to file.
	 */
	public static void saveFile() {
		// Save data back to file
		try {
			writeItemsToFile();
		} catch (FileNotFoundException e) {
			System.out.println("Error: Could not write data to file: " + FILENAME + " was not found.");
		}
	}
	
	/**
	 * Displays a menu to allow an item to be deleted.
	 */
	public static void deleteItem() {
		if(items.size() == 0) {
			System.out.println("There are no items to delete.");
			return;
		}

		// Build menu
		Menu deleteMenu = new Menu("Delete Item Menu", keyboardScanner);
		for(int i = 0; i < items.size(); i++) {
			deleteMenu.addOption(items.get(i).getShortDescription());	
		}
		deleteMenu.addOption("Cancel");

		// Get and process choice
		int choice = deleteMenu.executeMenu();
		System.out.println(LINE_BREAK);
		
		if (choice == deleteMenu.numberOfOptions()) {
			System.out.println("Delete item cancelled");
			return;
		}
		
		// Remember the item which is to be deleted so we can print it after we delete it.
		Item deletedItem = items.get(choice - 1); // Menu starts from 1 not zero.
		items.remove(choice - 1);
		
		System.out.println("Item successfully deleted: " + deletedItem.getShortDescription());
	}

	/**
	 * Allow the user to add a new item.
	 */
	public static void addNewItem() {
		System.out.println("Add new Item");
		System.out.println("-------------------");
		
		// Build menu
		Menu itemTypeMenu = new Menu("Item Type", keyboardScanner);
		itemTypeMenu.addOption("Book");
		itemTypeMenu.addOption("DVD");
		int choice = itemTypeMenu.executeMenu("Which type of item would you like to add: ");
		
		Item newItem = null;
		
		// Menu starts from 1 not zero.
		switch (choice - 1) {
		case 0:
			newItem = readNewBook();
			break;
		case 1:			
			newItem = readNewDVD();
			break;
		}
		
		items.add(newItem);
		
		System.out.println("Item successfully added: " + newItem.getShortDescription());
	}
	
	/**
	 * Read a new book from the user.
	 * @return A book object that the user entered.
	 */
	public static Book readNewBook() {
		String title = ReadUtility.readStringWithoutCommas(keyboardScanner, "Title: ");
		String author = ReadUtility.readStringWithoutCommas(keyboardScanner, "Author: ");
		int year = ReadUtility.readIntBetween(keyboardScanner, "Year: ", 0, 9999);				
		String isbn = ReadUtility.readStringWithoutCommas(keyboardScanner, "ISBN: ");
		return new Book(false, title, author, year, isbn);
	}

	/**
	 * Read a new DVD from the user.
	 * @return A DVD object that the user entered.
	 */
	public static DVD readNewDVD() {
		String title = ReadUtility.readStringWithoutCommas(keyboardScanner, "Title: ");
		int year = ReadUtility.readIntBetween(keyboardScanner, "Year: ", 0, 9999);
		String ageRating = ReadUtility.readStringWithoutCommas(keyboardScanner, "Age Rating: ");
		String director = ReadUtility.readStringWithoutCommas(keyboardScanner, "Director: ");
		int runtime = ReadUtility.readIntBetween(keyboardScanner, "Runtime: ", 0, 9999);				
		return new DVD(false, title, year, ageRating, director, runtime);
	}
}