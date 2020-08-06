package bt;

import java.util.ArrayDeque;
import java.util.Deque;

class Node{
	int connect;
	boolean isVisited=false;
	public Node(int connect, boolean isVisited) {
		this.connect=connect;
		this.isVisited=isVisited;
	}
}

class Implement{
	
	Node[][] graph =null;
	Node[] node=null;
	int startingNode;
	int size;
	Deque<Integer> stacki = new ArrayDeque<Integer>(); 
	Deque<Integer> stackj = new ArrayDeque<Integer>();
	int i=0,j=0;
	public Implement(int size) {
		graph=new Node[size][size];
		node=new Node[size];
		this.size=size;
	}
	
	public void insert(int i,int j) {
		
		if(i<size && j<size) {
			Node n = new Node(1,false);
			if(graph[i][j]==null) {
				graph[i][j]=n;
				node[i]=n;
			}else {
				System.out.println("A node is already at position "+i+" "+j);
			}
		}else {
			System.out.println("Not valid position");
		}
	}
	
	 public void check() throws InterruptedException {
			 for( j=0; j<size; j++) {
				 if(graph[i][j]!=null) {
					 stacki.push(i);
					 stackj.push(j);
					 graph[i][j].isVisited=true;
					 //graph[j][i].isVisited=true;
					 node[i].isVisited=true;
					 startingNode=i;
					 i=j;
					 j=0;
					 break;
			 }
		 }
			 
		 while(true) {
			 int k=i;
			 l1:
			// for(int k=i; k<size; k++) {
				 for(int l=j; l<size; l++) {
					// System.out.println(k+" "+i+" e "+l);
					 if(graph[k][l]!=null) {
						 System.out.println(k+" f "+l);
						 System.out.println(graph[k][l].isVisited);
						 System.out.println(node[l].isVisited);
						 if(graph[k][l].isVisited==false && node[l].isVisited==false) {
							 
							 graph[k][l].isVisited=true;
							 node[k].isVisited=true;
							// graph[l][k].isVisited=true;   
							                                                        /* {{0, 1, 0, 1, 0}, 
					                                                                 {1, 0, 1, 1, 1}, 
					                                                                 {0, 1, 0, 0, 1}, 
					                                                                 {1, 1, 0, 0, 1}, 
					                                                                  {0, 1, 1, 1, 0}}*/
							 stacki.push(k);
							 stackj.push(l);
							 System.out.println(k+" push "+l);
							 k=l;
							 l=-1;
							 System.out.println(k+" push "+l);
							 Thread.sleep(500);
							 continue l1;
						 }
						 else if(graph[k][l].isVisited==true && l==size-1){
							 System.out.println(k+" h "+l);
							 i=stacki.pop();
							 j=stackj.pop()+1;
							 graph[k][l].isVisited=false;
							 //node[k].isVisited=false;
							 System.out.println(i+" h "+j);
							 Thread.sleep(500);
							 continue l1;
						 }else if(l<size-1) {
							 System.out.println("connn");
							 continue;
						 }
						 else if(l==size-1) {
							 System.out.println(k+" i "+l);
							 i=stacki.pop();
							 j=stackj.pop()+1;
							 System.out.println(i+" i "+j);
							 graph[k][l].isVisited=false;
							 System.out.println("connn");
							 continue;
						 }
						  
					 }else if(l==size-1){
						 i=stacki.pop();
						 j=stackj.pop();
					 }
					 
				 }
			 Thread.sleep(500);
			 //}
		 
		 }
		 //System.out.println("circular");
	 }
}

public class Hamiltonian_Cycle {
	public static void main(String[] args) throws InterruptedException {
		
		/*{{0, 1, 1, 1, 0,0}, 
            {1, 0, 1, 0, 1,0}, 
            {1, 1, 1, 1, 0,1}, 
            {1, 0, 1, 0, 0,1}, 
            {0, 1, 0, 0, 0,1},
            {0, 1, 1, 1, 1,1}
        };*/
		
		int graph1[][] ={{0, 1, 1, 0, 0,0}, 
	            {1, 0, 1, 1, 1,1}, 
	            {1, 1, 0, 1, 0,0}, 
	            {0, 1, 1, 0, 1,0}, 
	            {0, 1, 0, 1, 0,1},
	            {0, 1, 0, 0, 1,0}
	        }; 
		Implement m = new Implement(6);
		for(int i=0;i<6;i++) {
			for(int j=0; j<6; j++) {
				if(graph1[i][j]==1) {
					m.insert(i, j);
				}
				
			}
		}
		
		m.check();
	}
	

}
