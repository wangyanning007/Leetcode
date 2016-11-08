package com.bupt.leetcode61_80;

public class L64 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] grid = { { 1, 2 }, { 5, 6 }, { 1, 1 } };
		System.out.println(minPathSum(grid));
	}

	public static int minPathSum(int[][] grid) {

		int m = grid.length;
		int n = grid[0].length;
		int[] ans = new int[n];
		ans[0] = grid[0][0];
		for (int i = 1; i < n; i++) {
			ans[i] = ans[i - 1] + grid[0][i];
		}

		for (int i = 1; i < m; i++) {
			ans[0] += grid[i][0];
			for (int j = 1; j < n; j++) {
				ans[j] = Math.min(ans[j - 1], ans[j]) + grid[i][j];
			}
		}

		return ans[n - 1];
	}
}
