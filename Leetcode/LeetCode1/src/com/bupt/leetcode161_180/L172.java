package com.bupt.leetcode161_180;

public class L172 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(trailingZeroes(32));
	}

	public static int trailingZeroes(int n) {

//		int count=0;
//		if(n<5) return count;
//		int m=0;
//		for(int i=5;i<=n;i+=5){
//			m=i;
//			while(m!=0){
//				if(m%5==0) {
//					count++;
//				}
//				m/=5;
//			}
//		}
//		return count;
		
		int count=0;
		while(n/5!=0){
			n/=5;
			count+=n;
		}
		return count;
	}
}
 