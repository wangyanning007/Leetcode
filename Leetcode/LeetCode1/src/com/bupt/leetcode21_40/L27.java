package com.bupt.leetcode21_40;
import java.util.Arrays;

public class L27 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A = new int[3];
		System.out.println(removeElement(A,1));

	}

	public static int removeElement(int[] A, int elem) {
		int count = 0;
		Arrays.sort(A);
		int len=A.length;
		for(int i=0;i<len;i++){
			System.out.println(A[i]);
		}
		return count;

	}

}
