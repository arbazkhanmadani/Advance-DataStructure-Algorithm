
package in.dsa.tree.impl;

import java.util.LinkedList;
import java.util.Queue;

public class Tree{

	//If array has -1 which means null then return.
	private int index = -1;
	public static class Node{
		
		public int data;
		public Node left;
		public Node right;
	
		Node(int data){
			this.data = data;
		}
	} 
	
	
	public Node buildTree(int[] nodes){
	
		index++;
		if(nodes[index]==-1)return null;

		Node temp = new Node(nodes[index]);
		temp.left = buildTree(nodes);
		temp.right = buildTree(nodes);
		
		return temp;
		/*
		 1
	   2   3 
	 4  5 n  6
	n nn n n  n
		*/
	}
	
	//Pre order traversal root left right(DFS)
	public void preOrderTraversal(Node root){
		
		if(root==null) return;
		
		System.out.print(root.data+" ");
		preOrderTraversal(root.left);
		preOrderTraversal(root.right);
	}
	
	//Post order traversal left right root(DFS)
	public void postOrderTraversal(Node root){
			
		if(root==null) return;
		
		postOrderTraversal(root.left);
		postOrderTraversal(root.right);
		System.out.print(root.data+" ");
	}
	
	//In order traversal left root right(DFS)
	public void inOrderTraversal(Node root){
				
		if(root==null) return;
				
		inOrderTraversal(root.left);
		System.out.print(root.data+" ");
		inOrderTraversal(root.right);
	}
	
	//***Travels level by level(BFS)...........
	public void levelOrderTraversal(Node root){
		
		//If begging node is null simply return
		if(root==null)return;
		
		Queue<Node> q = new LinkedList<>();
		q.add(root);
		q.add(null);
		
		while(!q.isEmpty()){
			
			Node currentNode = q.remove();
			
			//On getting null do this.
			if(currentNode==null){
				//If get null change line.
				System.out.println();
				//if Q is empty break the loop.
				if(q.isEmpty())
					break;
				//If not empty add null for line change.
				else 
					q.add(null);
			}
			//On getting data do this.
			else{
				//If find data print it.
				System.out.print(currentNode.data+" ");
				//If left node is null add into Q.
				if(currentNode.left!=null)
					q.add(currentNode.left);
				//If right node is null add into Q.
				if(currentNode.right!=null)
					q.add(currentNode.right);	
			}
			
		}
		
	}
		
	
	public static void main(String[] args){
	
		Tree tree = new Tree();
		
		int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
		Node root = tree.buildTree(nodes);
		//If it created correctly, returns the first node of array=>[1]. 7
		System.out.println(root.data);
	
		System.out.println("===============PRE=================");	
		tree.preOrderTraversal(root);
		System.out.println();
		System.out.println("=============Post==================");		
		tree.postOrderTraversal(root);
		System.out.println();
		System.out.println("==============In===================");		
		tree.levelOrderTraversal(root);
	
	}
}
