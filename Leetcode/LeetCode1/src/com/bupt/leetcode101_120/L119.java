package com.bupt.leetcode101_120;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class L119 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.out.println(getRow(6));
	}

	public static List<Integer> getRow(int rowIndex) {
		List<Integer> list = new LinkedList<Integer>();
		list.add(1);
		if(rowIndex==0) return list;
		for(int i=1;i<=rowIndex;i++){
			for(int j=0;j<=i;j++){
				if(j==0){
					list.add(0+list.get(j));
				}else if(j>0&&j<i) {
					list.add(list.get(j)+list.get(j-1));
				}else {
					list.add(0+list.get(j-1));
				}
			}
			int m=i;
			while(m>0){
				list.remove(--m);
			}
		}
		return list;
	}
}
