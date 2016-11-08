package com.bupt.leetcode61_80;

public class L67 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String a = "110010";
		String b = "10111";
		
		System.out.println(addBinary(a, b));
	}

	public static String addBinary(String a, String b) {

		String string="";
		StringBuilder stringBuilder;
		int index=0;
		int len_a=a.length()-1;
		int len_b=b.length()-1;
		int minNum=Math.min(len_a, len_b);
		while(len_a>=0&&len_b>=0){
			if(a.charAt(len_a)=='0'&&b.charAt(len_b)=='0'){
				len_a--;
				len_b--;
				if(index==0){
					string="0"+string;
				}else {
					string="1"+string;
				}
				index=0;
			}else if (a.charAt(len_a)=='1'&&b.charAt(len_b)=='1') {
				len_a--;
				len_b--;
				if(index==0){
					string="0"+string;
				}else {
					string="1"+string;
				}
				index=1;
			}else {
				len_a--;
				len_b--;
				if(index==0){
					string="1"+string;
					index=0;
				}else {
					string="0"+string;
					index=1;
				}
			}
		}
		while(len_a>=0){
			if(index==0){
				string=a.substring(0, len_a+1)+string;
				break;
			}else {
				if(a.charAt(len_a--)=='1'){
					string="0"+string;
					index=1;
				}else {
					string="1"+string;
					index=0;
				}
			}
		}
		while(len_b>=0){
			if(index==0){
				string=b.substring(0, len_b+1)+string;
				break;
			}else {
				if(b.charAt(len_b--)=='1'){
					string="0"+string;
					index=1;
				}else {
					string="1"+string;
					index=0;
				}
			}
		}
		if(index==1)
			string="1"+string;
		return string;
	}
}
