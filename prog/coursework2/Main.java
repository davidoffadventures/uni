//Main application for the programe


import java.io.FileNotFoundException;

import java.util.ArrayList;
import java.io.File;
import java.util.Scanner;
//import java.io.PrintWriter;

public class Main {
    
    static ArrayList<Vehicle>vehiclesList; //Global variable to store all vehicles
    static ArrayList<Vehicle>vehiclesList2; //Global variable to store all vehicles
    
    public static void main(String[] args) throws FileNotFoundException {
        
        vehiclesList = new ArrayList<Vehicle>();
        vehiclesList2 = new ArrayList<Vehicle>();
        
        //  Vehicle vehicle1 = new Vehicle(true, "Honda", "Jazz", "s21312");
        //  System.out.println(vehicle1);
        
        //  Car car1 = new Car(true, "Mazda", "Bongo", "P716", 4, false, 4);
        //  System.out.println(car1);
        
        // Motorhome motorhome1 = new Motorhome(true, "Ford", "Mondeo", "Squiggle", 2, true, false);
        // System.out.println(motorhome1);
        
        
       
        
    
			readFile(); //Method called to read VehicleData file
			openMenu(); //Method called to read vehicleData

    }
    
    
    
     
    
        public static void readFile() throws FileNotFoundException {
            
            File inputFile = new File("./VehicleData.txt"); //May need to change the location of source depending on IDE
            
              Scanner in = new Scanner(inputFile);
              
              while (in.hasNextLine()){
                  
                  String vehicleType = in.nextLine();
                  Scanner scanFile = new Scanner(vehicleType);
                  
                  scanFile.useDelimiter(",+");
                  
                  String whatVehicleType = scanFile.next();
                  
                  String vehicleRented = scanFile.next();
                  
                  String vehicleMake = scanFile.next();
                  
                  String vehicleModel = scanFile.next();
                  
                  String vehiclePlate = scanFile.next();
                  
                  Vehicle vehicleFromFile = null;
                  
                  	boolean rented = true;
			        if (vehicleRented.equalsIgnoreCase("in")) {
				    rented = false;
			            }
                  
                 
                  
                  switch (whatVehicleType) {
			        case "CAR":
			            
			          int vehicleSeats = scanFile.nextInt();
			          String vehicleCruiseText = scanFile.next();
			          boolean cruiseControl = true;
			          if (vehicleCruiseText.equalsIgnoreCase("false")){
			              cruiseControl = false;
			          }
	                  int vehicleDoors = scanFile.nextInt();
			          vehicleFromFile = new Car(rented, vehicleMake, vehicleModel, vehiclePlate, vehicleSeats, cruiseControl, vehicleDoors);
			          break;
			          
			          case "MOTORHOME":
			              int vehicleBeds = scanFile.nextInt();
			              
			              String vehicleToiletText = scanFile.next();
			          boolean toilet = true;
			          if (vehicleToiletText.equalsIgnoreCase("false")){
			              toilet = false;
			          }
			          
			             String vehicleLicenseText = scanFile.next();
			          boolean nonStandardLicenceReq = true;
			          if (vehicleLicenseText.equalsIgnoreCase("false")){
			              nonStandardLicenceReq = false;
			          }
			          vehicleFromFile = new Motorhome(rented, vehicleMake, vehicleModel, vehiclePlate, vehicleBeds, toilet, nonStandardLicenceReq);
			          
			              
			            
			             
                  }     
                  
            
			            
			           vehiclesList.add(vehicleFromFile);
			           
			           System.out.println(vehicleFromFile);
			       
                
                   
                 
              }
              
             
              
              
        }
        
         public static void openMenu() {
             
             Scanner scanner = new Scanner(System.in);
          Menu openMenu = new Menu("Main Menu", scanner);
          openMenu.addOption("Print All Vehicles");
          openMenu.addOption("Print Rented Vehicles");
          openMenu.addOption("Detailed Vehicle Printout");
          openMenu.addOption("Add Vehicle");
          openMenu.addOption("Delete Vehicle");
          openMenu.addOption("Search");
          openMenu.addOption("Quit");
          
          
          boolean exitMenu = false;
          while (exitMenu != true){
          
          int choice = openMenu.executeMenu();
          
          switch(choice) {
              case 1:
                  printAllvehicles();
                  break;
                  case 2:
                      System.out.println("you selected option B");
                      break;
                      case 3: 
                          System.out.println("you selected option C");
                  break;
                  case 4: 
                      System.out.println("You chose to quit");
                      exitMenu = true;
                      break;
        
         }
          }
         }
         
         
         public static void printAllvehicles(){
               System.out.println(vehicleFromFile);
                System.out.println(Vehicle);
            
         }
         
         
         
}


        
      
    
    
    


    