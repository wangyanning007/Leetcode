package com.bupt.leetcode201_220;

import java.util.Arrays;

public class L215 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int findKthLargest(int[] nums, int k) {

		Arrays.sort(nums);
		return nums[nums.length-k];
	}

}
