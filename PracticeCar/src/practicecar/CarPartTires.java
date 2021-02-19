package practicecar;

public class CarPartTires extends CarPart {

	
	private final int MINIMUM_NUMBER_OF_TIRES = 0;
	private int numberOfTires = MINIMUM_NUMBER_OF_TIRES;
	
	public CarPartTires() {

	}

	public CarPartTires(int condition) {
		super(condition);

	}
	
	public CarPartTires(int condition, int numberOfTires) {
		super(condition);
		this.setNumberOfTires(numberOfTires);

	}

	@Override
	public void function() {
		System.out.println("  Number of Tires : " + this.getNumberOfTires());

	}
	
	public int getNumberOfTires() {
		return numberOfTires;
	}

	public void setNumberOfTires(int numberOfTires) {
		numberOfTires = Math.max(this.MINIMUM_NUMBER_OF_TIRES, numberOfTires);
		this.numberOfTires = numberOfTires;
	}

}
