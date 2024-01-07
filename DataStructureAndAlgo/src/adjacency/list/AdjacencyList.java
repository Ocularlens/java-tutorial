package adjacency.list;

public class AdjacencyList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Graph graph = new Graph();
		
		graph.addNode(new Node('A'));
		graph.addNode(new Node('B'));
		graph.addNode(new Node('C'));
		graph.addNode(new Node('D'));
		graph.addNode(new Node('E'));
		
		graph.addEdge(0, 0);
		graph.addEdge(4, 4);
		graph.addEdge(3, 4);
		graph.addEdge(3, 0);
		
		graph.print();
	}

}
