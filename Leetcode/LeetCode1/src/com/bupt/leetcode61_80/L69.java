package com.bupt.leetcode61_80;

public class L69 {

	/**
	 * Å£¶Ùµü´úËã·¨
	 * Ó¡Ïó±Ê¼Ç
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(mySqrt(16));
	}

	public static int mySqrt(int x) {
		double pre;
		double cur = 10;
		do {
			pre = cur;
			cur = pre / 2 + x / (2 * pre);
		} while (Math.abs(cur - pre) >0.1);
		return (int)cur;
	}
}
