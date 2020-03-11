


public class Car extends Vehicle {
	private int numSeats;
	private boolean cruiseControl;
	private int numDoors;
	
	
	
	    public Car(Boolean rented, String make, String model, String numberPlate, int numSeats, Boolean cruiseControl, int numDoors) {
	        super(rented, make, model, numberPlate);
	        setNumSeats(numSeats);
	        setCruiseControl(cruiseControl);
	        setNumDoors(numDoors);
	        
	    }
	    
	    public void setNumSeats(int numSeats) {
		this.numSeats = numSeats;
	}
	
		    public void setNumDoors(int numDoors) {
		this.numDoors = numDoors;
	}
	
	public int getNumSeats(){
	    
	    return numSeats;
	}
	
	public int getNumDoors(){
	    return numDoors;
	}
	
	
	public String toString() {
	    String cruiseStatus = getCruiseControl();
		return super.toString() + " " + numSeats + " " + cruiseStatus + " " + numDoors ;
	}
	
			public void setCruiseControl(boolean cruiseControl) {
		this.cruiseControl = cruiseControl;
		
	}
	
		public boolean cruiseControl() {
		    
		return cruiseControl;
	}
	
	public String getCruiseControl() { //change this to public
		if (cruiseControl) {
			return "Has Cruise Control";
		} else {
			return "No Cruise Control";
		}
	}
	
	
	}
	
	