
public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { 1, 9, 8, 3, 4, 5, 7, 6, 2 };

		int[] sorted = new int[nums.length];

		sorted = bubbleSort(nums);

		for (int i : sorted) {
			System.out.print(i + ", ");
		}
	}

	public static int[] bubbleSort(int[] nums) {
		// TODO Auto-generated method stub
		int temp;
		for (int ctr = 0; ctr < nums.length; ctr++) {
			for (int ctr2 = 0; ctr2 < nums.length - ctr - 1; ctr2++) {
				if (nums[ctr2] > nums[ctr2 + 1]) {
					temp = nums[ctr2];
					nums[ctr2] = nums[ctr2 + 1];
					nums[ctr2 + 1] = temp;
				}
			}
		}

		return nums;
	}

}
