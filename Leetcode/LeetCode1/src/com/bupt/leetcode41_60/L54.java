package com.bupt.leetcode41_60;

import java.util.ArrayList;
import java.util.List;

public class L54 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public List<Integer> spiralOrder(int[][] matrix) {

		List<Integer> list=new ArrayList<Integer>();
		int m=matrix.length;
		if(m<1) return list;
		int n=matrix[0].length;
		int top=0,bottom=m-1,left=0,right=n-1;
		
		int loop=m<n?m:n;
		loop=(loop+1)/2;
		
		for(int i=0;i<loop;i++){
			for(int j=left;j<=right;j++){
				list.add(matrix[top][j]);
			}
			top++;
			if(top>bottom) return list;
			
			for(int j=top;j<=bottom;j++){
				list.add(matrix[j][right]);
			}
			right--;
			if(left>right) return list;
			
			for(int j=right;j>=left;j--){
				list.add(matrix[bottom][j]);
			}
			bottom--;
			if(top>bottom) return list;
			
			for(int j=bottom;j>=top;j--){
				list.add(matrix[j][left]);
			}
			left++;
		}
		return list;
	}
}
