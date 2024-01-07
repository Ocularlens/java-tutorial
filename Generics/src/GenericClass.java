
public class GenericClass<T extends Number, T2> {
	T x;
	T2 y;

	GenericClass(T x, T2 y) {
		this.x = x;
		this.y = y;
	}

	public T getValue() {
		return this.x;
	}
}
