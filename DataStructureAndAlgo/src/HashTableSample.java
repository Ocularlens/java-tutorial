import java.util.Hashtable;

public class HashTableSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hashtable<Integer, String> table = new Hashtable<>(10);

		table.put(100, "Curry");
		table.put(123, "James");
		table.put(121, "Thompson");
		table.put(777, "Payton");

		table.remove(777);

		for (Integer key : table.keySet()) {
			System.out.println("hashCode: " + key.hashCode() + "\t" + table.get(key));
		}
	}

}
