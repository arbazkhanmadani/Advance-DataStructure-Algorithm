package in.dsa.tree.problems;

import in.dsa.tree.impl.Tree;
import in.dsa.tree.impl.Tree.Node;

public class CountNodes {

	
	public static int countNodes(Node root){
		
		if(root==null) return 0;
		
		int LeftNodesCount = countNodes(root.left);
		int RightNodesCount = countNodes(root.right);
		
		//left node(3)+Right Node(2)+root node(1);
		return LeftNodesCount+RightNodesCount+1;
	}
	
	
	public static void main(String[] args) {

		Tree t = new Tree();
		int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
		Node root = t.buildTree(nodes);

		int numberOfNodes = countNodes(root);
		System.out.println(numberOfNodes);
	}
	

}
