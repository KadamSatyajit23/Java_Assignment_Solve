package assignment3_Oopj;

abstract class Shape{
	
	public abstract double area();
}

class Rectangle extends Shape{

	private double lenght, breadth;
	
	public Rectangle(double length, double breadth) {
		
		this.lenght = length;
		this.breadth = breadth;
	}
	
	@Override
	public double area() {
		
		return lenght * breadth;
	}
}

class Cirlce extends Shape{
	
	private double radius;
	
	public Cirlce(double radius) {
		this.radius = radius;
	}
	
	@Override
	public double area() {
		
		return Math.PI * radius * radius;
	}
}


public class ShapeAreaCalculation_Q6 {

	public static void main(String[] args) {
		
		Rectangle rectangle = new Rectangle(5, 10);
		
		System.out.println("Rectangle Area : " + rectangle.area());
		
		Cirlce cirlce = new Cirlce(7);
		System.out.println("Circle Area : " + cirlce.area());

	}

}
