package com.bupt.leetcode281_300;

public class L283 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] nums={0,1,0,3,12};
		moveZeroes(nums);
	}

	public static void moveZeroes(int[] nums) {
		int count=0;
		for(int i=0;i<nums.length;i++){
			if(nums[i]==0){
				count++;
			}else {
				nums[i-count]=nums[i];
			}
		}
		System.out.println("count: "+count);
		for(int i=count;i>0;i--){
			nums[nums.length-i]=0;
		}
		for(int i:nums){
			System.out.println(i);
		}
	}
}
