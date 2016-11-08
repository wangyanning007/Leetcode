package com.bupt.leetcode121_140;

import java.util.HashSet;
import java.util.Set;

public class L139 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="leetcode";
		Set<String> set=new HashSet<String>();
		set.add("leet");
		set.add("code");
		System.out.println(wordBreak(s, set));
	}

	public static boolean wordBreak(String s, Set<String> wordDict) {

		int n=s.length();
		boolean [] flag=new boolean[n+1];
		flag[0]=true;
		
		for(int i=1;i<=n;i++){
			for(int j=i-1;j>=0;j--){
				if(flag[j]&&wordDict.contains(s.substring(j, i))){
					flag[i]=true;
					break;
				}
			}
		}
		
		return flag[n];
	}

}
