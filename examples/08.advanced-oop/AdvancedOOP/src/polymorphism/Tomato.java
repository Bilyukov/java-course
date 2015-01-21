package polymorphism;

public class Tomato extends Vegetable implements Growable  {

	private int weight;
	
	public Tomato(int weight) {
		this.weight = weight;
		this.name = "Tomato";
		this.color = "Red";
	}
	
	@Override
	public void grow() {
		this.weight += 10;
	}
	
	@Override
	public String toString() {
		String vegiString = super.toString();
		return vegiString + " Weight: " + this.weight + " gr.";
	}

}
