import java.util.LinkedList;

public class LinkedListSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> list = new LinkedList<String>();
		
		list.push("Green");
		list.push("Curry");
		list.push("Thompson");
		list.push("Poole");
		
		System.out.println(list);
		System.out.println(list.indexOf("Poole"));
		
		list.add(2, "Durant");
		list.removeLast();
		
		list.poll();
		list.pop();
		
		System.out.println(list);
	}

}
