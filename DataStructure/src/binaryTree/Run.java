package binaryTree;

public class Run {

	public static void main(String[] args) {
		
		Tree t =new Tree();
		t.insert(1, t.root);
		t.insert(2, t.root);
		t.insert(4, t.root);
		t.insert(3, t.root);
		t.insert(5, t.root);
		t.insert(6, t.root);
		t.insert(7, t.root);
		/*t.insert(13, t.root);
		t.insert(6, t.root);
		t.insert(8, t.root);*/
		
	//	t.deleteNode(3);
	//	t.traversal(t.root);
       // t.BFS();
    //    t.DFS();
		System.out.println(t.checkBST(t.root));
		System.out.println("done");
	}

}
