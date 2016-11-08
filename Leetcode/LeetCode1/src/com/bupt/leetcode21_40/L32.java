package com.bupt.leetcode21_40;

public class L32 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s=")()())";
		System.out.println(longestValidParentheses(s));
	}

	public static int longestValidParentheses(String s) {

		int len=0;
		int [] aa=new int[s.length()];
		for(int i=0;i<s.length();i++){
			if(s.charAt(i)=='(') aa[i]=0;
			else {
				int pre=i-1;
				while(pre>=0&&aa[pre]>0){
					pre-=aa[pre];
				}
				
				if(pre>=0&&s.charAt(pre)=='('){
					aa[i]=i-pre+1;
					if(pre>0){
						aa[i]+=aa[pre-1];
					}
				}
				
			}
			len=Math.max(len, aa[i]);
		}
		return len;
	}
}
