package com.bupt.leetcode121_140;

public class L121 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int maxProfit(int[] prices) {

		if(prices.length<=1) return 0;
		int min=prices[0];
		int res=0;
		for (int i = 0; i < prices.length; i++) {
			if (prices[i]<min) {
				min=prices[i];
			}else if ((prices[i]-min)>res){
				res=prices[i]-min;
			}
		}
		return res;
	}
}
