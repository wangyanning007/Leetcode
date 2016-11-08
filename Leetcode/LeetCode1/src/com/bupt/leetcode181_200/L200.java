package com.bupt.leetcode181_200;

public class L200 {

	/**
	 * @param args
	 */
	static int m = 0, n = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char[][] grid = { { '1', '1', '1', '1', '0' },
				{ '1', '1', '0', '1', '0' }, { '1', '1', '0', '0', '0' },
				{ '0', '0', '0', '0', '0' } };

		System.out.println(numIslands(grid));

	}

	public static int numIslands(char[][] grid) {

		m = grid.length;// row
		if(m==0) return 0;
		n = grid[0].length;// col
		if(n==0) return 0;

		int res = 0;
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if (grid[i][j] != '1')
					continue;

				res++;
				dfs(grid, i, j);
			}
		}
		return res;
	}

	private static void dfs(char[][] grid, int i, int j) {
		// TODO Auto-generated method stub
		if (i < 0 || i >= m || j < 0 || j >= n)
			return;

		if (grid[i][j] == '1') {
			grid[i][j] = '0';
			dfs(grid, i - 1, j);
			dfs(grid, i + 1, j);
			dfs(grid, i, j - 1);
			dfs(grid, i, j + 1);
		}

	}

}
