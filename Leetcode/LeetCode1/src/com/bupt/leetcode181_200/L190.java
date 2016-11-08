package com.bupt.leetcode181_200;

public class L190 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(reverseBits(1));
//		System.out.println(Math.pow(2, 31));
	}

	public static int reverseBits(int n) {

		int result=0;
		for(int i=0;i<31;i++){
			result=(n&1)|result;
			n=n>>1;
			result=result<<1;
		}
		result=(n&1)|result;
		return result;
	}
}
