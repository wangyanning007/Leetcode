package com.bupt.leetcode121_140;

import java.util.ArrayList;
import java.util.List;

public class L131 {

	static List<List<String>> lists = new ArrayList<List<String>>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String string ="aab";
		System.out.println(partition(string));
	}

	public static List<List<String>> partition(String s) {

		if(s.length()==0) return lists;
		
		calString(new ArrayList<String>(),s);
		return lists;
	}

	private static void calString(ArrayList<String> cur, String s) {
		// TODO Auto-generated method stub
		if(s.length()==0) lists.add(new ArrayList<String>(cur));
		
		int len=s.length();
		
		for(int i=1;i<=len;i++){
			String subStr=s.substring(0, i);
			if(isPalindrome(subStr)){
				cur.add(subStr);
				String restStr=s.substring(i);
				calString(cur, restStr);
				cur.remove(cur.size()-1);
			}
		}
	}
	
	public static boolean isPalindrome(String str){
		int i=0;
		int j=str.length()-1;
		while(i<j){
			if(str.charAt(i)!=str.charAt(j))
				return false;
			
			i++;
			j--;
		}
		return true;
	}

}
