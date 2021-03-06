
public class OopPrinciples {

	public static void main(String[] args) {
		Shape first = new Square(3.12f);
		float firstArea = first.calculateArea();
		
		Shape second = new Rectangle(12.3f, 6.18f);
		float secondArea = second.calculateArea();
		
		System.out.printf("First Shape name: %s \n, Area %f\n", first.getName(), firstArea);
		System.out.printf("Second Shape name: %s \n, Area %f\n", second.getName(), secondArea);

	}

}
