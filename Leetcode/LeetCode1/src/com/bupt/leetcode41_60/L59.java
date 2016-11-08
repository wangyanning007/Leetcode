package com.bupt.leetcode41_60;

public class L59 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=3;
		int[][]matrix=generateMatrix(n);
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}
		
	}

	public static int[][] generateMatrix(int n) {
		int [][] matrix=new int[n][n];
		int num=1;
		int loop=(n+1)/2;
		int top=0,bottom=n-1,left=0,right=n-1;
		
		for(int i=0;i<loop;i++){
			
			for(int j=left;j<=right;j++){
				matrix[top][j]=num;
				num++;
			}
			top++;
			
			for(int j=top;j<=bottom;j++){
				matrix[j][right]=num;
				num++;
			}
			right--;
			
			for(int j=right;j>=left;j--){
				matrix[bottom][j]=num;
				num++;
			}
			bottom--;
			
			for(int j=bottom;j>=top;j--){
				matrix[j][left]=num;
				num++;
			}
			left++;
		}
		return matrix;
	}
}
