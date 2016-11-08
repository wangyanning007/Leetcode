package com.bupt.leetcode1_20;
public class L4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A[] = {};
		// int B[] = null;
		int B[] = { 2, 3 };
		// System.out.println(B.length);
		// System.out.println(A.length);

		double y = findMedianSortedArrays(A, B);
		System.out.println(y);

	}

	public static double findMedianSortedArrays(int A[], int B[]) {
		double x = 0;

		int i = 0, j = 0;
		int k = 0;

		int m = A.length, n = B.length;
		int[] C = new int[m + n];
		while (i < m && j < n) {
			if (A[i] < B[j]) {
				C[k] = A[i];
				k++;
				i++;
			} else {
				C[k] = B[j];
				k++;
				j++;
			}
		}
		while (i < m) {
			C[k] = A[i];
			k++;
			i++;
		}
		while (j < n) {
			C[k] = B[j];
			k++;
			j++;
		}
		int flag = (m + n) / 2;
		if ((m + n) % 2 == 0) {
			x = (double)(C[flag - 1] + C[flag]) / 2;
		} else {
			x = (double)C[flag];
		}

		return x;

	}
}
