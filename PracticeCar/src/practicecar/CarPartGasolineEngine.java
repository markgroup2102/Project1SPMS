package practicecar;

public class CarPartGasolineEngine extends CarPart{

	
	private static int MIN_CYLINDERS = 1;
	private int cylinders = MIN_CYLINDERS;
	
	public CarPartGasolineEngine() {
		super();
	}
	
	public CarPartGasolineEngine(int condition) {
		super(condition);
	}
	
	public CarPartGasolineEngine(int condition, int cylinders) {
		this(condition);
		setCylinders(cylinders);;
	}
	
	@Override
	public void function() {
		System.out.println("  Cylinders : " + this.getCylinders());
	}

	public int getCylinders() {
		return cylinders;
	}

	public void setCylinders(int cylinders) {
		cylinders = Math.max(MIN_CYLINDERS, cylinders);
		this.cylinders = cylinders;
	}
}
