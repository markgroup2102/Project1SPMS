package practicecar;

public class CarPartFuelTank extends CarPart {

	// Capacity is in gallons, 
	private final int MIN_CAPACITY_IN_GALLONS = 0;
	private int fuelCapacityInGallons = MIN_CAPACITY_IN_GALLONS;
	
	private int fuelInTankInGallons = 0;
	
	public CarPartFuelTank() {
		
	}

	public CarPartFuelTank(int condition) {
		super(condition);
		
	}
	
	public CarPartFuelTank(int condition, int capacity) {
		super(condition);
		setCapacity(capacity);
	}

	@Override
	public void function() {
		System.out.println("  Fuel Capacity in Gallons : " + this.getCapacity());
		System.out.println("  Fuel in tank in Gallons  : " + this.getFuelInTankInGallons());
	}

	public int getCapacity() {
		return fuelCapacityInGallons;
	}

	public void setCapacity(int capacity) {
		capacity = Math.max(MIN_CAPACITY_IN_GALLONS, capacity);
		this.fuelCapacityInGallons = capacity;
	}

	public int getFuelInTankInGallons() {
		return fuelInTankInGallons;
	}

	public void setFuelInTankInGallons(int fuelInTankInGallons) {
		fuelInTankInGallons = Math.max(0, fuelInTankInGallons);
		fuelInTankInGallons = Math.min(fuelInTankInGallons, this.getCapacity());
		this.fuelInTankInGallons = fuelInTankInGallons;
	}

}
