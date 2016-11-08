package com.bupt.leetcode101_120;

public class L110 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public boolean isBalanced(TreeNode root) {

		if(checkHeight(root)==-1){
			return false;
		}else {
			return true;
		}
	}

	private int checkHeight(TreeNode root) {
		// TODO Auto-generated method stub
		
		if(root==null) return 0;
		
		int leftHeight=checkHeight(root.left);
		if(leftHeight==-1) return -1;
		
		int rightHeight=checkHeight(root.right);
		if(rightHeight==-1) return -1;
		
		if(Math.abs(leftHeight-rightHeight)>1){
			return -1;
		}else {
			return Math.max(leftHeight, rightHeight)+1;
		}
		
	}

}
