package com.bupt.leetcode41_60;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class L49 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String [] strs={"eat", "tea", "tan", "ate", "nat", "bat"};
		System.out.println(groupAnagrams(strs));
	}

	public static List<List<String>> groupAnagrams(String[] strs) {
		List<List<String>> lists=new ArrayList<List<String>>();
		Map<String, List<String>> map=new HashMap<String, List<String>>();
		for(int i=0;i<strs.length;i++){
			char []c=strs[i].toCharArray();
			Arrays.sort(c);
			String str=String.valueOf(c);
			if(!map.containsKey(str)){
				List<String> list=new ArrayList<String>();
				map.put(str, list);
			}
			map.get(str).add(strs[i]);
		}
		for(String key:map.keySet()){
			Collections.sort(map.get(key));
			lists.add(map.get(key));
		}
		return lists;
		
	}
}
