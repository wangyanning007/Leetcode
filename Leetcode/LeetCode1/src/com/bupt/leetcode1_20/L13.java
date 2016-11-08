package com.bupt.leetcode1_20;
import java.util.HashMap;
import java.util.Map;

public class L13 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// String string="DCXXI";
		// System.out.println(string.substring(4, 5));
		System.out.println(romanToInt("IX"));

	}

	public static int romanToInt(String s) {

		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("I", 1);
		map.put("V", 5);
		map.put("X", 10);
		map.put("L", 50);
		map.put("C", 100);
		map.put("D", 500);
		map.put("M", 1000);
		int len = s.length();
		int sum = 0, j;
		int a = 0, b = 0;
		for (int i = 0; i < len; i++) {
			j = i + 1;
			a = map.get(s.charAt(i) + ""); 
			if (j < len && a < map.get(s.charAt(j) + "")) {

				sum += map.get(s.charAt(j) + "")- a;
				i = j;

			} else {
				sum += a;
			}
		}
		return sum;

		// int sum=0;
		// Map<String, Integer> map=new HashMap<String, Integer>();
		// map.put("I",1 );map.put("II",2 );map.put("III",3 );map.put("IV",4 );
		// map.put("V", 5);map.put("VI",6 );map.put("VII",7 );map.put("VIII",8
		// );
		// map.put("IX",9 );map.put("X",10 );map.put("XX",20 );map.put("XXX",30
		// );
		// map.put("XL",40 );map.put("L", 50);map.put("LX",60 );map.put("LXX",
		// 70);
		// map.put("LXXX",80 );map.put("XC",90 );map.put("C",100
		// );map.put("CC",200 );
		// map.put("CCC",300 );map.put("CD",400 );map.put(
		// "D",500);map.put("DC",600 );
		// map.put("DCC",700 );map.put("DCCC", 800);map.put("CM",900
		// );map.put("M",1000 );
		// map.put("MM",2000 );map.put("MMM",3000 );map.put("", 0);
		// int temp=0;
		// int i;
		// for (i = 0; i < s.length(); i++) {
		// if(map.get(s.substring(temp, i+1))==null){
		// sum+=map.get(s.substring(temp, i));
		// temp=i;
		// i--;
		// }
		// }
		// sum+=map.get(s.substring(temp, s.length()));
		// return sum;
	}

}
