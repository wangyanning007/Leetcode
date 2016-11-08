package com.bupt.leetcode21_40;
import java.util.ArrayList;
import java.util.List;


public class L26 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub=
		Integer[] A={1,1,2};
		int len=A.length;
        if(len==0||len==1){
            System.out.println(len); 
            return ;
        }
        int count=1;
        int cur=A[0];
         for(int i=1;i<len;i++){
           if(cur!=A[i]){
               A[count++]=A[i];
           }
           cur=A[i];
        }
         for (int i = 0; i < A.length; i++) {
			System.out.println(i+":"+A[i]);
		}
//         System.out.println(count);

	}

}
