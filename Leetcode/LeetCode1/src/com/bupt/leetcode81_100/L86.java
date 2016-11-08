package com.bupt.leetcode81_100;

public class L86 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	
	//可以对原链表进行操作
	public ListNode partition(ListNode head, int x) {

		ListNode head1=new ListNode(0);
		ListNode l1=head1;
		ListNode root=new ListNode(0);
		root.next=head;
		ListNode pre=root;
		
		if(head==null||head.next==null)
			 return head;
		
		while(head!=null&&head.next!=null){
			if(head.val>x){
				l1.next=head;
				pre.next=head.next;
				head=pre.next;
				l1=l1.next;
				l1.next=null;
			}else {
				pre=head;
				head=head.next;
			}
		}
		if(head1!=null)
			head.next=head1;
		
		return head1.next;
		
	}
//	public ListNode partition(ListNode head, int x) {
//
//		ListNode head1=new ListNode(0);
//		ListNode l1=head1;
//		ListNode head2=new ListNode(0);
//		ListNode l2=head2;
//		
//		if(head==null||head.next==null)
//			 return head;
//		
//		while(head!=null){
//			if(head.val<x){
//				l1.next=head;
//				head=head.next;
//				l1=l1.next;
//				l1.next=null;
//			}else {
//				l2.next=head;
//				head=head.next;
//				l2=l2.next;
//				l2.next=null;
//			}
//		}
//		if(head2.next!=null){
//			l1.next=head2.next;
//		}
//		
//		return head1.next;
//		
//	}

}
