package com.bupt.leetcode101_120;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class L107 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public List<List<Integer>> levelOrderBottom(TreeNode root) {

		
		List<List<Integer>> lists=new LinkedList<List<Integer>>();
		if(root==null) return lists;
		
		Queue<TreeNode> queue=new LinkedList<TreeNode>();
		queue.add(root);
		queue.add(null);
		
		ArrayList<Integer> list=new ArrayList<Integer>();
		
		while(queue.size()!=1){
			TreeNode node=queue.remove();
			if(node==null){
				queue.add(null);
				lists.add(0, list);
				list=new ArrayList<Integer>();
			}else {
				list.add(node.val);
				if(node.left!=null) queue.add(node.left);
				if(node.right!=null)  queue.add(node.right);
			}
		}
		
		lists.add(0,list);
		return lists;
	}

}
