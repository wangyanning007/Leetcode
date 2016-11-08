package com.bupt.leetcode81_100;

import java.util.Stack;

public class L85 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[][] matrix = { { '0', '1' }, { '1', '0' } };
		System.out.println(maximalRectangle(matrix));

	}

	public static int maximalRectangle(char[][] matrix) {
		if(matrix.length==0)  return 0;

		 int rows=matrix.length;
		 int cols=matrix[0].length;
		 int [][] height=new int[rows][cols];
		 int maxA=0;
		 
		 for(int i=0;i<rows;i++){
			 for(int j=0;j<cols;j++){
				 height[i][j]=matrix[i][j]=='1'?1:0;
				 if(i!=0&&height[i][j]!=0){
					 height[i][j]=height[i-1][j]+1;
				 }
				 if(j==cols-1){
					 maxA=Math.max(maxA, maxArea(height[i]));
				 }
			 }
			 
		 }
		 
		 return maxA;
	}

	public static int maxArea(int[] height) {

		int area = 0;
		Stack<Integer> stack = new Stack<Integer>();
		for (int i = 0; i < height.length; i++) {
			if (stack.empty() || height[stack.peek()] < height[i]) {
				stack.push(i);
			} else {
				int start = stack.pop();
				int width = stack.empty() ? i : i - stack.peek() - 1;
				area = Math.max(area, height[start] * width);
				i--;
			}
		}
		while (!stack.empty()) {
			int start = stack.pop();
			int width = stack.empty() ? height.length : height.length
					- stack.peek() - 1;
			area = Math.max(area, height[start] * width);
		}
		return area;
	}
}
