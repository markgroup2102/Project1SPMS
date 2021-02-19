package practicecar;

public class CarPartDoors extends CarPart {

	
	private final int MINIMUM_NUMBER_OF_DOORS = 0;
	private int numberOfDoors = MINIMUM_NUMBER_OF_DOORS;
	
	public CarPartDoors() {
		// TODO Auto-generated constructor stub
	}

	public CarPartDoors(int condition) {
		super(condition);
		// TODO Auto-generated constructor stub
	}
	
	public CarPartDoors(int condition, int numberOfDoors) {
		super(condition);
		this.setNumberOfDoors(numberOfDoors);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void function() {
		System.out.println("  Number of doors : " + this.getNumberOfDoors());

	}
	
	public int getNumberOfDoors() {
		return numberOfDoors;
	}

	public void setNumberOfDoors(int numberOfDoors) {
		numberOfDoors = Math.max(this.MINIMUM_NUMBER_OF_DOORS, numberOfDoors);
		this.numberOfDoors = numberOfDoors;
	}

}
