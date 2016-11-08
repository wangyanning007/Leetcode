package com.bupt.leetcode221_240;

public class L233 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(countDigitOne(21));
	}

	public static int countDigitOne(int n) {

		int count=0;
		long a,b;
		for(long i=1;i<=n;i*=10){
			a=n/i;
			b=n%i;
			count+=(a+8)/10*i;
			if(a%10==1)
				count+=b+1;
			
		}
		return count;
	}
}
