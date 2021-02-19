package Objects;

public class MyObject {
	
	private long id;
	public MyObject(long id) {
		this.id = id;
	}
	
	@Override
	public boolean equals(Object o) {
		return (o instanceof MyObject && ((MyObject) o).id == this.id);
	}
}
