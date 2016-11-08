package com.bupt.leetcode101_120;

public class L104 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int maxDepth(TreeNode root) {

		if(root==null) return 0;
		return Math.max(maxDepth(root.left),maxDepth(root.right))+1;
	}

}
