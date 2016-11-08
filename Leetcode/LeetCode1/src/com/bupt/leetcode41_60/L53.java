package com.bupt.leetcode41_60;

public class L53 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] nums={-2,1,-3,4,-1,2,1,-5,4};
		
		System.out.println(maxSubArray(nums));
	}

	public static int maxSubArray(int[] nums) {

		int sum=Integer.MIN_VALUE;
		int maxNum=Integer.MIN_VALUE;;
		for(int i=0;i<nums.length;i++){
			if(sum>0){
				sum+=nums[i];
			}else {
				sum=nums[i];
			}
			if(sum>maxNum)
				maxNum=sum;
		}
		return maxNum;
	}
}
