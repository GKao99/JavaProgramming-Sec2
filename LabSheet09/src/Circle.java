
public class Circle {
	// The constants
	public static final double DEFAULT_RADIUS = 1.0;
	public static final String DEFAULT_COLOR = "Red";
	// The private 2 attributes
	private double radius;
	private String color;
	//Default Constructs a Circle with default radius and color
	//1st Constructor
	Circle(){
		this.radius = DEFAULT_RADIUS;
		this.color = DEFAULT_COLOR;
	}
	//2nd Constructor
	Circle(double radius){
		this.radius = radius;
		this.color = DEFAULT_COLOR;
	}
	//3rd Constructor
	Circle(double radius,String color){
		this.radius=radius;
		this.color=color;
	}
	
	public double getRadius() {
		return this.radius;
	}
	
	public void setRadius(double radius) {
		this.radius=radius;
	}
	
	public String getColor() {
		return this.color;
	}
	
	public void setColor(String color) {
		this.color=color;
	}
	
	public String toString() {
		return "Circle[radius =]"+this.radius+", color = "+color+"]";
	}
	public double getArea() {
		return Math.PI * Math.pow(radius, 2);
	}
	
	public double getCircumference() {
		return 2.0 * Math.PI * radius;
	}
	
	

}
