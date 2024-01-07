
public class QuickSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { 4, 9, 3, 2, 5, 7, 6, 8, 1 };

		quickSort(nums, 0, nums.length - 1);
		for (int num : nums) {
			System.out.print(num + " ");
		}
	}

	private static void quickSort(int[] nums, int start, int end) {
		if (end <= start)
			return;

		int pivot = partition(nums, start, end);
		quickSort(nums, start, pivot - 1);
		quickSort(nums, pivot + 1, end);
	}

	private static int partition(int[] nums, int start, int end) {
		int pivot = nums[end];
		int i = start - 1;

		for (int j = start; j <= end - 1; j++) {
			if (nums[j] < pivot) {
				i++;
				int temp = nums[i];
				nums[i] = nums[j];
				nums[j] = temp;
			}
		}
		i++;
		int temp = nums[i];
		nums[i] = nums[end];
		nums[end] = temp;

		return i;
	}
}