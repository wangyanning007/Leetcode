package com.bupt.leetcode141_160;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class L145 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> list=new ArrayList<Integer>();
        Stack<rootNode> stack=new Stack<rootNode>();
        TreeNode p=root;
        if(p!=null) stack.push(new rootNode(p, false));
        while(!stack.empty()){
        	rootNode curr=stack.peek();
        	if(curr.visited){
        		list.add(curr.node.val);
        		stack.pop();
        	}else {
				if(curr.node.right!=null) stack.push(new rootNode(curr.node.right, false));
				if(curr.node.left!=null) stack.push(new rootNode(curr.node.left, false));
				curr.visited=true;
			}
        }
        return list;
    }
	private class rootNode{
		TreeNode node;
		boolean visited;
		public rootNode(TreeNode node,boolean visited) {
			// TODO Auto-generated constructor stub
			this.node=node;
			this.visited=visited;
		}
	}

}
