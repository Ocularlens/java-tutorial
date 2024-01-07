package executiontime;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		long start = System.nanoTime();

//		---- start
		Thread.sleep(3000);
//		---- end

		long duration = (System.nanoTime() - start) / 1000000;

		System.out.println(duration + " ms");
	}

}
