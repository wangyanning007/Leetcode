package com.bupt.leetcode41_60;

public class L45 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] nums={2,0,1,1,1,1};
		System.out.println(jump(nums));
	}

	public static int jump(int[] nums) {

		int []pre=new int[nums.length];
		int reach=0;
		for(int i=0;i<nums.length;i++){
			if(i+nums[i] >reach){
				for(int j=reach+1;j<=(i+nums[i])&&j<nums.length;j++){
					pre[j]=i;
				}
				reach=i+nums[i];
			}
		}
		
		int ans=0;
		int k=nums.length-1;
		while(k>0){
			k=pre[k];
			ans++;
		}
		return ans;
	}
}
