package com.bupt.leetcode1_20;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class L15 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num = { -1, 0, 1, 2, -1, -4,5};
		System.out.println(threeSum(num));

	}

	public static List<List<Integer>> threeSum(int[] num) {

		int len = num.length;
		Arrays.sort(num);
		
		int target;
		int left, right ;
		int s;
		List<List<Integer>> lists = new ArrayList<List<Integer>>();
		for (int i = 0; i < len - 2; i++) {
			if(i>0&&num[i]==num[i-1]){
				continue;
			}
			target = num[i];
			left = i + 1;
			right=len-1;
			while (left < right) {
				s = target + num[left] + num[right];
				System.out.println("s:  "+s);
				System.out.println(left+"     "+right);
				if (s == 0) {
					List<Integer> list = new ArrayList<Integer>();
					list.add(target);
					list.add(num[left]);
					list.add(num[right]);
					
					lists.add(list);
					while (left < right && num[left] == num[left+1]) {
						left++;
					}
					while (left < right && num[right] == num[right - 1]) {
						right--;
					}
					left++;
					right--;
				} else if (s > 0) {
					right--;
				} else {
					left++;
				}
			}
		}

		return lists;
	}

}
