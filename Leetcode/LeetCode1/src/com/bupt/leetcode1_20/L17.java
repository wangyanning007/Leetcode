package com.bupt.leetcode1_20;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class L17 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String string="234";
		
		System.out.println(letterCombinations(string));

	}

	public static List<String> letterCombinations(String digits) {
		List<String> arr1 = new ArrayList<String>();//×îºóÊä³ö
		List<String> arr2 =new ArrayList<String>();//»º´æ
		Map<String, String> map=new HashMap<String, String>();
		map.put("2","abc");map.put("3", "def");
		map.put("4", "ghi");map.put("5", "jkl");
		map.put("6", "mno");map.put("7", "pqrs");
		map.put("8", "tuv");map.put("9", "wxyz");
		int len=digits.length();
		int index=0;
		String str1="";
		String str2="";
		while(index<len){
			str1=""+digits.charAt(index);
			if(arr2.size()!=0){
				arr1.clear();
				for(int i=0;i<arr2.size();i++){
					for(int j=0;j<map.get(str1).length();j++){
						arr1.add(arr2.get(i)+map.get(str1).charAt(j));
					}
				}
				arr2.clear();
				for (String string : arr1) {
					arr2.add(string);
				}
			}else {
				for(int i=0;i<map.get(str1).length();i++){
					str2=""+map.get(str1).charAt(i);
					arr2.add(str2);
					arr1.add(str2);
				}
			}
			index++;
		}
		return arr1;

	}

}
