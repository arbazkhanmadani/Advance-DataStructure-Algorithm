package in.dsa.tree.problems;

import in.dsa.tree.impl.Tree;
import in.dsa.tree.impl.Tree.Node;

public class SumOfNodes {


	public static int sumOfNodes(Node root){
		
		if(root==null) return 0;
		
		int LeftNodesSum = sumOfNodes(root.left);
		int RightNodesSum = sumOfNodes(root.right);
		
		return LeftNodesSum+RightNodesSum+root.data;
	}
	
	
	public static void main(String[] args) {

		Tree t = new Tree();
		int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
		Node root = t.buildTree(nodes);

		int numberOfNodes = sumOfNodes(root);
		System.out.println(numberOfNodes);
	}

}
