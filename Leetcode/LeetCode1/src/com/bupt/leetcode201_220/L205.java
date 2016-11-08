package com.bupt.leetcode201_220;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public final class L205 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="foo";
		String t="baa";
		System.out.println(isIsomorphic(s, t));
	}

	public static boolean isIsomorphic(String s, String t) {
		Map<Character, Character> map=new HashMap<Character, Character>();
		Set<Character> set=new HashSet<Character>();
		
		for(int i=0;i<s.length();i++){
			char c1=s.charAt(i);
			char c2=t.charAt(i);
			
			if(map.containsKey(c1)){
				if(map.get(c1)!=c2) return false;
			}else {
				if(set.contains(c2)) return false;
				else {
					map.put(c1, c2);
					set.add(c2);
				}
			}
		}
		return true;
	}
}
