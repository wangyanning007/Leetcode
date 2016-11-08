package com.bupt.leetcode21_40;
import javax.swing.JWindow;


public class L28 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="ababcabcacbab";
		String t="abcac";
		
		System.out.println(matchStr(s,t,0));//���شӵڼ����ַ�ʼƥ��

	}

	private static void getNext(String tt, int next[]) {
		next[0]=0;
	    int i=0;
		int k=0;//��ͬǰ��׺����
		System.out.println(tt.charAt(0)+" : "+next[0]);
		for(i=1;i<next.length;i++){
			
			while(k>0&&tt.charAt(i)!=tt.charAt(k)){
				k=next[k-1];
			}
			if(tt.charAt(i)==tt.charAt(k)){
				k++;
			}
			next[i]=k;
			System.out.println(tt.charAt(i)+" : "+next[i]);
		}
		
	}
	
	private static void makeNext(String tt,int next[]){
		next[0]=0;
		int len=tt.length();
		int k=-1;
		int j=0;
		System.out.println(tt.charAt(0)+" : "+next[0]);
		while(j<len-1){
			if(k==-1||tt.charAt(j)==tt.charAt(k)){
				j++;
				k++;
				next[j]=k;
				System.out.println(tt.charAt(j)+" : "+next[j]);
			}else {
				k=next[k];
			}
		}
	}

	private static int matchStr(String s, String t, int pos) {
		// TODO Auto-generated method stub
		
		int len_s=s.length();
		int len_t=t.length();
		
		if(len_s<len_t)
			return -1;
		
		int [] next=new int [len_t];
		getNext(t,next);//kmp��next����
//		for (int i = 0; i < next.length; i++) {
//			System.out.println(next[i]);
//		}
		
		int i=pos,j=0;
		while(i<len_s&&j<len_t){
//			System.out.println(s.charAt(i)+" "+t.charAt(j));
			if(s.charAt(i)==t.charAt(j)){
				i++;
				j++;
			}else {
				if((len_s-i)<5)
					return -1;
//				i=i-j+1;
//				j=0;
				
				i+=j-next[j]+1;
				j=next[j];
			}
		}
		return i-j+1;
	}

}
