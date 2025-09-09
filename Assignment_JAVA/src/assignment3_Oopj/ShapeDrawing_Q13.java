package assignment3_Oopj;

abstract class Shape1{
	public abstract void draw();
}

class Circle1 extends Shape1{
	double radius;
	
	public Circle1(double radius) {
		this.radius = radius;
	}

	@Override
	public void draw() {
		System.out.println("Drawing Circle of radius = " + radius);
	}
	
}

class Rectangle1 extends Shape1{
	double length, breadth;
	
	public Rectangle1(double length, double breadth) {
		this.length = length;
		this.breadth = breadth;	
	}
	
	@Override
	public void draw() {
		System.out.println("Drawing Rectangle of length " + length + "and breadth " + breadth );
	}
}

public class ShapeDrawing_Q13 {

	public static void main(String[] args) {
		
		Circle1 circle1 = new Circle1(7.3);
		circle1.draw();
	
		
		Rectangle1 rectangle1 = new Rectangle1(5, 7);
		rectangle1.draw();
	}

}
