package practicecar;


/**
 * CarPart is a part of a car.
 * This is set to abstract to prevent instantiation as a carpart 
 * is only an idea. For example: would you want a surgeon operating on you 
 * if they only had the specification "body part" to operate on? No?
 * The same principle applies here. 
 * @author mwhiskeyman
 *
 */
public abstract class CarPart implements CarFunctionalInterface{
	
	// Condition is the remaining durability of a part
	private int condition;
	private static int MAX_CONDITION = 100; // A part cannot be more than 100 durable
	private static int MIN_CONDITION = 0;   // If a part reaches 0 it's broken

	/**
	 * If no condition is specified the condition will defailt to the max
	 */
	public CarPart() {
		this(MAX_CONDITION);
	}
	
	/**
	 * Constructor chaining to simulate default variables 
	 * If a condition is specified it'll be set
	 * @param condition
	 */
	public CarPart(int condition) {
		setCondition(condition);
	}
	
	/**
	 * 
	 * @return the value of the condition
	 */
	public int getCondition() {
		return condition;
	}

	/**
	 * Sets a condition within min and max condition ranges
	 * @param condition
	 */
	public void setCondition(int condition) {
		// Condition must be within min and max conditions
		condition = Math.min(condition, MAX_CONDITION);
		condition = Math.max(MIN_CONDITION, condition);
		this.condition = condition;
	}
	
	/**
	 * Shows the name of the part and its condition
	 * Then calls the function of part to get unique information.
	 * This works because the child class inherits this function 
	 * and then calls this function from the child class, 
	 * thus the class it gets is its own class and not 
	 * the class of the parent 
	 * 
	 */
	public void status(){
		// Each CarPart is named "CarPartxxxxx" to show that it IS-A 
		// CarPart. When we get the class it returns something like 
		// class packageName.CarPartChassis which we use a substring on to extract only
		// the part of the name  that says "Chassis" 
		// Keeping naming consistent will ensure these lines of code work.
		 int classAndPackageLength =  16 +  Class.class.getPackageName().length();
		 String s = this.getClass().toString().substring(classAndPackageLength);
		
		 System.out.println("Name : " + s + "\n  Condition : " + this.getCondition());
		 this.function();
	}
	
	/**
	 * CarPart has no function of its own, 
	 * this is used to allow for specialization.
	 * When this is called it should return 
	 * the unique characteristics of the extended CarPart
	 */
	abstract public void function();
}
