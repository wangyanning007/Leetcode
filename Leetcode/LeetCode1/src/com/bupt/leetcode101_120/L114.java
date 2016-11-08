package com.bupt.leetcode101_120;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class L114 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public void flatten(TreeNode root) {

		if(root==null) return;
		Queue<TreeNode> queue=new LinkedList<TreeNode>();
		Stack<TreeNode> stack=new Stack<TreeNode>();
		
		queue.add(root);
		stack.push(root);
		while(!stack.empty()){
			TreeNode node=stack.peek();
			if(node.left!=null){
				queue.add(node.left);
				stack.push(node.left);
				node.left=null;
			}else if (node.right!=null) {
				queue.add(node.right);
				stack.push(node.right);
				node.right=null;
			}else {
				stack.pop();
			}
		}
		
		TreeNode node=queue.poll();
		while(!queue.isEmpty()){
			node.right=queue.poll();
			node=node.right;
		}
	}

}
