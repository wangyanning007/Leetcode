package com.bupt.leetcode1_20;
import java.math.BigInteger;
import java.util.ArrayList;

public class L7 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// TODO Auto-generated method stub
		// ArrayList<Integer> array=new ArrayList<Integer>();
		// array.add(0, 1);
		// array.add(0, 2);
		// System.out.println(array);

		System.out.println(reverse(1534236469));
	}

	public static int reverse(int x) {
//	    int result=0;
//        boolean b=true;
//		ArrayList<Integer> array=new ArrayList<Integer>();
//		int flag=10;
//		if(x==0){
//			return result;
//		}
//		else if(x<0){
//			x=-x;
//			b=false;
//		}
//		while(x>0){
//			int y =x%flag;
//			array.add(0,y);
//			x=(x-y)/flag;
//		}
//		System.out.println(array);
//		int temp=1;
//		for (Integer z : array) {
//			result+=z*temp;
//			temp*=10;
//		}
//		return result=(b==true?result:-result);
		
		 long result = 0;
		 boolean b=true;
		 if(x==0){
		 return 0;
		 }
		 else if(x<0){
		 x=-x;
		 b=false;
		 }
		 while(x>0){
		 result =result*10+x%10;
		 x=(x-x%10)/10;
		 }
		 
		 if(result>Integer.MAX_VALUE||result<Integer.MIN_VALUE){
			 return 0;
		 }
		 return (int)(result=(b==true?result:-result));

	}

}
