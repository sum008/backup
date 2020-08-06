package graph_with_AdjacencyMatrix;

public class Run {

	public static void main(String[] args) {
		
		Graph g = new Graph(4);
		g.insert(0, 1);
		g.insert(0, 2);
		g.insert(0, 3);
		g.insert(1, 1);
		g.insert(1, 3);
		g.insert(2, 2);
		g.insert(2, 3);
		g.insert(3, 1);
		g.insert(3, 3);
		g.show();
		/*System.out.println();
		g.print();*/

	}

}
