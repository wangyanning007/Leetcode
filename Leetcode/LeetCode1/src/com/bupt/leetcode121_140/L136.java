package com.bupt.leetcode121_140;

public class L136 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int nums[]={1,2,1,2,3};
		System.out.println(singleNumber(nums));
	}

	public static int singleNumber(int[] nums) {

		int res=nums[0];
		for(int i=1;i<nums.length;i++){
			res=res^nums[i];
		}
		return res;
	}
}
