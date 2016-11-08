package com.bupt.leetcode1_20;
public class L11 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] height = { 10, 9, 8, 7, 6, 5, 4, 3, 2, 1 };
		System.out.println(maxArea(height));

	}

	public static int maxArea(int[] height) {
		int area = 0;
		int area_max = 0;
		int len = height.length;
		if (len < 2) {
			return 0;
		}
		int l = 0, r = len - 1;
		while (l != r) {

			area = (r - l) * Math.min(height[l], height[r]);
			if (area > area_max) {
				area_max = area;
			}
			System.out.println(l + " : " + height[l] + "    " + r + " : "
					+ height[r] + "   " + area);
			if (height[l] < height[r]) {
				l++;
			} else {
				r--;
			}
		}
		return area_max;

	}

}
