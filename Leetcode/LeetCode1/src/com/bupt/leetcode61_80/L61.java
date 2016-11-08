package com.bupt.leetcode61_80;

public class L61 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public ListNode rotateRight(ListNode head, int k) {

		if(head==null) return head;
		ListNode p=head;
		int n=0;
		while(p.next!=null){
			
			p=p.next;
			n++;
		}
		n++;
		k=k%n;
		p.next=head;
		ListNode q=head;
		for(int i=0;i<n-k-1;i++){
			q=q.next;
		}
		head=q.next;
		q.next=null;
		return head;
	}
}
