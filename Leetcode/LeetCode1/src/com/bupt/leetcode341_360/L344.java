package com.bupt.leetcode341_360;

public class L344 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="hello";
		System.out.println(reverseString(s));
	}

	public static String reverseString(String s) {

		StringBuilder sb=new StringBuilder(s);
		sb.reverse();
		return sb.toString();
	}

}
