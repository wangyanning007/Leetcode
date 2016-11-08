package com.bupt.leetcode101_120;

public class L108 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public TreeNode sortedArrayToBST(int[] nums) {

		return creatBalanceBST(nums,0,nums.length-1);
	}

	private TreeNode creatBalanceBST(int[] nums, int start, int end) {
		// TODO Auto-generated method stub
		if(start>end) return null;
		
		int mid=(start+end)/2;
		TreeNode node=new TreeNode(nums[mid]);
		node.left=creatBalanceBST(nums, start, mid-1);
		node.right=creatBalanceBST(nums, mid+1, end);
		return node;
	}

}
