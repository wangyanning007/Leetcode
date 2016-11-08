package com.bupt.leetcode81_100;

import java.util.ArrayList;
import java.util.List;

public class L89 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(grayCode(3));
	}

	public static List<Integer> grayCode(int n) {

		if(n==0){
			List<Integer> list=new ArrayList<Integer>();
			list.add(0);
			return list;
		}
		
		List<Integer> temp=grayCode(n-1);
		int head=1<<(n-1);
		ArrayList<Integer> list=new ArrayList<Integer>(temp);
		for(int i=temp.size()-1;i>=0;i--){
			list.add(head+temp.get(i));
		}
		return list;
	}

}
