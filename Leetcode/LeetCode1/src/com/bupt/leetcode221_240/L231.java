package com.bupt.leetcode221_240;

public class L231 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isPowerOfTwo(31));
	}

	public static boolean isPowerOfTwo(int n) {
		return n>0&&((n&(n-1))==0);
	}

}
