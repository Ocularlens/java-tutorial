package javaRefresher;

public class Animal implements Comparable<Animal> {
	protected static int count = 0;

	protected String name;
	protected double weight;
	protected double height;

	public Animal() {
		Animal.count += 1;
	}
	
	public Animal(String name) {
		this.name = name;
	}
	
	public static void printCount() {
		System.out.println(Animal.count);
	}
	
	public String getName() {
		return this.name;
	}
	
	public boolean equals(Animal other) {
		if (this.name == other.getName()) {
			return true;
		}
		
		return false;
	}

	@Override
	public int compareTo(Animal other) {
		return this.name.compareTo(other.getName());
	} 
	
	public String toString() {
		return this.name;
	}
}
