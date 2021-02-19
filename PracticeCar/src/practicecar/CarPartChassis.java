package practicecar;

public class CarPartChassis extends CarPart {

	private String material = "";
	public CarPartChassis() {
		// TODO Auto-generated constructor stub
	}

	public CarPartChassis(int condition) {
		super(condition);
		// TODO Auto-generated constructor stub
	}
	
	public CarPartChassis(int condition, String material) {
		super(condition);
		this.setMaterial(material);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void function() {
		System.out.println("  Chassis Material: " + this.getMaterial());

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
