package com.bupt.leetcode21_40;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class L36 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public boolean isValidSudoku(char[][] board) {
		List<Set<Character>> r=new ArrayList<Set<Character>>();
		List<Set<Character>> c=new ArrayList<Set<Character>>();
		List<Set<Character>> s=new ArrayList<Set<Character>>();
		int n=board.length;
		for(int i=0;i<n;i++){
			r.add(new HashSet<Character>());
			c.add(new HashSet<Character>());
			s.add(new HashSet<Character>());
		}
		
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				char ch=board[i][j];
				if(ch=='.') continue;
				else if (r.get(i).contains(ch)||c.get(j).contains(ch)||s.get(i/3*3+j/3).contains(ch)) {
					return false;
				}else {
					r.get(i).add(ch);
					c.get(j).add(ch);
					s.get(i/3*3+j/3).add(ch);
				}
			}
		}
		return true;
	}
}
