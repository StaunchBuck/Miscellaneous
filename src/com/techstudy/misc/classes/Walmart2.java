package com.techstudy.misc.classes;

public class Walmart2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	//		10
	//	2		12
//	1		3
		Node root = new Node(10);
		root.left = new Node(2);
		//root.right = new Node(13);
		root.left.left = new Node(1);
		//root.left.right = new Node(40);
		
		if(root != null)
			System.out.println(check(root,Integer.MIN_VALUE,Integer.MAX_VALUE));

	}

	private static boolean check(Node root, int minValue, int maxValue) {
		boolean res = true;
		if(minValue<root.val && maxValue>root.val) {
			
			if(root.left != null) {
				res = check(root.left,minValue,root.val);
			}
			if(root.right != null && res) {
				res = check(root.right,root.val,maxValue);
			}
			
		}else {
			res = false;
		}
		return res;
		
	}

}


class Node{
	
	
	int val;
	Node left;
	Node right;
	public Node(int val) {
		super();
		this.val = val;
	}
	
	
}


