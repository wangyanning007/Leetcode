package com.bupt.leetcode281_300;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class L299 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		String secret="1807",guess="7810";
//		String secret="1123", guess="0111";
//		String secret="1",guess="0";
//		String secret="11",guess="11";
		String secret="1122",guess="2211";
		System.out.println(getHint(secret, guess));
	}

	public static String getHint(String secret, String guess) {

		int countA=0;
		int countB=0;
		int [] num=new int [10];
		for(int i=0;i<secret.length();i++){
			if(secret.charAt(i)==guess.charAt(i)){
				countA++;
			}else {
				num[secret.charAt(i)-'0']++;
				if(num[secret.charAt(i)-'0']<=0)
					countB++;
				
				num[guess.charAt(i)-'0']--;
				if(num[guess.charAt(i)-'0']>=0)
					countB++;
			}
		}
		return countA+"A"+countB+"B";
	}

}
