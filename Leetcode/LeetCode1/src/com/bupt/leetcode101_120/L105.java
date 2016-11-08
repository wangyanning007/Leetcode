package com.bupt.leetcode101_120;

import javax.swing.plaf.multi.MultiButtonUI;

public class L105 {

	/**
	 * @param args
	 */
	public static int index;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] preorder={1,2,3};
		int [] inorder={3,2,1};
		buildTree(preorder, inorder);
	}

	public static TreeNode buildTree(int[] preorder, int[] inorder) {

		if(preorder.length==0||inorder.length==0) return null;
		int len=preorder.length;
		System.out.println(index);
		return creatBanryTree(preorder,inorder,0,len-1,index);
	}

	private static TreeNode creatBanryTree(int[] preorder, int[] inorder, int inLeft,
			int inRight, int index) {
		// TODO Auto-generated method stub
		if(inLeft==inRight){
			TreeNode node=new TreeNode(inorder[inLeft]);
			node.left=null;
			node.right=null;
			return node;
		}
//		System.out.println(index);
		int val=preorder[index];
		int findIndex=inLeft;
		while(findIndex!=inRight&&val!=inorder[findIndex]){
			findIndex++;
		}
		
		TreeNode leftNode=null;
		TreeNode rightNode=null;
		
		if(findIndex==inLeft){
			leftNode=null;
		}else {
			leftNode=creatBanryTree(preorder, inorder, inLeft, findIndex-1, ++(L105.index));
		}
		if(findIndex==inRight){
			rightNode=null;
		}else {
			rightNode=creatBanryTree(preorder, inorder, findIndex+1, inRight, ++(L105.index));
		}
		
		TreeNode root=new TreeNode(val);
//		System.out.println(root.val);
		root.left=leftNode;
		root.right=rightNode;
		return root;
	}

}
