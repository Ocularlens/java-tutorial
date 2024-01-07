
public class MergeSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { 4, 9, 3, 2, 5, 7, 6, 8, 1 };

		mergeSort(nums);

		for (int num : nums) {
			System.out.print(num + " ");
		}
	}

	private static void mergeSort(int[] nums) {
		int length = nums.length;
		if (length <= 1)
			return;

		int middle = length / 2;
		int[] left = new int[middle];
		int[] right = new int[length - middle];

		int leftInt = 0;
		int rightInt = 0;

		for (; leftInt < length; leftInt++) {
			if (leftInt < middle) {
				left[leftInt] = nums[leftInt];
			} else {
				right[rightInt] = nums[leftInt];
				rightInt++;
			}
		}

		mergeSort(left);
		mergeSort(right);
		merge(left, right, nums);
	}

	private static void merge(int[] left, int[] right, int[] array) {
		int leftSize = array.length / 2;
		int rightSize = array.length - leftSize;

		int ctr = 0, leftInt = 0, rightInt = 0;

		while (leftInt < leftSize && rightInt < rightSize) {
			if (left[leftInt] < right[rightInt]) {
				array[ctr] = left[leftInt];
				ctr++;
				leftInt++;
			} else {
				array[ctr] = right[rightInt];
				ctr++;
				rightInt++;
			}
		}

		while (leftInt < leftSize) {
			array[ctr] = left[leftInt];
			ctr++;
			leftInt++;
		}

		while (rightInt < rightSize) {
			array[ctr] = right[rightInt];
			ctr++;
			rightInt++;
		}
	}

}
