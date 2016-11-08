package com.bupt.leetcode61_80;

import java.util.ArrayList;
import java.util.List;

public class L77 {

	/**
	 * @param args
	 */
	 List<List<Integer>> lists=new ArrayList<List<Integer>>();
	 int n=0;
	 int k=0;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	}

	public  List<List<Integer>> combine(int n, int k) {

		this.n=n;
		this.k=k;
		backTracking(new ArrayList<Integer>(),1);
		return lists;
	}

	private  void backTracking(ArrayList<Integer> cur, int from) {
		// TODO Auto-generated method stub
		if(cur.size()==k){
			List<Integer> list=new ArrayList<Integer>(cur);
			lists.add(list);
			return;
		}
		for(int i=from;i<=n;i++){
			cur.add(i);
			backTracking(cur, i+1);
			cur.remove(new Integer(i));
		}
	}
}
