package com.bupt.leetcode41_60;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class L47 {

	/**
	 * @param args
	 */
	List<List<Integer>> lists = new ArrayList<List<Integer>>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { 1, 1, 2 };

		System.out.println(permute(nums));
	}

	public static List<List<Integer>> permute(int[] nums) {
		// TODO Auto-generated method stub
		List<List<Integer>> lists = new ArrayList<List<Integer>>();
		Arrays.sort(nums);
//		while (++i <= factorial(nums.length)) {
//			List<Integer> list = new ArrayList<Integer>();
//			for (int x : nums) {
//				list.add(x);
//			}
//			if(!lists.contains(list)){
//				lists.add(list);
//			}
			
		do {
			List<Integer> list = new ArrayList<Integer>();
			for (int x : nums) {
				list.add(x);
			}
//			if(!lists.contains(list)){
				lists.add(list);
//			}
		}while(nextPermutation(nums));
		return lists;
	}

	private static boolean nextPermutation(int[] nums) {
		// TODO Auto-generated method stub
		int i = nums.length - 1;
		while (i > 0 && nums[i - 1] >= nums[i]) {
			i--;
		}
		if (i == 0) {
//			reverse(nums, 0, nums.length - 1);
			return false;
		}
		int j = nums.length - 1;
		while (j > 0 && nums[i - 1] >= nums[j]) {
			j--;
		}
		int tmp = nums[i - 1];
		nums[i - 1] = nums[j];
		nums[j] = tmp;
		reverse(nums, i, nums.length - 1);
		return true;
	}

	private static void reverse(int[] nums, int begin, int end) {
		// TODO Auto-generated method stub
		int l = begin, r = end;
		while (l < r) {
			int tmp = nums[l];
			nums[l] = nums[r];
			nums[r] = tmp;
			l++;
			r--;
		}
	}

	

}
