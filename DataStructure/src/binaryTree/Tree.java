package binaryTree;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;

public class Tree {
	
	Node root;
	private Node parent;
	private Node current;
    Node previous;
	public void insert(int data,  Node root /*Passing root value i.e this.root*/ )  {
		current=root;
		
		if(this.root==null) {
			Node n = new Node(data);
			this.root=n;
		}else if(current==null) {
			Node n = new Node(data);
			if(data<parent.data) {
				parent.left=n;
				
			}else {
				parent.right=n;
			}
		}else {
			if(data<current.data) {
				parent=current;
				 insert(data, current.left);
			}else {
				parent=current;
				 insert(data, current.right);
			}
		}
		
		
	}
	
	public void deleteNode(int data) {
		current=root;
		Node currlef;
		Node currright;
		parent=root;
		if(data==root.data) {
			current=root.right;
			Node temp=current;
			while(current!=null) {
				previous=parent;
				parent=current;
				current=current.left;
			}
			if(temp.left!=null) {
				root.data=parent.data;
				previous.left=null;
			}else {
				Node x=root.left;
				root=parent;
				root.left=x;
			}
		}else {
		
		while(current.data!=data) {
			if(data<current.data) {
				parent=current;
				current=current.left;
			}else {
				parent=current;
				current=current.right;
			}
		}
		if(current.left!=null) {
			currlef=current.left;
			
			if(current.right!=null) {
				currright=current.right;
				currright.left=currlef;
				if(current.data<parent.data) {
					parent.left=currright;
				}else {
					parent.right=currright;
				}
				
			
		}else {
			parent.left=current.left;
		}
		}else if(current.right!=null){
			if(current.data<parent.data) {
				parent.left=current.right;
			}else {
				parent.right=current.right;
			}
			
			
		}else {
			System.out.println("dddd");
			
			if(data<parent.data) {//Because we are inserting in parent(See insertion), so whole tree is created using parent
				parent.left=null;
			}else {
				parent.right=null;
			}
			 
			
		}
		
	}
		
	}
	
	public void traversal(Node root) {
		
		if(root==null) {
			return;
		}else {
			
			System.out.println(root.data);
			traversal(root.left);
			traversal(root.right);
		}
	}
	
	public void BFS() {
		
		ArrayList<Node> queue = new ArrayList<Node>();
		queue.add(root);
		while(queue.size()>0) {
		
		Node current = queue.get(0);
		    
		    if(current.left!=null) {
				queue.add(current.left);
			}
			if(current.right!=null) {
				queue.add(current.right);
			}
			System.out.println(current.data);
			queue.remove(0);
		}
		
		
	}
	
	public void DFS() {
		
		Deque<Node> stack = new ArrayDeque<Node>();
		Node temp=root;
		while(true) {
			if(temp!=null) {
				stack.push(temp);
				temp=temp.left;

			}else {
				if(stack.isEmpty()) {
					break;
				}
				temp=stack.pop();
				System.out.println(temp.data);
				temp=temp.right;
			}
		}
	}
	
boolean checkBST(Node root) {
        int count=0;
        ArrayList<Node> list = new ArrayList<Node>();
        list.add(root);
       // System.out.println(list.get(0).data);
        while(!list.isEmpty()){
            
            Node current=list.get(0);
            Node left=current.left;
            Node right=current.right;
            System.out.println(current.data);
            if(left!=null) {
            	if(left.data<current.data){
            		System.out.println("ll "+left.data );
                    list.add(left);
                    count++;
                }else {
            		return false;
            	}
            }
            if(right!=null) {
            	if(right.data>current.data){
            		System.out.println(" "+right.data);
                    list.add(right);
                    count++;
                }else {
            		return false;
            	}
            }
            	if(count>0) {
            		System.out.println("ewewewewe "+list.size());
            		list.remove(0);
            		count=0;
            	}else if(left==null && right ==null){
            		System.out.println("size "+list.size());
            		list.remove(0);
            		continue;
            	}
            
        }
        return true;
    }

}
