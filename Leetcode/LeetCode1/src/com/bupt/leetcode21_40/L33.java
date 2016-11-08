package com.bupt.leetcode21_40;

public class L33 {

	/**
	 * @param args
	 * 没有做出正确答案
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {4,5,6,7,0,1,2 };
		System.out.println(search(nums, 5));
	}

	public static int search(int[] nums, int target) {

		int len=nums.length;
		if(len==0) return -1;
		else if (len==1) {
			return target==nums[0]?0:-1;
		}
		int l=0,r=len-1;
		while(l<r){
			int mid=(l+r)/2;
			if(target==nums[mid]) return mid;
			else if(target==nums[l]) return l;
			else if(target==nums[r]) return r;
			
			//第一种情况  不在数组范围内
			if(nums[l]<nums[r]&&(target<nums[l]||target>nums[r])) {
				return -1;
			}
			//第一、二种左侧情况
			if(nums[l]<nums[mid]&&target>nums[l]&&target<nums[r]){
				r=mid-1;
				continue;
			}
			//第一、三种右侧情况
			if(nums[r]>nums[mid]&&target>nums[mid]&&target<nums[r]){
				l=mid+1;
				continue;
			}
			//第二种右侧情况
			if(nums[mid]>nums[r]){
				l=mid+1;
				continue;
			}
			//第三种左侧情况
			if(nums[mid]<nums[l]){
				r=mid-1;
				continue;
			}
		}
		return -1;
	}
}
