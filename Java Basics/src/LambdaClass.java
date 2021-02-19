
public class LambdaClass {

	public LambdaClass() {
		// TODO Auto-generated constructor stub
	}

	private static void lambda() {
		// Runnable has one method run()
		                // \/ sinc erun takes in to args we use empty parentheis 
		Runnable runLamb = () -> 
		{ // This overrides the run method 
			System.out.println("lambda thread");
		};
		
		Thread lamThread = new Thread(runLamb);
		lamThread.start();
	}
	
	public static void main(String[] args) {
		LambdaClass.lambda();
	}

}
