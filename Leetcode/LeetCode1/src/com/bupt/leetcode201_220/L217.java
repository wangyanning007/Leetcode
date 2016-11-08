package com.bupt.leetcode201_220;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class L217 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int nums[]={1,1,3,4};
		System.out.println(containsDuplicate(nums));
	}

	public static boolean containsDuplicate(int[] nums) {

//		List<Integer> list=new ArrayList<Integer>();
//		for(int i=0;i<nums.length;i++){
//			if(list.contains(nums[i]))
//				return true;
//			else {
//				list.add(nums[i]);
//			}
//			
//		}
//		return false;
		if(nums.length<=1) return false;
		Arrays.sort(nums);
		for(int i=0;i<nums.length-1;i++){
			if(nums[i]==nums[i+1])
				return true;
		}
		return false;
	}

}
