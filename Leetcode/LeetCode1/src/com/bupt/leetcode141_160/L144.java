package com.bupt.leetcode141_160;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class L144 {

	/**
	 * @param args
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public List<Integer> preorderTraversal(TreeNode root) {

		List<Integer> list =new ArrayList<Integer>();
		Stack<TreeNode> stack=new Stack<TreeNode>();
		TreeNode p=root;
		if(p!=null){
			stack.push(p);
		}
		while(!stack.empty()){
			TreeNode node=stack.pop();
			list.add(node.val);
			if(node.right!=null) stack.push(node.right);
			if(node.left!=null)  stack.push(node.left);
		}
		return list;
	}
	

}
