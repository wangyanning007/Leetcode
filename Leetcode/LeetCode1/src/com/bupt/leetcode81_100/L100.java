package com.bupt.leetcode81_100;

public class L100 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public boolean isSameTree(TreeNode p, TreeNode q) {

		if(p==null&&q==null)
			return true;
		else if (p==null||q==null) {
			return false;
		}
		
		if(p.val!=q.val)
			return false;
		else {
			return isSameTree(p.left, q.left)&&isSameTree(p.right, q.right);
		}
	}
	

}
