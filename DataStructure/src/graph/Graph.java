package graph;

import java.util.ArrayList;

public class Graph {
	
	//Node root;
	Node current;
	Node parent;
	int size;
	int cursize=0;
	int x=0;
	public Node[] list =null;
	
	public Graph(int size) {
		list=new Node[size];
		this.size=size;
	}
	
	
	/*public void addToGraph(int data, int position) {
		
		if(position<size) {
		Node n = new Node(data);
			if(list[position]==null) {
				current =n;
				list[position]=current;
				current=current.next;
				cursize++;
			}else if(list[position]!=null) {
				current=list[position];
				while(current!=null) {
					parent=current;
					current=current.next;
				}
				parent.next=n;
			}
		}
	}*/
	
     public void addToGraphRecursive(int data,int position, Node c) {
		current=c;
		if(position<size) {
		Node n = new Node(data);
			if(list[position]==null) {
				current =n;
				list[position]=current;
				cursize++;
			}else if(list[position]!=null) {
				
				if(x==0) {
					current=list[position];
				}
				
				if(current!=null) {
					parent=current;
					x++;
					addToGraphRecursive(data,position,current.next);
				}else {
					parent.next=n;
					x=0;
				}
				
			}
		}
	}
	
	public void traverse() {
		Node curr;
		System.out.println(cursize);
			for(int i=0; i<cursize; i++) {
				curr=list[i];
				
				while(curr!=null) {
					System.out.println("Elements of position "+i+" is "+ curr.data);
					curr=curr.next;
				}
			}
		
	}
	
	

}
