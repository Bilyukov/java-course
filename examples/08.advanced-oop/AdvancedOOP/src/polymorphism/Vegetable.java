package polymorphism;

public class Vegetable {
	protected String name;
	protected String color;
	
	@Override
	public String toString() {
		return this.color + " " + this.name;
	}
}
