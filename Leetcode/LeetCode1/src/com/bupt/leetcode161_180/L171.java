package com.bupt.leetcode161_180;

public class L171 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(titleToNumber("ZZ"));
	}

	public static int titleToNumber(String s) {

		if(s.length()==0) return 0;
		int sum=0;
		int len=s.length();
		for(int i=len-1;i>=0;i--){
			sum+=Math.pow(26,len-i-1 )*(s.charAt(i)-'A'+1);
		}
		return sum;
	}

}
