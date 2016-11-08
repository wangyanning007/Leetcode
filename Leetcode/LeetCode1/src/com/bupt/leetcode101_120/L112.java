package com.bupt.leetcode101_120;

public class L112 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public boolean hasPathSum(TreeNode root, int sum) {

		if(root==null&&sum!=0) return false;
		if(root.left==null&&root.right==null&&sum==0){
			return true;
		}else {
			return hasPathSum(root.left, sum-root.val)||hasPathSum(root.right, sum-root.val);
		}
	}

	
}
