package com.bupt.leetcode181_200;

public class L191 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(hammingWeight(13));
	}

	public static int hammingWeight(int n) {

		int count=0;
		while(n!=0){
			count+=n&1;
			n=n>>>1;
		}
		return count;
	}
}
