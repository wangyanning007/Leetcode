package com.bupt.leetcode221_240;

public class L235 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {

		if(root==null) return root;
		if(root==p||root==q) return root;
		
		boolean is_on_left_p=covers(root.left,p);
		boolean is_on_left_q=covers(root.left, q);
		
		if(is_on_left_p!=is_on_left_q) return root;
		
		TreeNode x=is_on_left_p?root.left:root.right;
		 return lowestCommonAncestor(x, p, q);
	}

	private boolean covers(TreeNode root, TreeNode p) {
		// TODO Auto-generated method stub
		if(root==null) return false;
		if(root==p) return true;
		return covers(root.left, p)||covers(root.right, p);
	}

}
