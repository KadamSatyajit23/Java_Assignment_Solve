package assignment3_Oopj;

class TempratureSensor{
	private float temprature;
	
	void setTemprature(float temprature) {
		if(temprature > 0 && temprature < 100) {
			this.temprature = temprature;
		}else {
			System.out.println("Temprature Out of Range..");
		}
	}
	
	public float getTemprature() {
		return temprature;
	}
}
public class TempratureSensor_Q5 {

	public static void main(String[] args) {
		
		TempratureSensor tempratureSensor = new TempratureSensor();
		tempratureSensor.setTemprature(15);
		
		if(tempratureSensor.getTemprature() == 0) {
			System.out.println("invalid temp");
		}
		else {
			System.out.println("temprature = " + tempratureSensor.getTemprature());
		}
	}

}
