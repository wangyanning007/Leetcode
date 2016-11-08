package com.bupt.leetcode41_60;

public class L42 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] height={2,0,2};
		
		System.out.println(trap2(height));
	}

	//第一种方法
	public static int trap(int[] height) {
		int rainV=0;
		int l=0,r=height.length-1;
		while(l<r){
			while(l<r&&height[l]==0) l++;
			while(l<r&&height[r]==0) r--;
			
			int min=Math.min(height[l], height[r]);
			int tmp=0;
			//第一轮遍历
			for(int i=l;i<=r;i++){
				if(height[i]>=min){
					height[i]-=min;
				}else {
					tmp+=min-height[i];
					height[i]=0;
				}
			}
			rainV+=tmp;
		}
		return rainV;
	}
	
	//第二种方法
	public static int trap2(int[] height) {
		int rainV=0;
		int l=0,r=height.length-1;
		while(l<r&&height[l]<=height[l+1]) l++;
		while(l<r&&height[r]<=height[r-1]) r--;
		while(l<r){
			int left=height[l];
			int right=height[r];
			if(left<right){
				while(l<r&&left>=height[++l]){
					rainV+=left-height[l];
				}
			}else {
				while(l<r&&right>=height[--r]){
					rainV+=right-height[r];
				}
			}
		}
		return rainV;
	}
}
