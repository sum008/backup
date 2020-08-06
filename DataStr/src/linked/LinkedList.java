package linked;

public class LinkedList {
	
	Node head;//Point to front element i.e first object of Node class
	Node tail;//Point to last element i.e last object of Node class
	
	public void add(int data){
		Node node=new Node(data);
		
		if(tail==null){
			head=node;
			tail=node; //tail at line 16 is this tail, thats why node at line 16 is entering at tail of previous node
			//System.out.println(head.data);
		}else{
			tail.nextnode=node;
			//tail=node;//TO make sure that tail is not null i.e it has been initialized(Working just like queue)
			tail=tail.next;
			
		}
	}
	
	public void show(){
		
		while(head.nextnode!=null){
			System.out.println(head.data);
			head=head.nextnode;
		}
		System.out.println(head.data);
	}
	
	

}
