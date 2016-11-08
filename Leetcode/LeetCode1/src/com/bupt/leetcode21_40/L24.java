package com.bupt.leetcode21_40;

import javax.swing.plaf.multi.MultiButtonUI;

public class L24 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public ListNode swapPairs(ListNode head) {

		if(head==null||head.next==null) return head;
		
		ListNode p=head;
		head=head.next;
		ListNode q;
		
		while(p.next!=null){
			q=p.next;
			p.next=p.next.next;
			q.next=p;
			if(p.next==null||p.next.next==null){
				return head;
			}else {
				q=p.next;
				p.next=p.next.next;
				p=q;
			}
		}
		return head;
	}

}
