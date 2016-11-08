package com.bupt.leetcode261_280;

import java.util.Arrays;

public class L268 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int nums[]={0};
		System.out.println(missingNumber(nums));
	}

	public static int missingNumber(int[] nums) {
		
		Arrays.sort(nums);

		if(nums[nums.length-1]==nums.length-1)
			return nums.length;
		int sum=0;
		for(int i=0;i<nums.length;i++){
			sum+=nums[i];
		}
		int n=nums[nums.length-1];
		return n*(n+1)/2-sum;
	}

}
