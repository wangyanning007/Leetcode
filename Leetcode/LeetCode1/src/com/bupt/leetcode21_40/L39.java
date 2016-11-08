package com.bupt.leetcode21_40;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class L39 {

	/**
	 * @param args
	 */
	
	static List<List<Integer>> lists = new ArrayList<List<Integer>>();  
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] candidates={2,3,6,7};
		System.out.println(combinationSum(candidates,7));
	}
	
	 public static List<List<Integer>> combinationSum(int[] candidates, int target) {
	       Arrays.sort(candidates);
	       backTrackeing(new ArrayList<Integer>(),candidates,0, target);
	        return lists;
	    }

	private static void backTrackeing(ArrayList<Integer> cur,
			int[] candidates, int from, int target) {
		// TODO Auto-generated method stub
		if(target==0){
			List<Integer> list=new ArrayList<Integer>(cur);
			lists.add(list);
		}else {
			for(int i=from;i<candidates.length&&candidates[i]<=target;i++){
				cur.add(candidates[i]);
				backTrackeing(cur, candidates, i, target-candidates[i]);
				cur.remove(new Integer(candidates[i]));
			}
		}
	}

}
