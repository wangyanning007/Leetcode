package com.bupt.leetcode201_220;

import java.util.HashSet;
import java.util.Set;

public class L202 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(isHappy(2));
	}

	public static boolean isHappy(int n) {
		// Set<Long> set=new HashSet<Long>();
		// long sum = 0;
		// long m=n;
		// while (m<=Integer.MAX_VALUE) {
		// if(set.contains(m)) return false;
		// else {
		// set.add(m);
		// }
		// while (m != 0) {
		// sum += (m % 10) * (m % 10);
		// m /= 10;
		// }
		// m=sum;
		// System.out.println(m);
		// if(m==1){
		// return true;
		// }
		// }
		// return false;

		Set<Long> set = new HashSet<Long>();
		long m = n;
		while (m <= Integer.MAX_VALUE) {
			if (set.contains(m))
				return false;
			else {
				set.add(m);
			}
			m = digitSquare(m);
			if (m == 1) {
				return true;
			}
		}
		return false;
	}

	private static long digitSquare(long m) {
		long sum = 0;
		while (m != 0) {
			sum += Math.pow(m % 10, 2);
			m /= 10;
		}
		return sum;
	}
}
