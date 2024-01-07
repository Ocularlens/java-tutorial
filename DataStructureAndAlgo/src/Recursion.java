
public class Recursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(power(2, 8));
	}

	private static int power(int base, int exponent) {
		if (exponent < 1)
			return 1;
		return base * power(base, exponent - 1);
	}

}