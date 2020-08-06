package binaryTree;

public class Run {

	public static void main(String[] args) throws InterruptedException {
		Tree intTree = new Tree();
	    /*intTree.insert(50);
	    
	    intTree.insert(75);
	    intTree.insert(10);
	    intTree.insert(30);
	    intTree.insert(26);
	    intTree.insert(55);
	    intTree.insert(80);  //Node@15db9742
	    intTree.insert(5);
	    intTree.insert(25);*/
		intTree.insertRecursion(10,intTree.getRoot());
		intTree.insertRecursion(5,intTree.getRoot());
		/*intTree.insertRecursion(30,intTree.getRoot());
		intTree.insertRecursion(20,intTree.getRoot());
		intTree.insertRecursion(50,intTree.getRoot());
		intTree.insertRecursion(60,intTree.getRoot());*/
	    System.out.println("xyz");
	    
	    //intTree.addToList();
	    //intTree.sortPrint();
		//intTree.search(5);
	    
	   // intTree.preOrderRecursive(intTree.getRoot()); //5 10 26 30 25 55 80 75 50
	                                         //50 10 5 30 26 25 75 55 80
	                                         //5 10 25 26 30 50 55 75 80
	   // System.out.println("###############################");
	    
	    intTree.preOrderIterative(intTree.getRoot());
	    System.out.println("###############################");
    }
		
	}


