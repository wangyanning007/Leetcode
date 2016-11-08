package com.bupt.leetcode41_60;

import java.util.ArrayList;
import java.util.List;

public class L46_1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] nums = { 11, 5, 3 ,1};

		System.out.println(permute(nums));
	}

	public static List<List<Integer>> permute(int[] nums) {
		// TODO Auto-generated method stub
		List<List<Integer>> lists=new ArrayList<List<Integer>>();
		
		int i=0;
		int count=0;
		while(++i<=factorial(nums.length)){
			List<Integer> list=new ArrayList<Integer>();
			for(int x:nums){
				list.add(x);
			}
			if(!lists.contains(list)){
				count++;
				lists.add(list);
			}
			
			nextPermutation(nums);
		}
		System.out.println(count);
		return lists;
	}

	private static void nextPermutation(int[] nums) {
		// TODO Auto-generated method stub
				int i=nums.length-1;
				while(i>0&&nums[i-1]>=nums[i]){
					i--;
				}
				if(i==0){
					reverse(nums,0,nums.length-1);
					return;
				}
				int j=nums.length-1;
				while(j>0&&nums[i-1]>=nums[j]){
					j--;
				}
				int tmp=nums[i-1];
				nums[i-1]=nums[j];
				nums[j]=tmp;
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
	private static int factorial(int n) {
		// TODO Auto-generated method stub
		return (n==0||n==1)?1:factorial(n-1)*n;
	}

}
