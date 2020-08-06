package graph_with_AdjacencyMatrix;

public class Graph {
	
	Node[][] graph =null;
	int size;
	public Graph(int size) {
		graph=new Node[size][size];
		this.size=size;
	}
	
	public void insert(int i,int j) {
		
		if(i<size && j<size) {
			Node n = new Node(1);
			if(graph[i][j]==null) {
				graph[i][j]=n;
			}else {
				System.out.println("A node is already at position "+i+" "+j);
			}
		}else {
			System.out.println("Not valid position");
		}
	}
	
	
	
	public void show() {
		
		
		for(int i=0; i<size; i++) {
			for(int j=0; j<size; j++) {
				if(graph[i][j]!=null) {
					System.out.println(i+1 +" is connected to "+(j+1));
				}/*else {
					Node n = new Node(0);
					graph[i][j]=n;
				}*/
			}
		}
	}
	
   /*public void print() {
	   for(int i=0; i<size; i++) {
			for(int j=0; j<size; j++) {
				
					System.out.print(graph[i][j].connect+" ");
				
			}
			System.out.println();
		}
   }*/
}
