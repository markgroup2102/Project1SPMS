package practicecar;

import java.util.ArrayList;
import java.util.List;

/**
 * Lists the components of a car object
 * @author mwhiskeyman
 *
 */
public class Car {

	// This holds all the car's parts
	List<CarPart> listOfCarParts;
	
	public void run() {
		listOfCarParts = new ArrayList<CarPart>();
		
		// This section adds Parts to a car 
		// This works because each part extends 
		// the class carpart
		listOfCarParts.add(new CarPartChassis(100, null));
		listOfCarParts.add(new CarPartBody(100, null));
		listOfCarParts.add(new CarPartGasolineEngine(50));
		listOfCarParts.add(new CarPartFuelTank(105, 10));
		listOfCarParts.add(new CarPartTires(100, -10));
		listOfCarParts.add(new CarPartDoors(100, -5));
		listOfCarParts.add(new CarPartSeats(100, -5));
		
		// Here we show the status of each of the parts in the list
		for(CarPart c : listOfCarParts) {
			c.status();
		}
	}

}
