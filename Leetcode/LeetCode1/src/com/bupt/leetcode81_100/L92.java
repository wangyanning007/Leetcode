package com.bupt.leetcode81_100;

public class L92 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	}

	public ListNode reverseBetween(ListNode head, int m, int n) {

		if(head.next==null||m==n) return head;
		
		int count=0;
		ListNode head1=new ListNode(0);
		head1.next=head;
		ListNode l1=head1;
		int k=m-1;
		while(k-->0){
			l1=l1.next;
		}
		ListNode l2=l1.next;
		
		ListNode tmpHead=null;
		ListNode tmpNext=null;
		ListNode node=l1.next;
		
		k=n-m+1;
		while(k-->0){
			tmpHead=node;
			node=node.next;
			tmpHead.next=tmpNext;
			tmpNext=tmpHead;
		}
		
		l2.next=node;
		l1.next=tmpHead;
		
		return head1.next;
	}

}
