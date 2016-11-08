package com.bupt.leetcode181_200;

public class L198 {

	/**
	 * @param args
	 * 动态规划思想
	 * maxV[i]=max{maxV[i-2]+nums[i],maxV[i-1]}
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int []nums={3,1,1,8};
		System.out.println(rob(nums));
	}

	public static int rob(int[] nums) {

		if(nums.length==0) return 0;
		
		int [] maxV=new int[nums.length];
		maxV[0]=nums[0];
		maxV[1]=Math.max(nums[0], nums[1]);
		for(int i=2;i<nums.length;i++){
			maxV[i]=Math.max(maxV[i-2]+nums[i], maxV[i-1]);
		}
		return maxV[nums.length-1];
	}
}
