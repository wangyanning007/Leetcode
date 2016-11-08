package com.bupt.leetcode41_60;

import java.util.ArrayList;
import java.util.List;

public class L60 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		System.out.println(getPermutation(3, 4));
	}

	public static String getPermutation(int n, int k) {
		
		List<Integer> list=new ArrayList<Integer>();
		int s=1;
		String str="";
		for(int i=1;i<=n;i++){
			list.add(i);
			s*=i;
			
		}
		int a,b;
		k--;
		while(list.size()!=1){
			if(k==0) {
				for (Integer x : list) {
					str+=x;
				}
				return str;
			}
			a=k/Factorial(n-1);
			k=(k-Factorial(n-1)*a)%Factorial(n-1);
			str+=list.get(a);
			list.remove(a);
			n--;
			
		}

		str+=list.get(0);
		return str;
	}
	
	public static int Factorial(int n){
		if(n==1||n==0)
			return 1;
		else {
			return Factorial(n-1)*n;
		}
	}
}
