package keywords;

public class Application {
	
	public Application() {
		
	}
	
	public static void main(String[] args) {
		System.out.println(StaticClass.computSum(30, 40));
		System.out.println(FinalClass.getConstant());
		
		Concrete c = new Concrete();
		c.run();
	}
}
