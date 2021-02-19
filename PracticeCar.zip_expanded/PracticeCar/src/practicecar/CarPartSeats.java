package practicecar;

public class CarPartSeats extends CarPart {

	
	private final int MINIMUM_NUMBER_OF_SEATS = 0;
	private int numberOfSeats = MINIMUM_NUMBER_OF_SEATS;
	
	public CarPartSeats() {

	}

	public CarPartSeats(int condition) {
		super(condition);

	}
	
	public CarPartSeats(int condition, int numberOfSeats) {
		super(condition);
		this.setNumberOfSeats(numberOfSeats);

	}

	@Override
	public void function() {
		System.out.println("  Number of Seats : " + this.getNumberOfSeats());

	}
	
	public int getNumberOfSeats() {
		return numberOfSeats;
	}

	public void setNumberOfSeats(int numberOfSeats) {
		numberOfSeats = Math.max(this.MINIMUM_NUMBER_OF_SEATS, numberOfSeats);
		this.numberOfSeats = numberOfSeats;
	}

}
