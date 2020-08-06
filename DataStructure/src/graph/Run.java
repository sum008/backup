package graph;

public class Run {

	public static void main(String[] args) {
		
		Graph g = new Graph(4);
		
		/*g.addToGraph(5, 0);
		g.addToGraph(1, 1);
		g.addToGraph(6, 0);
		g.addToGraph(7, 2);
		g.addToGraph(8, 1);
		g.addToGraph(11, 3);
		g.addToGraph(13, 3);
		g.addToGraph(12, 3);
		g.addToGraph(15, 3);
		g.addToGraph(18, 3);*/
		
		g.addToGraphRecursive(1, 0, g.parent);
		g.addToGraphRecursive(2, 0, g.parent);
		g.addToGraphRecursive(3, 0, g.parent);
		g.addToGraphRecursive(0, 1, g.parent);
		g.addToGraphRecursive(2, 1, g.parent);
		g.addToGraphRecursive(0, 2, g.parent);
		g.addToGraphRecursive(1, 2, g.parent);
		g.addToGraphRecursive(3, 2, g.parent);
		g.addToGraphRecursive(0, 3, g.parent);
		g.addToGraphRecursive(2, 3, g.parent);

		g.traverse();
		
		System.out.println("done");

	}

}
