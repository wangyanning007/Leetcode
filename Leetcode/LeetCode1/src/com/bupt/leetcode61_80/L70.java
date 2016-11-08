package com.bupt.leetcode61_80;

public class L70 {

	/**
	 * @param args
	 *            提示：裴波那契数列
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(climbStairs(3));
	}

	public static int climbStairs(int n) {

		if (n == 0 || n == 1 || n == 2)
			return n;
		int[] aa = new int[n];
		aa[0] = 1;
		aa[1] = 2;
		for (int i = 2; i < n; i++) {
			aa[i] = aa[i - 1] + aa[i - 2];
		}
		return aa[n - 1];
	}
}
