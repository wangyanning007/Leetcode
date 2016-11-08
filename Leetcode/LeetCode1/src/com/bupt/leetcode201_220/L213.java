package com.bupt.leetcode201_220;

public class L213 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int []nums={3,1,1,3};
		System.out.println(rob(nums));
	}

	public static int rob(int[] nums) {
		int len=nums.length;
		if(len==0) return 0;
		if(len==1) return nums[0];
		if(len==2) return Math.max(nums[0], nums[1]);
		
		return Math.max(robMax(nums,0,len-2),robMax(nums,1,len-1));

	}
	public static int robMax(int []nums,int start,int end){
		int []maxV=new int[end-start+1];
		maxV[0]=nums[start++];
		maxV[1]=Math.max(maxV[0], nums[start++]);
		for(int i=2;i<maxV.length;i++){
			maxV[i]=Math.max(maxV[i-2]+nums[start++], maxV[i-1]);
		}
		return maxV[maxV.length-1];
	}

}
