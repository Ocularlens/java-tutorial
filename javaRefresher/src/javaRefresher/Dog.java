package javaRefresher;

public class Dog {
	protected String name;
	protected int age;
	protected String breed;

	public Dog(String name, int age, String breed) {
		this.name = name;
		this.age = age;
		this.breed = breed;
	}

	public void setAge(int newAge) {
		this.age = newAge;
	}

	public String displayInfo() {
		this.age = add2();
		return String.format("Name: %s Age: %s Breed: %s", this.name, this.age, this.breed);
	}

	private int add2() {
		return this.age + 2;
	}
}
