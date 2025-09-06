package assignment3_Oopj;


class Vehical{
	String brand;
	int speed;
	
	public Vehical(String brand, int speed) {
		this.brand = brand;
		this.speed = speed;
	}
	
	public void display() {
		System.out.println(brand + speed);
	}
}
class Car extends Vehical{
	String modelType;
	
	public Car(String brand, int speed, String modelType) {
		super(brand, speed);
		this.modelType = modelType;
	}
	
	@Override
	public void display() {
		System.out.println("Brand="+ brand + ", Speed=" + speed + ", modelType="+  modelType);
	}
	
}
class Bike extends Vehical{
	String modelType;
	public Bike(String brand, int speed, String modelType) {
		super(brand, speed);

		this.modelType = modelType;
	}
	
	@Override
	public void display() {
		System.out.println("Brand="+ brand + ", Speed=" + speed + ", modelType="+  modelType);
	}
}
public class VehicalType_Q8 {

	public static void main(String[] args) {
		
		Car car = new Car("Honda", 180, "Civic");
		Bike bike = new Bike("Yamaha", 120, "R15");
		car.display();
		bike.display();
		
		
		
	}

}
