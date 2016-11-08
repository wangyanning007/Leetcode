package com.bupt.leetcode61_80;

import java.util.HashMap;
import java.util.Map;

public class L76 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(minWindow("ab", "b"));
	}

	public static String minWindow(String s, String t) {

		int len_s=s.length();
		int len_t=t.length();
		Map<Character, Integer> map=new HashMap<Character, Integer>();
		Map<Character, Integer> fmap=new HashMap<Character, Integer>();
		for(int i=0;i<len_t;i++){
			char c=t.charAt(i);
			if(map.containsKey(c)){
				map.put(c, map.get(c)+1);
			}else {
				map.put(c, 1);
				fmap.put(c, 0);
			}
		}
		int ss=-1;
		int ee=len_s;
		int count=0;
		for(int end=0,start=0;end<len_s;end++){
			char c=s.charAt(end);
			if(map.containsKey(c)){
				fmap.put(c, fmap.get(c)+1);
				if(fmap.get(c)<=map.get(c))
					count++;
				
				if(count==len_t){
					char start_c=s.charAt(start);
					while(!fmap.containsKey(start_c)||fmap.get(start_c)>map.get(start_c)){
						if(fmap.containsKey(start_c)){
							fmap.put(start_c, fmap.get(start_c)-1);
						}
						
						start_c=s.charAt(++start);
					}
					
					if(end-start<ee-ss){
						ee=end;
						ss=start;
					}
				}
			}
		}
		return ss==-1?"":s.substring(ss, ee+1);
	}

}
