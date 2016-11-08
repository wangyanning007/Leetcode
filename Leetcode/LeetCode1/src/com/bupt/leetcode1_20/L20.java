package com.bupt.leetcode1_20;
import java.util.LinkedList;
import java.util.List;

public class L20 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="[])";
		
		System.out.println(isValid(s));

	}

	public static boolean isValid(String s) {
		boolean flag = true;
//		if(s.charAt(0)==')'||s.charAt(0)=='}'||s.charAt(0)==']'){
//			return false;
//		}
		int len=s.length();
		int cur_len;
		LinkedList<String> list=new LinkedList<String>();
		String str="";
		for (int i = 0; i <len; i++) {
			str=""+s.charAt(i);
			if(str.equals("(")||str.equals("[")||str.equals("{")){
				list.push(str);
			}else {
				cur_len=list.size();
				if(str.equals(")")&&(cur_len==0||!("(".equals(list.pop())))){
					return false;
				}else if (str.equals("]")&&(cur_len==0||!("[".equals(list.pop())))) {
					return false;
				}else if(str.equals("}")&&(cur_len==0||!("{".equals(list.pop())))){
					return false;
				}
			}
		}
		if (list.size()!=0) {
			return false;
		}
		return flag;

	}

}
