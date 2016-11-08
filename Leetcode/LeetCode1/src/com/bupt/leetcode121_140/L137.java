package com.bupt.leetcode121_140;

public class L137 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int nums[]={1,1,1,3,3,3,2};
		System.out.println(singleNumber(nums));
	}

	public static int singleNumber(int[] nums) {

		int ones=0,twos=0,threes=0;
		for(int i=0;i<nums.length;i++){
			twos|=ones&nums[i];
			ones^=nums[i];
			threes=ones&twos;
			ones&=~threes;
			twos&=~threes;
		}
		return ones;
	}

}
