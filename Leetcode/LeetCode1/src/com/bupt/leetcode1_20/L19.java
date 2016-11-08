package com.bupt.leetcode1_20;

public class L19 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public ListNode removeNthFromEnd(ListNode head, int n) {

		if(n==0) return head;
		ListNode p=head;
		ListNode q=head;
		while(n>1){
			q=q.next;
			n--;
		}
		while(q!=null){
			p=p.next;
			q=q.next;
		}
		q.next=q.next.next;
		return head;
	}

}
