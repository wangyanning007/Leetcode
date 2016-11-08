package com.bupt.leetcode61_80;

public class L72 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String word1 = "eeba";
		String word2 = "abca";
		System.out.println(minDistance(word1, word2));
		
	}

	public static int minDistance(String word1, String word2) {
		int row=word1.length()+1;
		int col=word2.length()+1;
		int [][]f=new int[row][col];
		
		for(int i=0;i<row;i++){
			f[i][0]=i;
		}
		for(int i=0;i<col;i++){
			f[0][i]=i;
		}
		
		for(int i=1;i<row;i++){
			for(int j=1;j<col;j++){
				if(word1.charAt(i-1)==word2.charAt(j-1))
					f[i][j]=f[i-1][j-1];
				else
					f[i][j]=f[i-1][j-1]+1;
				//f[i-1][j]+1表示删除     f[i][j-1]+1表示插入
				f[i][j]=Math.min(f[i][j], Math.min(f[i-1][j]+1, f[i][j-1]+1));
				System.out.println(f[i][j]);
			}
		}
		
		return f[row-1][col-1];
	}
}
