package com.bupt.leetcode41_60;

public class L58 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="  ";
		System.out.println(lengthOfLastWord(s));
	}

	public static int lengthOfLastWord(String s) {
		if(s.trim().length()==0) return 0;
		String []strs=s.split("\\s");
		int len=strs.length;
		return strs[len-1].length();
	}
}
