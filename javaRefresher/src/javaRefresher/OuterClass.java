package javaRefresher;

public class OuterClass {
	public class InnerClass {
		public void display() {
			System.out.println("inner class");
		}
	}
	
	public void inner() {
		InnerClass inClass = new InnerClass();
		inClass.display();
	}
	
	public void inner2() {
		class InnerClassv2 {
			public void display() {
				System.out.println("inner classv2");
			}
		}
		
		InnerClassv2 inClass = new InnerClassv2();
		inClass.display();
	}
}
