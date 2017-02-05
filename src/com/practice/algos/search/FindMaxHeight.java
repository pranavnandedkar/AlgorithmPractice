package com.practice.algos.search;

class Node{
	int i;
	Node left;
	Node right;
	Node(int i){
		this.i=i;
	}
	
}

public class FindMaxHeight {
	Node root;
	public int maxHeight(Node root){
		if(root == null){
			return 0;
		}
		
		int hl = maxHeight(root.left);
		int hr = maxHeight(root.right);
		if(hl>hr){
			return hl+1;
		}else{
			return hr+1;
		}

	}
	public static void main(String[] args) {
		FindMaxHeight max = new FindMaxHeight();
		max.root = new Node(1);
		max.root.left= new Node(2);
		max.root.right= new Node(3);
		max.root.right.left= new Node(4);
		max.root.right.left.left= new Node(5);
		max.root.right.left.left.right= new Node(6);
		max.root.right.left.left.left= new Node(7);
		System.out.println(max.maxHeight(max.root));

	}

}
