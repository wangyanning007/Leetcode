package com.bupt.leetcode261_280;

public class L263 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isUgly(8));
	}

	public static boolean isUgly(int num) {

		if(num<=0) return false;
		boolean flag=false;
		while(!flag)
		if(num%2==0){
			num/=2;
		}else if (num%3==0) {
			num/=3;
		}else if (num%5==0) {
			num/=5;
		}else if(num==1){
			flag=true;
		}else {
			break;
		}
		
		return flag;
	}
}
