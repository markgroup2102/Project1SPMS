package com.revature.factories;

public abstract interface Dessert {
	
}
/**
// Abstract Data Type
public interface Dessert {}

// Classes that inherit the abstract data type
public class Cake implements Dessert {}

public class Cookie implements Dessert {}

public class IceCream implements Dessert {}

// Good practice to throw an exception if the desired concrete instance is not found
public class DessertNotFoundException extends RuntimeException {}

// Factory class that returns the concrete instance
public class DessertFactory {
    public static Dessert getDessert(String dessertType) {
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

    public class Demo {
        public static void main(String[] args) {
            Dessert d1 = DessertFactory.getDessert("cake");
            Dessert d2 = DessertFactory.getDessert("cookie");
            Dessert d3 = DessertFactory.getDessert("ice cream");
            Dessert d4 = DessertFactory.getDessert("candy");    // Throws DessertNotFoundException
        }
    }
}
*/