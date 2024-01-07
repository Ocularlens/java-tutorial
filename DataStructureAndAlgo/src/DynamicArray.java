public class DynamicArray {
	int size;
	int capacity = 10;
	Object[] array;

	public DynamicArray() {
		this.array = new Object[this.capacity];
	}

	public DynamicArray(int capacity) {
		this.capacity = capacity;
		this.array = new Object[this.capacity];
	}

	public void add(Object data) {
		if (this.size >= this.capacity) {
			this.grow();
		}

		this.array[this.size] = data;
		this.size++;
	}

	public void insert(int index, Object data) {
		if (this.size >= this.capacity) {
			this.grow();
		}

		for (int ctr = this.size; ctr > index; ctr--) {
			this.array[ctr] = array[ctr - 1];
		}

		this.array[index] = data;
		this.size++;
	}

	public void delete(Object data) {
		for (int ctr = 0; ctr < this.size; ctr++) {
			if (this.array[ctr] == data) {
				for (int ctr2 = 0; ctr2 < (this.size - ctr - 1); ctr2++) {
					this.array[ctr + ctr2] = this.array[ctr + ctr2 + 1];
				}
				this.array[this.size - 1] = null;
				this.size--;
				if (this.size <= (int) (this.capacity / 3)) {
					this.shrink();
				}
				break;
			}
		}
	}

	public int search(Object data) {
		for (int ctr = 0; ctr < this.size; ctr++) {
			if (this.array[ctr] == data) {
				return ctr;
			}
		}
		return -1;
	}

	public void grow() {
		int newCap = (int) this.capacity * 2;
		Object[] newArray = new Object[newCap];

		for (int ctr = 0; ctr < this.size; ctr++) {
			newArray[ctr] = this.array[ctr];
		}

		this.array = newArray;
		this.capacity = newCap;
	}

	public void shrink() {
		int newCap = (int) this.capacity / 2;
		Object[] newArray = new Object[newCap];

		for (int ctr = 0; ctr < this.size; ctr++) {
			newArray[ctr] = this.array[ctr];
		}
		this.array = newArray;
		this.capacity = newCap;
	}

	public boolean isEmpty() {
		return this.size == 0;
	}

	public String toString() {
		String string = "";

		for (int ctr = 0; ctr < this.size; ctr++) {
			string += array[ctr] + ", ";
		}

		if (string != "") {
			string = "[" + string.substring(0, string.length() - 2) + "]";
		} else {
			string = "[]";
		}

		return string;
	}

	public static void main(String[] args) {
		DynamicArray array = new DynamicArray();

		array.add("test");
		array.add("james");
		array.add("steph");

		System.out.println("Size: " + array.size);
		System.out.println("Capacity: " + array.capacity);
		
		array.insert(2, "yap");
		System.out.println(array.toString());

		array.delete("test");
		array.add("poole");
		array.add("curry");
		array.add("thompson");
		array.add("green");


		System.out.println("Size: " + array.size);
		System.out.println("Capacity: " + array.capacity);

		array.delete("poole");
		array.delete("curry");
		array.delete("thompson");
		array.delete("green");
		
		System.out.println("Size: " + array.size);
		System.out.println("Capacity: " + array.capacity);
		
		System.out.println(array.search("yap"));
		System.out.println(array.isEmpty());
		System.out.println(array.toString());
	}
}
