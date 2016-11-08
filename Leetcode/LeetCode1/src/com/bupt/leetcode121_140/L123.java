package com.bupt.leetcode121_140;

public class L123 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int []prices={2,1,2,0,1};
		System.out.println(maxProfit(prices));
	}

	public static int maxProfit(int[] prices) {

		if(prices.length==0) return 0;
		int n=prices.length;
		int res=0;
		
		int [] left=new int[n];
		int min=prices[0];
		for(int i=1;i<n;i++){
			if(prices[i]<min){
				min=prices[i];
				left[i]=left[i-1];
			}else {
				if((prices[i]-min)>left[i-1]){
					left[i]=prices[i]-min;
				}else {
					left[i]=left[i-1];
				}
			}
		}
		for (int i : left) {
			System.out.print(i+" ");
		}
		System.out.println();
		
		int []right=new int[n];
		int max=prices[n-1];
		for(int i=n-2;i>=0;i--){
			if(prices[i]>max){
				max=prices[i];
				right[i]=right[i+1];
			}else {
				if((max-prices[i])>right[i+1]){
					right[i]=max-prices[i];
				}else {
					right[i]=right[i+1];
				}
			}
		}
		for (int i : right) {
			System.out.print(i+" ");
		}
		System.out.println();
		
		
		for(int i=0;i<n;i++){
			if((left[i]+right[i])>res)
				res=left[i]+right[i];
		}
		return res;
	}

}
