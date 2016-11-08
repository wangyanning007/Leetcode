package com.bupt.leetcode281_300;

public class L287 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int []nums={1,3,4,2,2};
		System.out.println(findDuplicate(nums));
		
	}

	public static int findDuplicate(int[] nums) {

		int slow=0;
		int fast=0;
		do{
			slow=nums[slow];
			fast=nums[nums[fast]];
		}while(slow!=fast);
		int f=0;
		do{
			f=nums[f];
			slow=nums[slow];
		}while(f!=slow);
		
		return f;
	}

}
