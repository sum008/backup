package bt;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;

class Node1{
	
	int isConnected=0;
	String color="";
	Node1(int connect,String color){
		isConnected=connect;
		this.color=color;
	}
}

class Implement1{
	
	Node1[][] graph =null;
	Node1[] node = null;
	int startingNode;
	int size;
	Deque<Integer> stacki = new ArrayDeque<Integer>(); 
	Deque<Integer> stackj = new ArrayDeque<Integer>(); 
	int i=0,j=0;
	public Implement1(int size) {
		graph=new Node1[size][size];
		node=new Node1[size];
		this.size=size;
	}
	
	public void insert(int i,int j) {
		
		if(i<size && j<size) {
			Node1 n = new Node1(1,"N");  //N--> No color
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
	ArrayList<String> color = new ArrayList<String>(size);
	ArrayList<String> col = new ArrayList<String>(size);
	
		//{"Y","G","B","R"};
     ////String[] color = {"Y","G","B","R"};
     
     
	
	public void check1() {
		
		color.add("Y"); color.add("G"); color.add("B"); color.add("R");
		col.add("N");col.add("N");col.add("N");col.add("N");
		for( j=0; j<size; j++) {
			 if(graph[i][j]!=null) {
				 stacki.push(i);
				 stackj.push(j);
				 node[i].color="Y";
				 startingNode=i;
				 i=j;
				 j=0;
				 break;
		 }
	 }
		int k=i;
		int count=0;
		l1:
		while(stacki.size()!=size) {
			k=i;
			int l;
			int a=0;
			for(l=j;l<size; l++) {
			
				if(graph[k][l]!=null) {
					if(!(node[l].color.equals("N"))) { //If not equal to N i.e equal to any color 
						String c = node[l].color;
					
						int r = color.indexOf(c);
						
						col.set(r, c);
						a=l;
						count=0;
					}else if(count==0) {  //If not equal to any color i.e node k connecting other nodes doesn't contain any color
						
						a=l;  //will assign 1st non color node position
						count++;
					}
					
				}
			}
			  
				if(col.contains("N")) {
					 if(col.contains("Y") || col.contains("G") || col.contains("B") || col.contains("R")) {
						 
						node[k].color = color.get(col.indexOf("N"));//Assign color with corresponding index of N from list col  
						                                          //and use that index to get color from list color
						if(!stacki.contains(k) && !stackj.contains(a)) {
							stacki.push(k);
							stackj.push(a);
							i=a;
							
						}else if(stacki.size()==0)  {
							break l1;
						}else {
							i=stacki.pop();
							}
						j=0;
						col.set(0, "N");col.set(1, "N");col.set(2, "N");col.set(3, "N");
						
					}else if(!(col.contains("Y") || col.contains("G") || col.contains("B") || col.contains("R"))) {
						node[k].color="Y";
						i=a;
						j=0;
						System.out.println(i+" yyy "+j);
						System.out.println();
						//count=0;
						
					}
					
				}else {
					i=stacki.pop();
					//stackj.pop();
					j=0;
					//System.out.println("pop");
				}
				
		}
		for(int g=0;g<size; g++) {
			System.out.println("node "+g+" color is "+node[g].color);
			System.out.println();
		}
	}
}

public class ColoringProblem {
	
	public static void main(String[] args) throws InterruptedException {
		
		/*{{0, 1, 1, 1, 0,0}, 
            {1, 0, 1, 0, 1,0}, 
            {1, 1, 1, 1, 0,1}, 
            {1, 0, 1, 0, 0,1}, 
            {0, 1, 0, 0, 0,1},
            {0, 1, 1, 1, 1,1}
        };*/
		int p=6;
		int graph1[][] ={{0, 1, 1, 1, 0,0}, 
	            {1, 0, 1, 0, 1,0}, 
	            {1, 1, 1, 1, 0,1}, 
	            {1, 0, 1, 0, 0,1}, 
	            {0, 1, 0, 0, 0,1},
	            {0, 1, 1, 1, 1,1}
	        };
		Implement1 m = new Implement1(p);
		for(int i=0;i<p;i++) {
			for(int j=0; j<p; j++) {
				if(graph1[i][j]==1) {
					m.insert(i, j);
				}
				
			}
		}
		
		m.check1();

	}

}
