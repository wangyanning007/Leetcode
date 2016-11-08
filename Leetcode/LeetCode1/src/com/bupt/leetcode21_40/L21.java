package com.bupt.leetcode21_40;

public class L21 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {

		if(l1==null) return l2;
		if(l2==null) return l1;
		
		ListNode head=new ListNode(0);
		ListNode p=head;
		while(l1!=null&&l2!=null){
			if(l1.val<=l2.val){
				p.next=l1;
				l1=l1.next;
			}else {
				p.next=l2;
				l2=l2.next;
			}
			p=p.next;
		}
		
		while(l1!=null){
			p.next=l1;
			l1=l1.next;
			p=p.next;
		}
		while(l2!=null){
			p.next=l2;
			l2=l2.next;
			p=p.next;
		}
		
		return head.next;
	}

}
