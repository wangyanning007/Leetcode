package com.bupt.leetcode101_120;

public class L101 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public boolean isSymmetric(TreeNode root) {

		if(root==null)
			return true;
		else {
			return isSame(root.left, root.right);
		}
		
	}
	public boolean isSame(TreeNode p,TreeNode q){
		if(p==null&&q==null)
			return true;
		else if (p==null&&q!=null||p!=null&&q==null) {
			return false;
		}else {
			return (p.val==q.val)&&isSame(p.left,q.right)&&isSame(p.right,q.left);
		}
	}

}
