package com.bupt.leetcode241_260;

public class L258 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(addDigits(38));
	}

	public static int addDigits(int num) {
		int n=0;
		if(num<10) 
			return num;
		else {
			while(num!=0){
				n+=num%10;
				num=num/10;
			}
			return addDigits(n);
		}
	}
}
