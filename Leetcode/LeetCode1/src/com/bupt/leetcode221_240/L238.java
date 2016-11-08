package com.bupt.leetcode221_240;

import java.util.Iterator;

public class L238 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int nums[]={0,0};
		
		for (int i : productExceptSelf(nums)) {
			System.out.println(i);
		}
	}
	public static int[] productExceptSelf(int[] nums) {
		int tmp[]=new int[nums.length];
		tmp[nums.length-1]=1;
		for(int i=nums.length-2;i>=0;i--){
			tmp[i]=nums[i+1]*tmp[i+1];
		}
		
		int left=1;
		for(int i=0;i<nums.length;i++){
			tmp[i]=left*tmp[i];
			left*=nums[i];
		}
		
		return tmp;
	}
}
