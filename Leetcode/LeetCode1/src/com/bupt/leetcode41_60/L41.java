package com.bupt.leetcode41_60;

public class L41 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { 1, 2, 0 };
		System.out.println(firstMissingPositive(nums));
	}

	public static int firstMissingPositive(int[] nums) {

		for (int i = 0; i < nums.length; i++) {
			while (nums[i] > 0 && nums[i] <= nums.length
					&& nums[nums[i] - 1] != nums[i]) {
				int tmp = nums[nums[i] - 1];
				nums[nums[i] - 1] = nums[i];
				nums[i] = tmp;
			}
		}

		for (int i = 0; i < nums.length; i++) {
			if (nums[i] != i + 1)
				return i + 1;
		}
		return nums.length+1;
	}
}
