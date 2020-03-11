

public class Vehicle {
	private String make;
	private String model;
	private String numberPlate;
	private boolean rented;
	
	
	
		public void setMake(String make) {
		this.make = make;
	}
	
		public void setModel(String model) {
		this.model = model;
	}
	
		public void setNumberPlate(String numberPlate) {
		this.numberPlate = numberPlate;
	}
	
	
	
		public String getMake() {
		return make;
	}
	
		public String getModel() {
		return model;
	}

    	public String getNumberPlate() {
		return numberPlate;
	}
	
		public Vehicle(boolean rented, String make, String model, String numberPlate) {
		
		setRented(rented);
		setMake(make);
		setModel(model);
		setNumberPlate(numberPlate);
		
		
	}
	
		public void setRented(boolean rented) {
		this.rented = rented;
		
	}
	
		public boolean rented() {
		    
		return rented;
	}
	
	protected String getRentedBoolean() { //change this to public
		if (rented) {
			return "Rented";
		} else {
			return "Not rented";
		}
	}
		
		
		public String toString() {
		String vehicleStatus = getRentedBoolean();
		return this.getClass().getName() + " " + vehicleStatus + " " + make + " " + model + " " + numberPlate ;
	}
	
	
}