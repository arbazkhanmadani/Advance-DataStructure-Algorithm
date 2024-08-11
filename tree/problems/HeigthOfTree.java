package in.dsa.tree.problems;

import in.dsa.tree.impl.Tree;
import in.dsa.tree.impl.Tree.Node;

public class HeigthOfTree {

	
public static int heigth(Node root){
		
		if(root==null) return 0;
		
		int LeftHeight = heigth(root.left);
		int RightHeight = heigth(root.right);
		
		int maxHeight = Math.max(LeftHeight, RightHeight);
		               //+root
		return maxHeight + 1;
	}
	
	
	public static void main(String[] args) {

		Tree t = new Tree();
		int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
		Node root = t.buildTree(nodes);

		int heigth = heigth(root);
		System.out.println(heigth);
	}

}
