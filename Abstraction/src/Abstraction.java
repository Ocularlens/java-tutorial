abstract class Dog {
	public void bark() {
		System.out.println("arff!");
	}
	
	public abstract void poop();
}

class Asphin extends Dog {

	@Override
	public void poop() {
		// TODO Auto-generated method stub
		System.out.println("swirl");
	}}

public class Abstraction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Asphin ap = new Asphin();
		
		ap.bark();
		ap.poop();
	}

}
