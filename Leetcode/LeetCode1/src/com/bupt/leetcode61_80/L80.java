package com.bupt.leetcode61_80;

import java.util.HashMap;
import java.util.Map;

public class L80 {

	/**
	 * @param args
	 * 
	 *            在leetcode中，数组nums可以重用，如最下所示
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { 1, 1, 1, 2, 2, 3 };

		System.out.println(removeDuplicates(nums));
	}

	public static int removeDuplicates(int[] nums) {
		int count = 0;
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int x : nums) {
			if (!map.containsKey(x)) {
				map.put(x, 1);
			} else if (map.get(x) < 2) {
				map.put(x, map.get(x) + 1);
			} else {
				count++;
			}
		}
		return nums.length - count;
	}

//	public int removeDuplicates1(int[] nums) {
//		int count = 0;
//		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
//		for (int i = 0; i < nums.length; i++) {
//			if (!map.containsKey(nums[i])) {
//				map.put(nums[i], 1);
//				nums[count++] = nums[i];
//			} else if (map.get(nums[i]) < 2) {
//				map.put(nums[i], map.get(nums[i]) + 1);
//				nums[count++] = nums[i];
//			}
//		}
//		return count;
//	}
}
