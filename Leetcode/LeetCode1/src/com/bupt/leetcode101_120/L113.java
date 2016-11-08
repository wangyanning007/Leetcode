package com.bupt.leetcode101_120;

import java.util.ArrayList;
import java.util.List;

public class L113 {

	/**
	 * @param args
	 */
	public List<List<Integer>> lists =new ArrayList<List<Integer>>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public List<List<Integer>> pathSum(TreeNode root, int sum) {

		
		List<Integer> list=new ArrayList<Integer>();
		list.add(root.val);
		dfs(root,sum-root.val,list);
		return lists;
	}

	private void dfs(TreeNode root, int i, List<Integer> list) {
		// TODO Auto-generated method stub
		if(root.left==null&&root.right==null&&i==0){
			lists.add(list);
			return ;
		}
		
		if(root.left!=null){
			List<Integer> l1=new ArrayList<Integer>(list);
			l1.add(root.left.val);
			dfs(root.left, i-root.left.val, l1);
		}
		
		if(root.right!=null){
			List<Integer> l1=new ArrayList<Integer>(list);
			l1.add(root.right.val);
			dfs(root.right, i-root.right.val, l1);
		}
	}

}
