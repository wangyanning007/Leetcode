package com.bupt.leetcode1_20;
public class L9 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isPalindrome(-2147447412));
		System.out.println(2147447412);

	}

	public static boolean isPalindrome(int x) {
		String string="";
		boolean flag=true;
//		boolean b=true;
		if(x<0){
			return false;
		}
		while(x!=0){
			string+=x%10;
			x=x/10;
		}
//		System.out.println(string);
		int len=string.length();
		for(int i=0;i<len/2;i++){
			System.out.println(string.charAt(i)+"      "+string.charAt(len-i-1));
			if(string.charAt(i)!=string.charAt(len-i-1)){
				
				flag=false;
				break;
			}
		}
		return flag;

	}

}
