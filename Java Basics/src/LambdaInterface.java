
/**
 * This is a functional interface it only has one abstract method 
 * @author mwhis
 *
 */
@FunctionalInterface // prevents accidentally making it not a functional interface
public interface LambdaInterface {
	public void doSomething();
	
	//public void doSomethingAgain();
	
	public default void doSomethingElse() {
		System.out.println("I have a body");
	}
}
