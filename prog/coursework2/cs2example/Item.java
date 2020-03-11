/**
 * A class representing an item.
 * @author Liam O'Reilly
 */
public abstract class Item {
	private String title;
	private boolean isLentOut;

	/**
	 * Constructs an item with a specified title and lent out status.
	 * @param isLentOut true if the item is currently lent out, false otherwise.
	 * @param title The title of the item.
	 */
	public Item(boolean isLentOut, String title) {
		setIsLentOut(isLentOut);
		setTitle(title);
	}
	
	/**
	 * Gets the title of the item.
	 * @return The title of the item.
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * Sets the title of the title.
	 * @param title The new title of the title.
	 */
	public void setTitle(String title) {
		this.title = title;
	}
		
	/**
	 * Gets the lent out status of the item.
	 * @return true if the item is currently lent out, false otherwise.
	 */
	public boolean isLentOut() {
		return isLentOut;
	}

	/**
	 * Sets the lent out status of the item
	 * @param isLentOut true if the item is currently lent out, false otherwise.
	 */
	public void setIsLentOut(boolean isLentOut) {
		this.isLentOut = isLentOut;
	}

	/**
	 * Get the lent out status as a IN or OUT.
	 * @return OUT if lent out status is true, IN otherwise.
	 */
	protected String getLentOutStatusAsStringInOrOut() {
		if (isLentOut) {
			return "OUT";
		} else {
			return "IN";
		}
	}
	
	/**
	 * Converts the item to a string. This is used only for debugging.
	 * @return String representation of the item.
	 */
	public String toString() {
		String lentStatus = getLentOutStatusAsStringInOrOut();
		return this.getClass().getName() + " (" + lentStatus + ") " + title;
	}
	
	/**
	 * Gets a short description of the item.
	 * This classes can not provide a description, so subclasses will need to implement this method.
	 * @return Short description of the item.
	 */
	public abstract String getShortDescription();

	/**
	 * Gets a detailed description of the item suitable for printing.
	 * @return Detailed description of the item.
	 */
	public String getDetailedDescription() {
		String lentStatus = isLentOut ? "Out" : "In";
		return this.getClass().getName() + ":" +		
			"\n\tStatus:\t\t" + lentStatus +
			"\n\tTitle:\t\t" + title;
	}
	
	/**
	 * Gets a string representation suitable for use in the data file.
	 * This classes can not provide a description, so subclasses will need to implement this method.
	 * @return A string representing this item.
	 */
	public abstract String toStringForFile();	
}
