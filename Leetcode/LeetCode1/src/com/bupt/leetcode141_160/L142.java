package com.bupt.leetcode141_160;

public class L142 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public ListNode detectCycle(ListNode head) {

		if (head == null)
			return null;

		boolean flag = false;
		ListNode l1 = head;// 走一步
		ListNode l2 = head;// 走两步

		while (l2.next != null && l2.next.next != null) {
			l1 = l1.next;
			l2 = l2.next.next;
			if (l1 == l2) {
				flag=true;
				break;
			}
		}
		
		if(flag){
			while(head!=l1){
				head=head.next;
				l1=l1.next;
			}
			return head;
		}
		return null;

	}

}
