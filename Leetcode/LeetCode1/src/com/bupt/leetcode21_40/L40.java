package com.bupt.leetcode21_40;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class L40 {

	/**
	 * @param args
	 */
	static List<List<Integer>> lists = new ArrayList<List<Integer>>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] candidates = { 10, 1, 2, 7, 6, 1, 5 };
		int target = 8;
		System.out.println(combinationSum2(candidates, target));
	}

	public static List<List<Integer>> combinationSum2(int[] candidates, int target) {
		Arrays.sort(candidates);
		backTrackeing(new ArrayList<Integer>(),candidates,0, target);
		return lists;
	}

	private static void backTrackeing(ArrayList<Integer> cur,
			int[] candidates, int from, int target) {
		// TODO Auto-generated method stub
		if(target==0){
			List<Integer> list=new ArrayList<Integer>(cur);
			if(!lists.contains(list)){
				lists.add(list);
			}
			
		}else {
			for(int i=from;i<candidates.length&&candidates[i]<=target;i++){
				cur.add(candidates[i]);
				backTrackeing(cur, candidates, i+1, target-candidates[i]);
				cur.remove(new Integer(candidates[i]));
			}
		}
	}
}
