package com.bupt.leetcode301_320;

public class NumArray {
	
	int []nums;
	public NumArray(int[] nums) {
		this.nums=nums;
	}

	public int sumRange(int i, int j) {
		int sum=0;
		for(int k=i;k<=j;k++){
			sum+=nums[k];
		}
		return sum;
	}
}
