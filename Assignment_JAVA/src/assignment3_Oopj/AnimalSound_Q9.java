package assignment3_Oopj;

class Animal{
	String sound;
	
	public Animal(String sound) {
		this.sound = sound;
	}
	
	public void makeSound() {
		System.out.println(sound);
		
	}
	
}
class Dog extends Animal{
	
	public Dog(String sound) {
		super(sound);
	}
	
	@Override
	public void makeSound() {
		System.out.println("Dog -> " + sound);
	}
}

class Cat extends Animal{
	public Cat(String sound) {
		super(sound);
	}
	
	@Override
	public void makeSound() {
		System.out.println("Cat -> " + sound);
	}
}
public class AnimalSound_Q9 {
	public static void main(String[] args) {
		
		Dog dog = new Dog("Bark");
		dog.makeSound();
		
		Cat cat = new Cat("Meow");
		cat.makeSound();
	}
}
