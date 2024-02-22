package com.streamApi;

class TreeNode{
	int data;
	TreeNode left,right;
	
	public TreeNode(int data) {
		this.data=data;
		left=right=null;
	}
}
class BinaryTreeInverse{
	
	public  TreeNode inverse(TreeNode node) {
		if(node!=null) {
			TreeNode temp=node.left;
			node.left=inverse(node.right);
			node.right=temp;
		}
		return node;
	}
	
	public static void main(String[] args) {
		BinaryTreeInverse nn=new BinaryTreeInverse();
		TreeNode root=new TreeNode(1);
		root.left=new TreeNode(2);
		root.left.left=new TreeNode(4);
		root.left.right=new TreeNode(5);
		root.right=new TreeNode(3);
		
		TreeNode roo1t=nn.inverse(root);
		nn.travels(roo1t);
		
	}

	private void travels(TreeNode roo1t) {
		if(roo1t!=null) {
			travels(roo1t.left);
			System.out.println(roo1t.data+ " ");
			travels(roo1t.right);
			
			
		}
		
	}
}