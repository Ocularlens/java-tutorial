package adjacency.matrix;

public class AndjacenyMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Graph graph = new Graph(5);

		graph.addNode(new Node('A'));
		graph.addNode(new Node('B'));
		graph.addNode(new Node('C'));
		graph.addNode(new Node('D'));
		graph.addNode(new Node('E'));
		
		graph.addEdge(0, 1);
		graph.addEdge(0, 2);
		graph.addEdge(4, 4);
		graph.addEdge(4, 2);
		graph.addEdge(3, 4);
		graph.addEdge(0, 4);
		
		graph.print();
		
//		graph.depthFirstSearch(3);
		
		graph.breadthFirstSearch(0);
	}

}
