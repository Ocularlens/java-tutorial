public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo demo1 = new Demo();
		Demo demo2 = new Demo();
		demo1 = null;
		demo2 = null;
		System.gc();
	}

}
