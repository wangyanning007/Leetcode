package com.bupt.leetcode121_140;

import java.util.Arrays;

public class L128 {

	public static void main(String[] args) {

		int[] nums={1,2,0,1};
		
		System.out.println(longestConsecutive(nums));
	}

	public static int longestConsecutive(int[] nums) {

		if(nums.length<=1) return nums.length;
		
		Arrays.sort(nums);
		int a[]=new int[nums.length];
		Arrays.fill(a, 1);
		
		int max=a[0];
		for(int i=1;i<nums.length;i++){
			if(nums[i]==nums[i-1]) a[i]=a[i-1];
			int d=nums[i]-nums[i-1];
			if(d==1){
				a[i]=a[i-1]+1;
				max=Math.max(a[i], max);
			}
		}
		
		return  max;
	}
}
