package com.bupt.leetcode21_40;
public class L34 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] nums={1,1};
		int []s=searchRange(nums,1);
		for (int i : s) {
			System.out.println(i);
		}
	}

	public  static int[] searchRange(int[] nums, int target) {
		int size = nums.length;
	    int[] res = { -1, -1 };
	    int l = 0;
	    int r = size;
	    int mid;
	    while(l<r){
	    	mid=(l+r)/2;
	    	if(mid==0&&nums[mid]==target||mid>0&&nums[mid-1]<target&&nums[mid]==target){
	    		res[0]=mid;
	    		break;
	    	}
	    	if(nums[mid]<target){
	    		l=mid+1;
	    	}else {
				r=mid;
			}
	    }
	    l = 0;
	    r = size;
	    while(l<r){
	    	mid=(l+r)/2;
	    	if(mid==nums.length-1&&nums[mid]==target||mid<nums.length-1&&nums[mid+1]>target&&nums[mid]==target){
	    		res[1]=mid;
	    		break;
	    	}
	    	if(nums[mid]<=target){
	    		l=mid+1;
	    	}else{
				r=mid;
			}
	    }
	   return res;

	}
}
