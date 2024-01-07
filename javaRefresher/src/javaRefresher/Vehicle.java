package javaRefresher;

//interface cannot contain defined class without static or default keyword

public interface Vehicle {

	final int gears = 5;

	void slowDown(int a);

	void speedUp(int a);

	void changeGear(int a);
	
	default void out() {
		System.out.println("Default");
	}
	
	static void displayMaxGear() {
		System.out.println(gears);
	}
}
