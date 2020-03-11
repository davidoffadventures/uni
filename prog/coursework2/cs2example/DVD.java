/**
 * A class representing a DVD.
 * @author Liam O'Reilly
 *
 */
public class DVD extends Item {
	private String ageRating;
	private int year;
	private String director;
	private int runtime; // in minutes

	/**
	 * Creates a DVD.
	 * @param isLentOut true if the item is currently lent out, false otherwise.	 * 
	 * @param title The title of the DVD.
	 * @param year The year of the DVD.
	 * @param ageRating The age rating of the DVD.
	 * @param director The director of the DVD.
	 * @param runtime The runtime (in minutes) of the DVD.
	 */
	public DVD(boolean isLentOut, String title, int year, String ageRating, String director, int runtime) {
		super(isLentOut, title);
		setAgeRating(ageRating);
		setYear(year);
		setDirector(director);
		setRuntime(runtime);
	}

	/**
	 * Gets the year of the DVD.
	 * @return The year of the DVD.
	 */
	public int getYear() {
		return year;
	}

	/**
	 * Sets the year of the DVD.
	 * @param year The new year of the DVD.
	 */
	public void setYear(int year) {
		this.year = year;
	}
	
	/**
	 * Gets the age rating of the DVD.
	 * @return The age rating of the DVD.
	 */	
	public String getAgeRating() {
		return ageRating;
	}

	/**
	 * Sets the age rating of the DVD.
	 * @param year The new age rating of the DVD.
	 */
	public void setAgeRating(String ageRating) {
		this.ageRating = ageRating;
	}
	
	/**
	 * Gets the director of the DVD.
	 * @return The director of the DVD.
	 */
	public String getDirector() {
		return director;
	}

	/**
	 * Sets the director of the DVD.
	 * @param director The new year of the DVD.
	 */
	public void setDirector(String director) {
		this.director = director;
	}
	
	/**
	 * Gets the runtime of the DVD.
	 * @return The runtime of the DVD in minutes.
	 */
	public int getRuntime() {
		return runtime;
	}

	/**
	 * Sets the runtime of the DVD.
	 * @param runtime The new runtime of the DVD in minutes.
	 */
	public void setRuntime(int runtime) {
		this.runtime = runtime;
	}

	/**
	 * Converts the DVD to a string. This is used only for debugging.
	 * @return String representation of the DVD.
	 */
	public String toString() {
		return super.toString() + ", " + year + ", " + ageRating + ", " + director + ", " + runtime;
	}

	/**
	 * Gets a short description of the DVD.
	 * @return Short description of the DVD.
	 */
	public String getShortDescription() {
		return getTitle() + ", " + year + " (DVD)";
	}

	/**
	 * Gets a detailed description of the DVD suitable for printing.
	 * @return Detailed description of the DVD.
	 */
	public String getDetailedDescription() {
		return super.getDetailedDescription() + 
				"\n\tYear:\t\t" + year +		
				"\n\tAge Rating:\t" + ageRating +		
				"\n\tDirector:\t" + director +
				"\n\tRuntime:\t" + runtime;  
	}
	
	/**
	 * Gets a string representation suitable for use in the data file.
	 * @return A string representing this DVD.
	 */
	public String toStringForFile() {
		return "DVD," + getLentOutStatusAsStringInOrOut() + "," + getTitle() + "," + year + "," + ageRating + "," + director + "," + runtime; 
	}
}
