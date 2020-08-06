package binaryTree;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;

public class Tree {
	private Node y;
	private Node root;
	private Node current;
	private Node parent;
	private Node temp;
	private Node current1;
	private int count1=0;
	private Node parent1;
	private Node top;
	boolean x=true;
	ArrayList<Integer> list = new ArrayList<Integer>();
	
	public Node getRoot(){
		
		return this.root;
	}
	
	/*public void insert(int data) throws InterruptedException{
		Node node = new Node(data);
		
		if(root==null){
			root=node;
		}else{
			current=root;
			while(current!=null){
				parent=current;
				if(data<current.data){
					current=current.left;
				}else{
					current=current.right;
				}
			}
			if(data<parent.data){
				parent.left=node;
			}else{
				parent.right=node;
			}
			count1++;
		}
	}*/
	
	public void insertRecursion(int data, Node root){
		
		y=root;
		if(this.root==null){
			Node node = new Node(data);
            this.root=node;
		}else if(y==null){
			Node node = new Node(data);
			
			if(data<parent.data){
				parent.left=node;
			}else{
				parent.right=node;
			}
		}else{
			if(data<y.data){
				parent=y;
				insertRecursion(data,y.left);
				
			}else{
				parent=y;
				insertRecursion(data,y.right);
			}
		}
		}
	
	/*public void preOrderTraversal() throws InterruptedException{
		
		while(root!=null){
			parent1 =root;
			top=root;
			x=true;
			while(x==true){
				//parent1=top;
				if(parent1.left!=null){
					top=parent1;
					parent1=parent1.left;
					System.out.println("1 "+list);
				}else if(parent1.right!=null){
					top=parent1;
					parent1=parent1.right;
					System.out.println("2 "+list);
				}else {
					list.add(parent1.data);
					parent1=null;
					//parent1=top;
					list.add(top.data);
					//top=null;
					//parent1=root;
					System.out.println("3 "+list);
					//top=null;
					//break;
					x=false;
					Thread.sleep(2000);
				}
				System.out.println("4 "+list);
			}
			
		}
		System.out.println(list);
	}*/
	
	
	public void preOrderRecursive(Node root){
		if(root==null){
			return;
		}else{
			
			preOrderRecursive(root.left);
			System.out.print(" "+root.data);
			preOrderRecursive(root.right);
			
		}
	}
	
	public void preOrderIterative(Node root){
		Deque<Node> stack = new ArrayDeque<Node>();
		while(true){
			
			if(root!=null){
				stack.push(root);
				root=root.left;
			}else{
				
				if(stack.isEmpty()){
					break;
				}
				
				root=stack.pop();
				
				System.out.print(" "+root.data);
				root=root.right;
			}
		}
	}
	public void addToList() throws InterruptedException{
		System.out.println(count1);
		int count=1;
		ArrayList<Node> list=new ArrayList<Node>();
		temp=root;
		//list.add(temp);
		list.add(temp.left);
		list.add(temp.right);
		
		for(int i=0; i<count1-1; i++){
			/*Thread.sleep(50);
			Node x=list.get(i);
			System.out.println(x.data);*/
			temp=list.get(i);
			if(temp.left!=null){
				//Node n=temp.left;
				//System.out.println(n.data);
				list.add(count,temp.left);
				count++;
			}
			if(temp.right!=null){
			list.add(count,temp.right);
			count++;
			}
			}
		System.out.println("#########################################");
		for(int i=0; i<list.size(); i++){
			System.out.println(list.get(i).data);
		}
	}
	
	public void search(int item){
		Node parent1=null;
		int count=0;
		current1=root;
		parent1=current1;
		while(current1!=null){
			if(root.data==item){
				System.out.println("Item found! "+"It's parent node itself "+parent1.data+" and index is "+count);
				break;
			}
			else if(current1.data==item){
				System.out.println("Item found! "+"It's parent node is "+parent1.data+" and index is "+count);
				break;
			}else{
				if(item<current1.data){
					parent1=current1;
					current1=current1.left;
				}else{
					parent1=current1;
					current1=current1.right;
				}
			}
			count++;
			System.out.println("Number of iterations "+count+" ");
		}
	}
    
    

}
