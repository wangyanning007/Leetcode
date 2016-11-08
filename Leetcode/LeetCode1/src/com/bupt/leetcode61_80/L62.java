package com.bupt.leetcode61_80;

public class L62 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(uniquePaths(3, 7));
	}

	public static int uniquePaths(int m, int n) {
		int [][] a=new int [m][n];
		for(int i=0;i<m;i++){
			a[i][0]=1;
		}
		for(int i=0;i<n;i++){
			a[0][i]=1;
		}
		for(int i=1;i<m;i++){
			for(int j=1;j<n;j++){
				a[i][j]=a[i-1][j]+a[i][j-1];
			}
		}
		return a[m-1][n-1];
	}
}
