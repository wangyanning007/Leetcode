package com.bupt.leetcode261_280;
import java.util.Arrays;


public class L274 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int []array={3,0,6,1,5};
		int a=hIndex(array);
        System.out.println(a);
}

	private static int hIndex(int[] array) {
		// TODO Auto-generated method stub
		int h,maxh=-1;
		int len=array.length;
		int count=0;
		Arrays.sort(array);
		for(int i=0;i<len;i++){
			if(array[len-i-1]>=len-i){
				h=i+1;
				if(h>maxh)
					maxh=h;
			}
			
		}
		return maxh;
	}
}