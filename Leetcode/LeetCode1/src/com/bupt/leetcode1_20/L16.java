package com.bupt.leetcode1_20;
import java.util.Arrays;
import java.util.Timer;

public class L16 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num = { 1, 1, 1, 0 };
		System.out.println(threeSumClosest(num, -100));

	}

	public static int threeSumClosest(int[] num, int target) {
		int dif = Integer.MAX_VALUE;
		int sum = Integer.MAX_VALUE;
		int len = num.length;
		Arrays.sort(num);
		int temp;
		for (int i = 0; i < len - 2; i++) {
			int j = i + 1, k = len - 1;
			while (j < k) {
				temp = num[i] + num[j] + num[k];
				if (temp < target) {
					if (target - temp < dif) {
						sum = temp;
						dif=target-temp;
					}
					j++;
				} else if (temp > target) {
					if (temp - target < dif) {
						sum = temp;
						dif=temp-target;
					}
					k--;
				} else {
					sum = temp;
					dif = 0;
					break;
				}
			}
			if (dif == 0) {
				break;
			}
		}
		return sum;
	}

}
