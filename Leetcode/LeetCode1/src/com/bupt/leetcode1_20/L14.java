package com.bupt.leetcode1_20;

public class L14 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] strs={"wyn","wwy"};
		
		System.out.println(LongestCommonPrefix(strs));

	}
    public static String LongestCommonPrefix(String[] strs) {
    	String string="";
    	if(strs.length==0){
    		return string;
    	}else if(strs.length==1){
			return strs[0];
		}
    	int len_min=strs[0].length();
    	int index=0;
    	for (int i = 0; i < strs.length; i++) {
			if(strs[i].length()<len_min){
				len_min=strs[i].length();
				index=i;
			}
		}
    	for(int i=0;i<len_min;i++){
    		for(int j=0;j<strs.length;j++){
    			if(strs[index].charAt(i)!=strs[j].charAt(i)){
    				return string;
    			}
    		}
    		string+=strs[index].charAt(i);
    	}
		return string;
        
    }

}
