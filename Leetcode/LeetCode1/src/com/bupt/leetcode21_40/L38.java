package com.bupt.leetcode21_40;

public class L38 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(countAndSay(3));
	}

	public static String countAndSay(int n) {
		if (n == 1)
			return "1";

		String str = countAndSay(n - 1)+"*";
		char[] c = str.toCharArray();
		int count = 1;
		String s = "";
		for (int i = 0; i < c.length - 1; i++) {
			if (c[i] == c[i + 1]) {
				count++;
			} else {
				s += count + "" + c[i];
				count = 1;
			}
		}
		return s;
	}
}
