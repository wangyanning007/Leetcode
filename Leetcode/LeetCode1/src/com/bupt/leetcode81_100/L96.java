package com.bupt.leetcode81_100;

public class L96 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(numTrees(3));
	}

	public static int numTrees(int n) {

		if(n==0||n==1) return 1;
		int []mm=new int[n+1];
		mm[0]=1;
		mm[1]=1;
		for(int i=2;i<=n;i++){
			for(int j=0;j<i;j++){
				mm[i]+=mm[j]*mm[i-j-1];
			}
		}
		return mm[n];
	}

}
