package com.bupt.leetcode61_80;

public class L66 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] digits = { 8,9,9,9 };
		int []aa=plusOne(digits);
		for (int i : aa) {
			System.out.println(i);
		}
	}

	public static int[] plusOne(int[] digits) {
		int index = 0;
		int len=digits.length-1;
		if(digits[len]+1==10){
			index=1;
			digits[len]=0;
		}else {
			index=0;
			digits[len]=digits[len]+1;
		}
		for (int i = len-1; i >= 0; i--) {
			if ((digits[i]+index) == 10) {
				index = 1;
				digits[i] = 0;
			} else {
				digits[i] = digits[i] + index ;
				index = 0;
			}
		}
		if (index == 1) {
			int[] digits_1 = new int[digits.length + 1];
			digits_1[0] = 1;
			for (int i = 0; i < digits.length; i++) {
				digits_1[i + 1] = digits[i];
			}
			return digits_1;
		}
		return digits;

	}

}
