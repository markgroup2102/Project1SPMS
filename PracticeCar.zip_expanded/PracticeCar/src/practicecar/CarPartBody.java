package practicecar;

public class CarPartBody extends CarPart {

	private String material = "";
	public CarPartBody() {
		// TODO Auto-generated constructor stub
	}

	public CarPartBody(int condition) {
		super(condition);
		// TODO Auto-generated constructor stub
	}
	
	public CarPartBody(int condition, String material) {
		super(condition);
		this.setMaterial(material);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void function() {
		System.out.println("  Body Material: " + this.getMaterial());

	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		if(material == null || material.equals("")) {
			material = "Unknown";
		}
		this.material = material;
	}

}
