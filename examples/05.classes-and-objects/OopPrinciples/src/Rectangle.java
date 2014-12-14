
public class Rectangle extends Shape {
	
	private float width;
	private float height;
	
	
	public Rectangle(float width, float height) {
		super("Rectangle");
		
		this.width = width;
		this.height = height;
		
		// TODO Auto-generated constructor stub
	}
	
	public float getWidth() {
		return width;
	}

	public void setWidth(float width) {
		this.width = width;
	}

	public float getHeight() {
		return height;
	}
	
	public void setHeight(float height) {
		this.height = height;
	}

	@Override
	public float calculateArea() {
		return this.width * this.height;
	}

}
