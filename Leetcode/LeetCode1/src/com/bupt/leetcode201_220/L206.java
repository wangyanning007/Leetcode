package com.bupt.leetcode201_220;


public class L206 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public ListNode reverseList(ListNode head) {

		if(head==null||head.next==null) return head;
		ListNode pre=head;
		ListNode cur=head.next;
		pre.next=null;
		ListNode nxt=null;
		while(cur!=null){
			nxt=cur.next;
			cur.next=pre;
			pre=cur;
			cur=nxt;
		}
		return pre;
		
	}
}
