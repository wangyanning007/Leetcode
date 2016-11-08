package com.bupt.leetcode1_20;


public class L6 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String string=convert("ABC", 1);
		System.out.println(string);

	}

	public static String convert(String s, int nRows) {
		
		String string="";
		int len=s.length();
		if(nRows==1||len<3){
			return s;
		}
		int index=nRows*2-2;
		for(int i=0;i<nRows;i++){
			int k=0;
			for(int j=i;j<len;j+=index){
				string+=s.charAt(j);
				int m=2*nRows-2-i+k;
				if(i>0&&i<nRows-1&&m<len){
					string+=s.charAt(m);
					k+=index;
				}
			}
		}
		return string;

	}

}
