package com.bupt.leetcode61_80;

public class L75 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] nums={0,1,0,0,2,2,0,1,1};
		sortColors(nums);
		
	}

	public static void sortColors(int[] nums) {
		int i = -1, j = -1, k = -1;
		for (int m = 0; m < nums.length; m++) {
			if (nums[m] == 0) {
				nums[++k] = 2;
				nums[++j] = 1;
				nums[++i] = 0;
			} else if (nums[m] == 1) {
				nums[++k] = 2;
				nums[++j] = 1;
			} else {
				nums[++k] = 2;
			}
		}
		
		for(i=0;i<nums.length;i++){
			System.out.print(nums[i]+" ");
		}
	}
}
