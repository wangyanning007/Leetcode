package com.bupt.leetcode121_140;

import java.util.ArrayList;
import java.util.List;

public class L132 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String string = "aab";
		System.out.println(minCut(string));
	}

	public static int minCut(String s) {

		if (s.length() <= 0)
			return 0;

		int n = s.length();
		boolean[][] isPalind = new boolean[n][n];
		int[] cutNum = new int[n];

		for (int i = 0; i < n; i++) {
			cutNum[i] = i;

			for (int j = i; j >= 0; j--) {
				if (s.charAt(i) == s.charAt(j)
						&& (i - j < 2 || isPalind[j + 1][i - 1])) {
					isPalind[j][i] = true;

					if (j == 0) {
						cutNum[i] = 0;
					} else {
						cutNum[i] = Math.min(cutNum[i], cutNum[j - 1] + 1);
					}
				}

			}
		}

		return cutNum[n - 1];
	}

}
