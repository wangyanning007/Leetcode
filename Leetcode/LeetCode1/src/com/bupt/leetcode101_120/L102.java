package com.bupt.leetcode101_120;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class L102 {

	/**
	 * @param args
	 * 
	 *   解题思路：用null做标记
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Queue<Integer> queue=new LinkedList<Integer>();
		queue.add(1);
		queue.add(null);
		
		System.out.println(queue.size());
	}

	public List<List<Integer>> levelOrder(TreeNode root) {

		List<List<Integer>> lists=new ArrayList<List<Integer>>();
		if(root==null) return lists;
		Queue<TreeNode> queue=new LinkedList<TreeNode>();
		queue.add(root);
		queue.add(null);
		ArrayList<Integer> list=new ArrayList<Integer>();
		while(queue.size()!=1){
			TreeNode node=queue.remove();
			if(node==null){
				queue.add(node);
				lists.add(list);
				list=new ArrayList<Integer>();
			}else {
				list.add(node.val);
				if(node.left!=null) queue.add(node.left);
				if(node.right!=null) queue.add(node.right);
			}
		}
		if(list.size()!=0) lists.add(list);
		return lists;
	}

}
