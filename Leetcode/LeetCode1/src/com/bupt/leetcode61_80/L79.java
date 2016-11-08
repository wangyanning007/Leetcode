package com.bupt.leetcode61_80;

import javax.security.auth.x500.X500Principal;

public class L79 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public boolean exist(char[][] board, String word) {

		int m=board.length;
		int n=board[0].length;
		boolean[][] visited=new boolean[m][n];
		for(int i=0;i<m;i++){
			for(int j=0;j<n;j++){
				if(dfs(board,visited,i,j,word,0))
					return true;
			}
		}
		return false;
	}

	 boolean dfs(char[][] board, boolean[][] visited, int i, int j,String word, int k) {
		// TODO Auto-generated method stub
		 if(k==word.length()) return true;
		 if(i<0||i>=board.length||j<0||j>=board[0].length) return false;
		 if(visited[i][j]) return false;
		 if(board[i][j]!=word.charAt(k)) return false;
		 
		 visited[i][j]=true;
		 if(dfs(board,visited,i-1,j,word,k+1)) return true;
		 if(dfs(board,visited,i+1,j,word,k+1)) return true;
		 if(dfs(board,visited,i,j-1,word,k+1)) return true;
		 if(dfs(board,visited,i,j+1,word,k+1)) return true;
		 visited[i][j]=false;
		 
		return false;
	}

}
