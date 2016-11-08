package com.bupt.leetcode61_80;
public class L74 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] mm = { { 1, 3, 5, 7 }, { 10, 11, 16, 20 }, { 23, 30, 34, 50 } };
		int target=3;
		
		System.out.println(searchMatrix(mm, target));
	}

	public static boolean searchMatrix(int[][] matrix, int target) {
		boolean flag=false;
		for(int i=0;i<matrix.length;i++){
			if(target>matrix[i][matrix[i].length-1]) continue;
			for(int j=0;j<matrix[i].length;j++){
				if(matrix[i][j]==target){
					flag=true;
					break;
				}
			}
			if(flag) break;
		}
		return flag;
	}
}
