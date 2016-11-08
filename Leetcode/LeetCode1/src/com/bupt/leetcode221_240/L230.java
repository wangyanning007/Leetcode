package com.bupt.leetcode221_240;

import java.util.Stack;

public class L230 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int kthSmallest(TreeNode root, int k) {

		TreeNode p = root;
		Stack<TreeNode> stack = new Stack<TreeNode>();
		TreeNode node=null;
		while (k > 0 && !stack.empty() || p != null) {
			if (p != null) {
				stack.push(p);
				p = p.left;
			} else {
				 node= stack.pop();
				k--;
				p = node.right;
			}
		}
		return node.val;

	}

}
