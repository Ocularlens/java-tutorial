package javaRefresher;

public class JavaObjects {

	public static void main(String[] args) {
		Dog myDog = new Dog("James", 38, "Black");
		Cat myCat = new Cat("Draymond", 33, "Black", 4);
		Cat mySecondCat = new Cat("Klay", 34, "Blue");
		Animal testAnim = new Animal();
		Animal testAnim2 = new Animal();
		
		System.out.println(myDog.displayInfo());
		myDog.setAge(39);
		System.out.println(myDog.displayInfo());
		
		System.out.println(myCat.displayInfo());
		System.out.println(mySecondCat.displayInfo());
		
		System.out.println(Animal.count);
		Animal.printCount();
	}
	
	public static String print(String str) {
		System.out.println(str);
		return str;
	}

}
