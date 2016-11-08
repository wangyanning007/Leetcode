package com.bupt.leetcode1_20;
import javax.tools.Diagnostic;

public class L5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String string=longestPalindrome("aaaa");
		System.out.println(string);

	}

	public static String longestPalindrome(String s) {
		String string="";
		int len=s.length();
		int max=0;
		for(int i=0;i<len;i++){
			for(int j=0;i-j>=0&&i+j<len;j++){//求奇数回文
				
				if(s.charAt(i-j)!=s.charAt(i+j)){
					break;
				}
				if(max<j*2+1){
					max=j*2+1;
					string=s.substring(i-j, i+j+1);
				}
			}
			for(int j=0;i-j>=0&&i+j+1<len;j++){
				if(s.charAt(i-j)!=s.charAt(i+j+1)){
					break;
				}
				if(max<j*2+2){
					string=s.substring(i-j, i+j+2);
					max=j*2+2;
				}
				
			}
//			System.out.println("第"+i+"次输出："+ string+"    max:   "+max);
		}
		return string;
		
	}

	

}
