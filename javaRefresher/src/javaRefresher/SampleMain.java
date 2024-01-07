package javaRefresher;

public class SampleMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal animal1 = new Animal("James");
		Animal animal2 = new Animal("Steph");
		
		System.out.println(animal1.equals(animal2));
		System.out.println(animal2.compareTo(animal1));
		System.out.println(animal2.toString());
		
		OuterClass oClass = new OuterClass();
		oClass.inner();
		oClass.inner2();
		
		OuterClass.InnerClass inClass = oClass.new InnerClass();
		inClass.display();
		
		Car myCar = new Car();
		myCar.speedUp(2);
		myCar.changeGear(3);
		myCar.display();
		
		Vehicle.displayMaxGear();
	}

}
