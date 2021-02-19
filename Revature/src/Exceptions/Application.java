package Exceptions;

public class Application {
	public static void main(String[] args) {
		Runner r = new Runner();
		try {
			r.run();
		} catch (CustomException e){
			e.printStackTrace();
		}
		System.out.println("THe program did not crash!");
		/*catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		*/
	}
}
