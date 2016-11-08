package com.bupt.leetcode201_220;

import java.util.ArrayList;
import java.util.List;

public class L216 {

	/**
	 * @param args
	 */
	static List<List<Integer>> lists = new ArrayList<List<Integer>>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int k=3,n=7;
		System.out.println(combinationSum3(k,n));
	}

	public static List<List<Integer>> combinationSum3(int k, int n) {
		backTrackeing(new ArrayList<Integer>(),1,k,n);
		return lists;
	}

	private static void backTrackeing(ArrayList<Integer> cur, int m, int k,int target) {
		// TODO Auto-generated method stub
		if(target==0&&cur.size()==k){
			List<Integer> list=new ArrayList<Integer>(cur);
			lists.add(list);
		}else {
			for(int i=m;i<10&&i<=target;i++){
				cur.add(i);
				backTrackeing(cur, i+1, k, target-i);
				cur.remove(new Integer(i));
			}
		}
	}

}
