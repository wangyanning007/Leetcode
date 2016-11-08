package com.bupt.leetcode61_80;

public class L63 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [][] obstacleGrid={
				{0,1,0},
				{0,0,0},
				{0,0,0}
		};
		System.out.println(uniquePathsWithObstacles(obstacleGrid));
	}

	public static int uniquePathsWithObstacles(int[][] obstacleGrid) {

		int m=obstacleGrid.length;
		int n=obstacleGrid[0].length;
		int [][]a=new int [m][n];
		boolean flag=true;
		for(int i=0;i<m;i++){
			if(obstacleGrid[i][0]==1){
				flag=false;
				a[i][0]=0;
			}
			if(flag){
				a[i][0]=1;
			}else {
				a[i][0]=0;
			}
		}
		flag=true;
		for(int i=0;i<n;i++){
			if(obstacleGrid[0][i]==1){
				flag=false;
				a[0][i]=0;
			}
			if(flag){
				a[0][i]=1;
			}else {
				a[0][i]=0;
			}
		}
		
		for(int i=1;i<m;i++){
			for(int j=1;j<n;j++){
				if(obstacleGrid[i][j]!=1){
					a[i][j]=a[i][j-1]+a[i-1][j];
				}else {
					a[i][j]=0;
				}
			}
		}
		
		return a[m-1][n-1];
	}
}
