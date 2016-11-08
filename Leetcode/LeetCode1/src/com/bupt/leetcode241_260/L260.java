package com.bupt.leetcode241_260;

public class L260 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int nums[]={1,1,2,2,3,5};
		System.out.println(singleNumber(nums)[1]);
	}

	public static int[] singleNumber(int[] nums) {

		int res[]=new int[2];
		int num=0;
		for(int i=0;i<nums.length;i++){
			num^=nums[i];
		}
		
		num&=~(num-1);
		for(int i=0;i<nums.length;i++){
			if((num&nums[i])==num){
				res[0]^=nums[i];
			}else {
				res[1]^=nums[i];
			}
		}
		return res;
	}
}
