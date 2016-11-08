package com.bupt.leetcode41_60;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class L46 {

	/**
	 * @param args
	 * �и��ֵ�����������㷨��Ŀǰ�õı����ⷨ
	 */
	static List<List<Integer>> lists = new ArrayList<List<Integer>>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] nums = { 1, 2, 3 };

		System.out.println(permute(nums));
	}

	public static List<List<Integer>> permute(int[] nums) {
		Arrays.sort(nums);
		permutation(new ArrayList<Integer>(), nums);
		return lists;
	}

	private static void permutation(ArrayList<Integer> cur, int[] nums) {
		// TODO Auto-generated method stub
		int i;
		if (cur.size() == nums.length) {
			ArrayList<Integer> list = new ArrayList<Integer>();
			list.addAll(cur);
			lists.add(list);
			return;
		}
		for (i = 0; i < nums.length; i++) {
			if (cur.contains(nums[i]))
				continue;
			cur.add(nums[i]);
			permutation(cur, nums);
			cur.remove(cur.indexOf(nums[i]));
		}

	}
}
