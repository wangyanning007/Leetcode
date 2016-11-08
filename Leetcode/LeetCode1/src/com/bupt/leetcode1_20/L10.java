package com.bupt.leetcode1_20;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class L10 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isMatch("aab", "c*a*b"));

	}

	public static boolean isMatch(String s, String p) {

		boolean b = true;
		int len_s = s.length();
		int len_p = p.length();
		int pre;
		// System.out.println(len_s);
		if (len_s > len_p) {
			return false;
		}
		// if (len_s==0) {
		// return true;
		// }
		ArrayList<Integer> arr = new ArrayList<Integer>();
		for (int i = 0; i < len_p; i++) {
			if (p.charAt(i) == '*') {
				arr.add(i);
			}
		}
		System.out.println(arr);
		if (arr.size() == 0) {
			for (int i = 0; i <= len_p - len_s; i++) {
				for (int j = 0; j < len_s; j++) {
					if (s.charAt(j) != p.charAt(j)) {
						b = false;
						break;
					}

				}
				break;
			}
		} else {

		}
		return b;

	}

}
