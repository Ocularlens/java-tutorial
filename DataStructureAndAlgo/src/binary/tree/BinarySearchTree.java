package binary.tree;

public class BinarySearchTree {
	Node root;

	void insert(Node node) {
		this.root = insertHelper(this.root, node);
	}

	private Node insertHelper(Node root, Node node) {
		int data = node.data;
		if (root == null) {
			root = node;
			return root;
		} else if (data < root.data) {
			root.left = insertHelper(root.left, node);
		} else {
			root.right = insertHelper(root.right, node);
		}
		return root;
	}

	void display() {
		displayHelper(this.root);
	}

	private void displayHelper(Node root) {
		if (root != null) {
			displayHelper(root.left);
			System.out.println(root.data);
			displayHelper(root.right);
		}
	}

	boolean search(int data) {
		return searchHelper(this.root, data);
	}

	private boolean searchHelper(Node root, int data) {
		if (root == null)
			return false;
		else if (root.data == data)
			return true;
		else if (root.data > data)
			return searchHelper(root.left, data);
		return searchHelper(root.right, data);
	}

	void remove(int data) {
		if (search(data)) {
			removeHelper(this.root, data);
		} else {
			System.out.println("data not found");
		}
	}

	private Node removeHelper(Node root, int data) {
		if (root == null)
			return root;
		else if (data < root.data) {
			root.left = removeHelper(root.left, data);
		} else if (data > root.data) {
			root.right = removeHelper(root.right, data);
		} else {
			if (root.left == null && root.right == null) {
				root = null;
			} else if (root.right != null) {
				root.data = successor(root);
				root.right = removeHelper(root.right, root.data);
			} else {
				root.data = predecessor(root);
				root.left = removeHelper(root.left, root.data);
			}

		}
		return root;
	}

	private int successor(Node root) {
		root = root.right;
		while (root.left != null) {
			root = root.left;
		}
		return root.data;
	}

	private int predecessor(Node root) {
		root = root.left;
		while (root.right != null) {
			root = root.right;
		}
		return root.data;
	}
}
