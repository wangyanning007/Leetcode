package com.bupt.leetcode121_140;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class L129 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int sumNumbers(TreeNode root) {

		if(root==null) return 0;
		List<Integer> list=new ArrayList<Integer>();
		Queue<TreeNode> queue=new LinkedList<TreeNode>();
		queue.add(root);
		queue.add(null);
		
		while(queue.size()!=1){
			TreeNode node=queue.remove();
			if(node==null){
				queue.add(null);
			}else {
				if(node.left==null&&node.right==null) list.add(node.val);
				if(node.left!=null) {
					node.left.val=node.val*10+node.left.val;
					queue.add(node.left);
				}
				if(node.right!=null) {
					node.right.val=node.val*10+node.right.val;
					queue.add(node.right);
				}
				
				
			}
		}
		
		int sum=0;
		for (int i  : list) {
			sum+=i;
		}
		return sum;
	}

}
