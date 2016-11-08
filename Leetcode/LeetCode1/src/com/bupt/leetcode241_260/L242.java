package com.bupt.leetcode241_260;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class L242 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="aab";
		String t="baa";
		System.out.println(isAnagram(s, t));
	}

	public static boolean isAnagram(String s, String t) {

		char[] sArr=s.toCharArray();
		char[] tArr=t.toCharArray();
		Arrays.sort(sArr);
		Arrays.sort(tArr);
		return String.valueOf(sArr).equals(String.valueOf(tArr));
	}
}
