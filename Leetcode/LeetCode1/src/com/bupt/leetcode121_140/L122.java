package com.bupt.leetcode121_140;

public class L122 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int maxProfit(int[] prices) {

		if(prices.length<=1) return 0;
		int res=0;
		for(int i=1;i<prices.length;i++){
			if(prices[i]>prices[i-1]){
				res+=prices[i]-prices[i-1];
			}
		}
		return res;
	}

}
