package com.bupt.leetcode241_260;

import java.util.ArrayList;
import java.util.List;

public class L257 {

	/**
	 * @param args
	 */
	List<String> list=new ArrayList<String>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public List<String> binaryTreePaths(TreeNode root) {

		if(root==null) return list;
		StringBuilder sb=new StringBuilder();
		sb.append(root.val);
		dfs(root,sb);
		return list;
	}

	private void dfs(TreeNode root,StringBuilder sb) {
		// TODO Auto-generated method stub
		if(root.left==null&&root.right==null){
			
			list.add(sb.toString());
			return ;
		}
		if(root.left!=null){
			StringBuilder sBuilder=new StringBuilder(sb.toString());
			sBuilder.append("->");
			sBuilder.append(root.left.val);
			dfs(root.left, sBuilder);
		}
		if(root.right!=null){
			StringBuilder sBuilder=new StringBuilder(sb.toString());
			sBuilder.append("->");
			sBuilder.append(root.right.val);
			dfs(root.right, sBuilder);
		}
	}

}
