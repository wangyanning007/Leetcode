package com.bupt.leetcode161_180;

public abstract class L169 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int []nums={3,3,4};
		System.out.println(majorityElement(nums));
	}

	public static int majorityElement(int[] nums) {

		int count=0;
		int candidate=0;
		for(int i=0;i<nums.length;i++){
			if(count==0) candidate=nums[i];
			if(candidate==nums[i]){
				count++;
			}else {
				count--;
			}
			
		}
		return candidate;
	}
}
