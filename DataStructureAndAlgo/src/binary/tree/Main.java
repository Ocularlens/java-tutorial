package binary.tree;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinarySearchTree tree = new BinarySearchTree();
		
		tree.insert(new Node(5));
		tree.insert(new Node(2));
		tree.insert(new Node(30));
		tree.insert(new Node(40));
		tree.insert(new Node(24));
		
		tree.remove(0);
		tree.remove(24);
		
		tree.display();
		
		System.out.println(tree.search(50));
	}

}
