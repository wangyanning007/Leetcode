package com.bupt.leetcode101_120;

public class L106 {

	/**
	 * @param args
	 */
	public int index;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public TreeNode buildTree(int[] inorder, int[] postorder) {

		if(inorder.length==0||postorder.length==0) return null;
		int len=inorder.length;
		index=len-1;
		return creatBinaryTree(inorder,postorder,0,len-1);
	}

	private TreeNode creatBinaryTree(int[] inorder, int[] postorder, int inLeft, int inRight) {
		// TODO Auto-generated method stub
		if(inLeft==inRight){
			TreeNode node=new TreeNode(inorder[inLeft]);
			node.left=null;
			node.right=null;
			return node;
		}
		
		int val =postorder[index];
		int findIndex=inLeft;
		
		while(findIndex!=inRight&&val!=inorder[findIndex]){
			findIndex++;
		}
		
		TreeNode leftNode;
		TreeNode rightNode;
		if(findIndex==inRight){
			rightNode=null;
		}else {
			index--;
			rightNode=creatBinaryTree(inorder, postorder, findIndex+1, inRight);
		}
		if(findIndex==inLeft){
			leftNode=null;
		}else {
			index--;
			leftNode=creatBinaryTree(inorder, postorder, inLeft, findIndex-1);
		}
		
		TreeNode root=new TreeNode(val);
		root.left=leftNode;
		root.right=rightNode;
		return root;
	}
}
