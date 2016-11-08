package com.bupt.leetcode21_40;

public class L31 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] nums = { 1, 1,2 };
		nextPermutation(nums);
		for(int i:nums){
			System.out.println(i);
		}
	}

	public static void nextPermutation(int[] nums) {
		
		//第一步：求最后一个正序
		int i=nums.length-1;
		while(i>0&&nums[i-1]>=nums[i]){
			i--;
		}
		System.out.println(i);
		if(i==0){
			reverse(nums,0,nums.length-1);
			return;
		}
		//第二步：发现比nums[i-1]大的最后一个数
		int j=nums.length-1;
		while(j>0&&nums[i-1]>=nums[j]){
			j--;
		}
		//第三步：交换nums[i-1]和nums[j]
		int tmp=nums[i-1];
		nums[i-1]=nums[j];
		nums[j]=tmp;
		
		//第四步：将nums[i-1]后面的数字进行翻转
		reverse(nums, i, nums.length-1);
		
	}

	private static void reverse(int[] nums, int begin, int end) {
		// TODO Auto-generated method stub
		int l=begin,r=end;
		while(l<r){
			int tmp=nums[l];
			nums[l]=nums[r];
			nums[r]=tmp;
			l++;
			r--;
		}
	}
}
