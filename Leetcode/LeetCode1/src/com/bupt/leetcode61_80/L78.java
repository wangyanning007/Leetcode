package com.bupt.leetcode61_80;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class L78 {

	/**
	 * @param args
	 */
	static List<List<Integer>> lists = new ArrayList<List<Integer>>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] nums = { 1, 2, 3 };
		System.out.println(subsets(nums));
	}

	public static List<List<Integer>> subsets(int[] nums) {

		Arrays.sort(nums);
		for (int i = 0; i <=nums.length; i++) {
			backTracking(new ArrayList<Integer>(), nums, 0, i);
		}

		return lists;
	}

	private static void backTracking(ArrayList<Integer> cur, int[] nums,
			int from, int target) {
		// TODO Auto-generated method stub
		if (cur.size() == target) {
			List<Integer> list = new ArrayList<Integer>(cur);
				lists.add(list);
			
		} else {
			for (int i = from; i < nums.length; i++) {
				cur.add(nums[i]);
				backTracking(cur, nums, i + 1, target);
				cur.remove(new Integer(nums[i]));
			}
		}

	}
}
