package com.bupt.leetcode101_120;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class L103 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public List<List<Integer>> zigzagLevelOrder(TreeNode root) {

		List<List<Integer>> lists=new ArrayList<List<Integer>>();
		if(root==null) return lists;
		Queue<TreeNode> queue=new LinkedList<TreeNode>();
		int count=1;
		queue.add(root);
		queue.add(null);
		List<Integer> list=new LinkedList<Integer>();
		while(queue.size()!=1){
			TreeNode node=queue.remove();
			if(node==null){
				
				queue.add(null);
				count++;
				lists.add(list);
				list=new LinkedList<Integer>();
			}else {
				if(count%2==1){
					list.add(node.val);
					
				}else{
					list.add(0,node.val);
				}
				if(node.left!=null) queue.add(node.left);
				if(node.right!=null) queue.add(node.right);
			}
		}
		if(list.size()!=0) lists.add(list);
		return lists;
		
	}

}
