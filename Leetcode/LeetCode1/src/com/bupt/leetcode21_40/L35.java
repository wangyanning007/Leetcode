package com.bupt.leetcode21_40;

public class L35 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] nums={1,3,5,6};
		
		System.out.println(searchInsert(nums, 5));
		System.out.println(searchInsert(nums, 2));
		System.out.println(searchInsert(nums, 7));
		System.out.println(searchInsert(nums, 0));
	}

	public static int searchInsert(int[] nums, int target) {
		if(nums.length==0) return 0;
		int index=0;
		for(int i=0;i<nums.length;i++){
			if(nums[i]>=target){
				index=i;
				break;
			}else if(i==nums.length-1){
				index=nums.length;
			}
		}
		return index;
	}
}
