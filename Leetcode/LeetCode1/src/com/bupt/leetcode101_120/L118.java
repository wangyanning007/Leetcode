package com.bupt.leetcode101_120;
import java.util.ArrayList;
import java.util.List;

public class L118 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(generate(5));
		
	}

	public static List<List<Integer>> generate(int numRows) {

		List<List<Integer>> lists=new ArrayList<List<Integer>>();
		
		for(int i=0;i<numRows;i++){
			List<Integer> list=new ArrayList<Integer>();
			if(i==0) list.add(1);
			else {
				for(int j=0;j<i+1;j++){
					if(j==0){
						list.add(0+lists.get(i-1).get(j));
					}else if(j>0&&j<i) {
						list.add(lists.get(i-1).get(j)+lists.get(i-1).get(j-1));
					}else {
						list.add(0+lists.get(i-1).get(j-1));
					}
				}
			}
			lists.add(list);
		}
		return lists;
	}

}
