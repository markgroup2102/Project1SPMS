package Objects;

public class Application {

	public static void main(String[] args) {
		MyObject o1 = new MyObject(789);
		MyObject o2 = new MyObject(789);
		MyObject o3 = new MyObject(788);
		System.out.println("Does object 1 = Object 2? :" + o1.equals(o2));
		System.out.println("Does object 1 = Object 3? :" + o1.equals(o3));
	}

}
