package com.bupt.leetcode81_100;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class L94 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public List<Integer> inorderTraversal(TreeNode root) {

		List<Integer> list=new ArrayList<Integer>();
		
		TreeNode p=root;
		Stack<TreeNode> stack=new Stack<TreeNode>();
		if(root==null) return list;
		while(!stack.empty()||p!=null){
			if(p!=null){
				stack.push(p);
				p=p.left;
			}else {
				TreeNode node=stack.pop();
				list.add(node.val);
				p=node.right;
			}
		}
		return list;
	}

}
