
public class LinearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] nums = { 6, 7, 2, 3, 2 };

		System.out.println(search(nums, 2));
	}

	public static int search(int[] array, int value) {
		for (int ctr = 0; ctr < array.length; ctr++) {
			if (array[ctr] == value) {
				return ctr;
			}
		}
		return -1;
	}

}
