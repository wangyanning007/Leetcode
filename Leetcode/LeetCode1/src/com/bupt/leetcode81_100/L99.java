package com.bupt.leetcode81_100;

public class L99 {

	/**
	 * @param args
	 */
	
	TreeNode pre,q,p;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public void recoverTree(TreeNode root) {

		pre=p=q=null;
		inorder(root);
		int tmp=p.val;
		p.val=q.val;
		q.val=tmp;
	}
	
	public void inorder(TreeNode root){
//		pre=p=q=null;
		if(root==null){
			return;
		}else {
			inorder(root.left);
			if(pre!=null&&pre.val>root.val){
				if(p==null){
					p=pre;
					q=root;
				}else {
					q=root;
				}
			}
			pre=root;
			inorder(root.right);
		}
	}

}
