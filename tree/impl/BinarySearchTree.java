package in.dsa.tree.impl;

public class BinarySearchTree {

	private Node root;
	public static class Node{
			
		public int data;
		public Node left;
		public Node right;
		
		Node(int data){
			this.data = data;
		}
	} 
	
	
	
	public Node insert(Node temp, int data){
	
		if(temp==null){
			temp = new Node(data);
			return temp;
		}
		
		//Node temp = new Node(nodes[index]);
		if(data < temp.data)
			temp.left = insert(temp.left,data);
		else if(data > temp.data)
			temp.right = insert(temp.right,data);
		
		
		return temp;
	}
	
	
	//Pre order traversal root left right(DFS)
	public void preOrderTraversal(Node root){
			
		if(root==null) return;
			
		System.out.print(root.data+" ");
		preOrderTraversal(root.left);
		preOrderTraversal(root.right);
	}
	
	
	public static void main(String[] args){
		
		BinarySearchTree tree = new BinarySearchTree();
		
		tree.root = tree.insert(tree.root, 10);
		tree.insert(tree.root, 50);
		tree.insert(tree.root, 40);
		tree.insert(tree.root, 20);
		tree.insert(tree.root, 30);
		
		//If it created correctly, returns the first node of array=>[1]. 7
		System.out.println(tree.root);
		System.out.println("==============PreOrder===============");
		tree.preOrderTraversal(tree.root);
		
	}
}
