package com.bupt.leetcode1_20;
import java.util.HashMap;
import java.util.Map;


public class L1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=lengthOfLongestSubstring("abba");
		System.out.println(x);
	}

	 public static int lengthOfLongestSubstring(String s) {
		 Map<String,Integer> map=new HashMap<String,Integer>();
	        int len=s.length();
	        if(len<=1){
	            return len;
	        }
	        int begin=0,end=0;
	        int cur_length=0;
	        int max_length=0;
	        String str;
	        for(int i=0;i<len;i++){
	            str=s.charAt(i)+"";
//	            System.out.println(str);
	            if(map.get(str)!=null){
	                int temp=map.get(str);
	                for(int x=begin;x<=temp;x++){
	                    map.remove(s.charAt(x)+"");
	                }
	                System.out.println(map.entrySet());//Êä³ömap
	                begin=temp+1;
	                System.out.println(i+"               "+begin);
	                map.put(str,i);
	                
	            }
	            else{
	                map.put(str,i);
	            }
//	            System.out.println(str+"    "+i);
	            
	            end++;
//	            System.out.println(end+"  "+begin);
	            cur_length=end-begin;
	            if(cur_length>max_length){
	                max_length=cur_length;
	            }
	        }
	        return max_length;
//	        Map<String,Integer> map=new HashMap<String,Integer>();
//	        int len=s.length();
//	        if(len<=1){
//	            return len;
//	        }
//	        int begin=0,end=0;
//	        int cur_length=0;
//	        int max_length=0;
//	        String str;
//	        for(int i=0;i<len;i++){
//	            str=s.charAt(i)+"";
//	            if(map.get(str)!=null){
//	                Integer temp=map.get(str);
//	                map.remove(str);
//	                map.put(str,i);
//	                for(int j=i;j>=temp;j--){
//	                    if(!map.containsValue(j)){
//	                        begin=j+1;
//	                        break;
//	                    }
//	                }
//	            }
//	            else{
//	                map.put(str,i);
//	            }
//	            end=i;
//	            cur_length=end-begin+1;
//	            if(cur_length>max_length){
//	                max_length=cur_length;
//	            }
//	        }
//	        return max_length;
	    }
	
}
