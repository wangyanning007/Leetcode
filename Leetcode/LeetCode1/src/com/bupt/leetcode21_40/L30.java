package com.bupt.leetcode21_40;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.swing.JInternalFrame;

public class L30 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "aaa";
		String[] words = { "a","a" };
		
		System.out.println(findSubstring(s, words));

	}

	/*
	 * 第一方案，判断连续的字符截取是否在map里
	 * 第二方案，连续的字符截取是否在map里并且，map的字符串都被截取过
	 */
	public static List<Integer> findSubstring(String s, String[] words) {
		List<Integer> list = new ArrayList<Integer>();
		int len=words.length;
		int len_s=s.length();
		int len_word=words[0].length();
		
		System.out.println("len:"+len+" "+"len_s:"+len_s+" "+"len_word:"+len_word);
		Map<String, Integer> map=new HashMap<String, Integer>();
		for (int i = 0; i < len; i++) {
			if(map.containsKey(words[i])){
				map.put(words[i], map.get(words[i])+1);
			}else {
				map.put(words[i], 1);
			}
		}
		System.out.println(map);
		for(int i=0;i<=len_s-len*len_word;i++){
			int count=0;
			String string=s.substring(i, i+len_word);
			while(map.containsKey(string)&&map.get(string)>0){
				map.put(string, map.get(string)-1);
				i+=len_word;
				count++;
				System.out.println("i:"+i+" "+"count:"+count);
				if(count==len){
					list.add(i-len*len_word);
					i--;
					if((len_s-i-1)<len_word){
						break;
					}
				}
				if((len_s-i)<len_word){
					break;
				}
				string=s.substring(i, i+len_word);
			}
			if(count>0){
				map.clear();
				for (int j = 0; j < len; j++) {
					if(map.containsKey(words[j])){
						map.put(words[j], map.get(words[j])+1);
					}else {
						map.put(words[j], 1);
					}
				}
			}
		}
		return list;

	}

}
