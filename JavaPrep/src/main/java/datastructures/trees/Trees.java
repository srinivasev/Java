package datastructures.trees;

import java.util.Scanner;

public class Trees {
	
	//root of the tree
	public static Node root;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the element to insert");
		int key = scan.nextInt();
		
		System.out.println("Enter the operation \n 1-Insertion");
		int operation = scan.nextInt();
		
		switch(operation){
			case 1: insertIntotree(key); 
			//test
			insertIntotree(5);
			insertIntotree(15);
			inOrder(root);
			break;
			default:
			break;
		}
	}
	
	private static void displayTree() {
		// TODO Auto-generated method stub
		//inorder display
		Node start = root;
		while(start.leftNode != null){
			start = start.leftNode;
		}
	}
	
	public static void inOrder(Node root) {  
		  if(root !=  null) {  
		   inOrder(root.leftNode);  
		   //Visit the node by Printing the node data    
		   System.out.println(root.key);  
		   inOrder(root.rightNode);  
		  }  
		 } 

	private static void insertIntotree(int key){
		// TODO Auto-generated method stub
		Node node = new Node();
		node.setKey(key);
		//traversal node
		
		if(root == null){
			root = node;
		}else{
			Node focusNode = root;
			Node parent;
			while(true){
				parent = focusNode;
				if(key<focusNode.key){
					focusNode = focusNode.leftNode;
					if(focusNode == null){
						parent.leftNode = node;
						return;
					}
				}else{
					focusNode = focusNode.rightNode;
					if(focusNode == null){
						parent.rightNode = node;
						return;
					}
				}
			}
		}
	}	
}


class Node{
	public int key;
	public String value;
	
	public int getKey() {
		return key;
	}
	public void setKey(int key) {
		this.key = key;
	}
	public Node leftNode;
	public Node rightNode;
}
