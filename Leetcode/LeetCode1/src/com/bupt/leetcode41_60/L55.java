package com.bupt.leetcode41_60;

public class L55 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] nums = {2,3,1,0,4 };
		System.out.println(canJump(nums));
	}

	public static boolean canJump(int[] nums) {
		int reach = 0;  
        int i = 0;  
        for ( ; i < nums.length && i <= reach; i++) {  
            reach = Math.max(reach, i + nums[i]);  
        }  
        return (i == nums.length); 
	}
}
