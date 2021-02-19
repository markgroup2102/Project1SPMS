package com.revature.factories;

public class DessertFactory {
	public static Dessert getDessert(String dessertType) {
		dessertType =  dessertType.toLowerCase();
	    switch(dessertType) {
	        case "cake":
	        return new Cake();
	    case "cookie":
	        return new Cookie();
	    case "ice cream":
	        return new IceCream();
	    default:
	        throw new DessertNotFoundException(dessertType + " not found!");
	        }
	    }   
}
