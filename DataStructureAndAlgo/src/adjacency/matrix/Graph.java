package adjacency.matrix;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Graph {
	ArrayList<Node> nodes;
	int[][] matrix;

	Graph(int size) {
		this.nodes = new ArrayList<Node>();
		this.matrix = new int[size][size];
	}

	public void addNode(Node node) {
		nodes.add(node);
	}

	public void addEdge(int src, int dst) {
		this.matrix[src][dst] = 1;
	}

	public boolean checkEdge(int src, int dst) {
		if (this.matrix[src][dst] == 1)
			return true;
		return false;
	}

	public void print() {

		System.out.print("  ");
		for (Node node : this.nodes) {
			System.out.print(node.data + " ");
		}
		System.out.println();

		for (int i = 0; i < this.matrix.length; i++) {
			System.out.print(this.nodes.get(i).data + " ");
			for (int j = 0; j < this.matrix.length; j++) {
				System.out.print(this.matrix[i][j] + " ");
			}
			System.out.println();
		}
	}

	void depthFirstSearch(int src) {
		boolean[] visited = new boolean[this.matrix.length];
		dFsHelper(src, visited);
		
		System.out.println();
	}

	private void dFsHelper(int src, boolean[] visited) {
		if (visited[src]) {
			return;
		}
		visited[src] = true;
		System.out.println(this.nodes.get(src).data + " - Visited");

		for (int i = 0; i < this.matrix[src].length; i++) {
			if (this.matrix[src][i] == 1) {
				dFsHelper(i, visited);
			}
		}

		return;
	}

	void breadthFirstSearch(int src) {
		Queue<Integer> queue = new LinkedList<>();
		boolean[] visited = new boolean[this.matrix.length];

		queue.offer(src);
		visited[src] = true;

		System.out.println();
		
		while (queue.size() != 0) {
			src = queue.poll();
			System.out.println(this.nodes.get(src).data + " - Visited");

			for (int i = 0; i < this.matrix[src].length; i++) {
				if (this.matrix[src][i] == 1 && !visited[i]) {
					queue.offer(i);
					visited[i] = true;
				}
			}
		}
	}
}
