package com.bupt.leetcode21_40;

public class L25 {

	/**
	 * 1->2->3->4->5
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ListNode l1=new ListNode(1);
		ListNode l2=new ListNode(2);
		l1.next=l2;
		l2.next=null;
		ListNode head=reverseKGroup(l1, 3);
		while(head!=null){
			System.out.println(head.val);
			head=head.next;
		}
	}
	public static ListNode reverseKGroup(ListNode head, int k) {
		
		if(head==null||head.next==null) return head;
		
		ListNode root=new ListNode(0);
		root.next=head;
		ListNode cur=head;
		ListNode tail=root;
		
		int count=0;
		ListNode tmp=null;
		ListNode ghead=null;
		ListNode gcur=null;
		ListNode gnxt=null;
		
		while(cur!=null){
			ghead=cur;
			gcur=cur.next;
			ghead.next=null;
			tmp=ghead;
			count=1;
			while(gcur!=null&&count!=k){
				count++;
				gnxt=gcur.next;
				gcur.next=ghead;
				ghead=gcur;
				gcur=gnxt;
			}
			
			if(count==k){
				tail.next=ghead;
			tail=tmp;
			
			}
			cur=gcur;
			
		}

		if(count!=k){
			gcur=ghead.next;
			ghead.next=null;
			
			gnxt=null;
			while(gcur!=null){
				gnxt=gcur.next;
				gcur.next=ghead;
				ghead=gcur;
				gcur=gnxt;
			}
			tail.next=ghead;
		}
		
		return root.next;
	}
}
