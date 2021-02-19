package com.revature.factories;

import java.util.ArrayList;
import java.util.List;

public class FactoryDemo {

	public FactoryDemo() {
		
		
	}
	public static void main(String[] args) {
		List<Dessert> desserts = new ArrayList<Dessert>();
		desserts.add(DessertFactory.getDessert("Cake"));
		desserts.add(DessertFactory.getDessert("cookie"));
		desserts.add(DessertFactory.getDessert("icecream"));
		//desserts.forEach( () -> System.out.println("A") );
	}

}
