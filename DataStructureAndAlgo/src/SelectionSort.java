
public class SelectionSort {

	public static void main(String[] args) {
		int[] nums = { 2, 9, 8, 3, 4, 5, 7, 6, 9, 1 };

		nums = selectionSort(nums, true);

		for (int num : nums) {
			System.out.print(num);
		}
	}

	private static int[] selectionSort(int[] nums, boolean desc) {

		for (int ctr = 0; ctr < nums.length; ctr++) {
			int min = ctr;
			for (int ctr2 = ctr + 1; ctr2 < nums.length; ctr2++) {
				if (desc) {
					if (nums[min] < nums[ctr2]) {
						min = ctr2;
					}
				} else {
					if (nums[min] < nums[ctr2]) {
						min = ctr2;
					}
				}

			}
			int temp = nums[ctr];
			nums[ctr] = nums[min];
			nums[min] = temp;
		}
		return nums;
	}

}
