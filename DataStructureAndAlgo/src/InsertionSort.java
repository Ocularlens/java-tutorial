
public class InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { 4, 9, 3, 2, 5, 7, 6, 8, 1 };

		nums = insertionSort(nums);

		for (int num : nums) {
			System.out.print(num + " ");
		}
	}

	private static int[] insertionSort(int[] nums) {
		// TODO Auto-generated method stub
		for (int ctr = 1; ctr < nums.length; ctr++) {
			int temp = nums[ctr];
			int j = ctr - 1;
			for (int ctr2 = ctr; ctr2 >= 0; ctr2--) {
				if (nums[ctr2] > temp) {
					nums[ctr2 + 1] = nums[ctr2];
					nums[ctr2] = temp;
				}
			}

//			while (j >= 0 && nums[j] > temp) {
//				nums[j + 1] = nums[j];
//				j--;
//			}
//
//			nums[j + 1] = temp;
		}
		return nums;
	}

}