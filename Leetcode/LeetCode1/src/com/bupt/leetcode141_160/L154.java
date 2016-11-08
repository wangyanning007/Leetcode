package com.bupt.leetcode141_160;

public class L154 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int findMin(int[] nums) {
        if(nums.length==1)  return nums[0];
		int min=nums[0];
		for(int i=1;i<nums.length;i++){
			if(nums[i]<nums[i-1]){
				return nums[i];
			}
		}
		return min;
    }
}
