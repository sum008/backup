package tst;

public class List {
	
	private Node head;
	private Node tail;
	private Node prv;
	
	public void add(int data){
		Node node=new Node(data);
		
		if(tail==null){
			//tail.prev=null;
			head=node;
			tail=node;
			
		}else{
			prv=tail;
			tail.next=node;
			tail=node;
			tail.prev=prv;
			//head.prev=node;
		}
		 head.prev=node;
	}

}
