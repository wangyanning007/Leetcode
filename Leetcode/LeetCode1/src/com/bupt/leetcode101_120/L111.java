package com.bupt.leetcode101_120;

public class L111 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int minDepth(TreeNode root) {

		if(root==null) return 0;
		if(root.left==null) return minDepth(root.right)+1;
		if(root.right==null) return minDepth(root.left)+1;
		
		return Math.min(minDepth(root.left), minDepth(root.right))+1;
	}

}
