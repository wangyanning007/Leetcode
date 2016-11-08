package com.bupt.leetcode41_60;

public class L48 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [][]matrix ={ {1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
		rotate(matrix);
		for(int i=0;i<4;i++){
			for(int j=0;j<4;j++){
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}
	}

	public static void rotate(int[][] matrix) {
		int n=matrix.length;//若n=4
		int count=(n-1)/2;//矩阵有几圈=count+1
		for(int i=0;i<=count;i++){//i=0,1
			for(int j=i;j<n-i-1;j++){//当i=0时，j=0,1,2   当i=1时，j=1
				int tmp=matrix[i][j];
				matrix[i][j]=matrix[n-j-1][i];
				matrix[n-j-1][i]=matrix[n-i-1][n-j-1];
				matrix[n-i-1][n-j-1]=matrix[j][n-i-1];
				matrix[j][n-i-1]=tmp;
			}
		}
	}
}
