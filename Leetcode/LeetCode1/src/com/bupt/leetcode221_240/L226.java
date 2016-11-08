package com.bupt.leetcode221_240;



public class L226 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public TreeNode invertTree(TreeNode root) {
        if(root==null||root.left==null&&root.right==null) return root;
        
        TreeNode tmp=root.left;
        root.left=root.right;
        root.right=tmp;
        invertTree(root.left);
        invertTree(root.right);
        return root;
    }
}
