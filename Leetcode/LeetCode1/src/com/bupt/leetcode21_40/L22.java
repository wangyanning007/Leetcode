package com.bupt.leetcode21_40;
import java.util.ArrayList;
import java.util.List;

public class L22 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(generateParenthesis(3));

	}

	public static List<String> generateParenthesis(int n) {

		String string = "(";
		int l = 1, r = 0;
		int m=n-1;

		return generateP(l, r, string, n-1);
	}

	private static List<String> generateP(int l, int r, String string, int n) {
		// TODO Auto-generated method stub
		List<String> list = new ArrayList<String>();
		if (l == n+1) {
			String str=string;
			for (int i = 0; i < (n+1) - r; i++) {
				str += ")";
			}
			
			list.add(str);
		} else if (l == r) {
			string += "(";
			l++;
			list.addAll(generateP(l, r, string, n));
		} else if (l > r) {
			String str1=string+"(";
			int l1=l+1;
			list.addAll(generateP(l1, r, str1, n));

			String str2=string+")";
			int r1=r+1;
			list.addAll(generateP(l, r1, str2, n));
			
		}

		return list;
	}

}
