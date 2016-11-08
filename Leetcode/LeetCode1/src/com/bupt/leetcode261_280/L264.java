package com.bupt.leetcode261_280;

import java.util.TreeSet;

public class L264 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(nthUglyNumber(1407));
	}
	
	public static int nthUglyNumber(int n) {

		TreeSet<Long> treeSet=new TreeSet<Long>();
		treeSet.add((long)1);
		long result=treeSet.first();
		for(int i=0;i<n;i++){
			result=treeSet.first();
			treeSet.add(result*2);
			treeSet.add(result*3);
			treeSet.add(result*5);
			treeSet.remove(result);
		}
		
		System.out.println(treeSet);
		return (int)result;
		
	}

//	public static int nthUglyNumber(int n) {
//
//		int count = 0;
//		int num;
//		for (int i = 1;; i++) {
//			num=i;
//			if (count == n)
//				return i - 1;
//			boolean flag = false;
//			while (!flag)
//				if (num % 2 == 0) {
//					num /= 2;
//				} else if (num % 3 == 0) {
//					num /= 3;
//				} else if (num % 5 == 0) {
//					num /= 5;
//				} else if (num == 1) {
//					flag = true;
//					count++;
//				} else {
//					break;
//				}
//		}
//	}
}
