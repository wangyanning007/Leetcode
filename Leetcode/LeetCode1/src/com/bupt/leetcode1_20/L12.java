package com.bupt.leetcode1_20;
import java.util.HashMap;
import java.util.Map;

public class L12 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(intToRoman(3555));

	}

	public static String intToRoman(int num) {
		String str="";
		int [] digit=new int [4];
		Map<Integer, String> map=new HashMap<Integer, String>();
		map.put(1, "I");map.put(2, "II");map.put(3, "III");map.put(4, "IV");
		map.put(5, "V");map.put(6, "VI");map.put(7, "VII");map.put(8, "VIII");
		map.put(9, "IX");map.put(10, "X");map.put(20, "XX");map.put(30, "XXX");
		map.put(40, "XL");map.put(50, "L");map.put(60, "LX");map.put(70, "LXX");
		map.put(80, "LXX");map.put(90, "XC");map.put(100, "C");map.put(200, "CC");
		map.put(300, "CCC");map.put(400, "CD");map.put(500, "D");map.put(600, "DC");
		map.put(700, "DCC");map.put(800, "DCCC");map.put(900, "DM");map.put(1000, "M");
		map.put(2000, "MM");map.put(3000, "MMM");map.put(0, "");
		int flag=10;
		int i=0;
		while(flag<=10000){
			digit[i]=num%flag;
			System.out.println(digit[i]);
			num=num-digit[i];
			flag*=10;
			i++;
		}
		for (int j = 0; j <4; j++) {
			str=map.get(digit[j])+str;
		}
		return str;

	}

}
