


public class Motorhome extends Vehicle {
    
    private int numBed;
    boolean toilet;
    boolean nonStandardLicenceReq;
    
    public Motorhome(Boolean rented, String make, String model, String numberPlate, int numBed, Boolean toilet, Boolean nonStandardLicenceReq) {
	        super(rented, make, model, numberPlate);
	        setNumBed(numBed);
	        setToilet(toilet);
	        setNonStandardLicenceReg(nonStandardLicenceReq);
	    }
	    
	    
 public void setNumBed(int numBed){
     this.numBed = numBed;
 }    
 
 public int getNumBed(){
     return numBed;
 }
 
	
			public void setToilet(boolean toilet) {
		this.toilet = toilet;
		
	}
	
		public boolean toilet() {
		    
		return toilet;
	}
	
	public String getToilet() { //change this to public
		if (toilet) {
			return "Has Toilet";
		} else {
			return "No Toilet";
		}
	}
	
				public void setNonStandardLicenceReg(boolean nonStandardLicenceReq) {
		this.nonStandardLicenceReq = nonStandardLicenceReq;
		
	}
	
		public boolean nonStandardLicenceReq() {
		    
		return nonStandardLicenceReq;
	}
	
	public String getNonStandardLicenceReq() { //change this to public
		if (nonStandardLicenceReq) {
			return "Non-standard licence required";
		} else {
			return "Standard licence required";
		}
	}
	
	
	
	
 	public String toString() {
	    String toiletStatus = getToilet();
	    String licenceStatus = getNonStandardLicenceReq();
		return super.toString() + " " + numBed + " " + toiletStatus + " " + licenceStatus;
	}
    
    
    
}