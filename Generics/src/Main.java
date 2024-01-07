
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] intArray = { 5, 3, 2, 4 };
		String[] strArray = { "AD", "DS", "DE" };

		displayArray(intArray);
		displayArray(strArray);
		System.out.println(firstElement(strArray));

		GenericClass<Integer, Integer> intClass = new GenericClass<>(1, 2);
		GenericClass<Integer, String> strClass = new GenericClass<>(30, "Steph");
		GenericClass<Integer, String> mxdClass = new GenericClass<>(1, "30");

		System.out.println(intClass.getValue());
		System.out.println(strClass.getValue());
	}

	public static <T> void displayArray(T[] array) {
		for (T x : array) {
			System.out.print(x + " ");
		}
		System.out.println();
	}

	public static <T> T firstElement(T[] array) {
		return array[0];
	}
}
