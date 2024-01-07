
public class InterpolationSearch {

	public static void main(String[] args) {
		int[] array = { 32, 1, 2, 512, 8, 16, 64, 128, 256, 4, 1024, 2048 };

		int index = interPolationSearch(array, 512);

		System.out.println(index);
	}

	private static int interPolationSearch(int[] array, int value) {
		int low = 0;
		int high = array.length - 1;

		while (value >= array[low] && value <= array[high] && low <= high) {
			int probe = low + (high - low) * (value - array[low]) / (array[high] - array[low]);
			System.out.println("Probe: " + probe);

			if (array[probe] == value)
				return probe;
			else if (array[probe] < value)
				low = probe + 1;
			else
				high = probe - 1;
		}

		return -1;
	}

}
