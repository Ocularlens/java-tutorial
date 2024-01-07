package javaRefresher;

public class Cat extends Dog {
	private int numberOfLife;

	public Cat(String name, int age, String breed, int numberOfLife) {
		super(name, age, breed);
		this.numberOfLife = numberOfLife;
	}
	
	public Cat(String name, int age, String breed) {
		super(name, age, breed);
	}

	public String displayInfo() {
		return String.format("Name: %s Age: %s Breed: %s Life: %s", this.name, this.age, this.breed, this.numberOfLife);
	}

}
