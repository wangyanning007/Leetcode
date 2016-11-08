package com.bupt.leetcode1_20;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class L18 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num[]={1,0,-1,0,-2,2};
		
		System.out.println(fourSum(num,0));

	}

	public static List<List<Integer>> fourSum(int[] num, int target) {
		int len=num.length;
		Arrays.sort(num);
		int s;
		List<List<Integer>> lists = new ArrayList<List<Integer>>();
		int begin,end;
		for(int i=0;i<len-3;i++){
			if(i>0&&num[i]==num[i-1])
				continue;
			for(int j=i+1;j<len-2;j++){
				if(j>i+1&&num[j]==num[j-1])
					continue;
				begin=j+1;
				end=len-1;
				
				
				while(begin<end){
					s=num[i]+num[j]+num[begin]+num[end];
					if(s==target){
						List<Integer> list=new ArrayList<Integer>();
						list.add(num[i]);
						list.add(num[j]);
						list.add(num[begin]);
						list.add(num[end]);
						lists.add(list);
						while(begin<end&&num[begin]==num[begin+1]){
							begin++;
						}
						while (begin<end&&num[end]==num[end-1]) {
							end--;
						}
						begin++;
						end--;
						
					}else if (s>target) {
						end--;
					}else {
						begin++;
					}
				}
			}
		}
		return lists;
	}

}
