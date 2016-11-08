package com.bupt.leetcode81_100;

public class L82 {

	/**
	 * @param args
	 *            1->2->3->3->4->4->5 => 1->2->5
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public ListNode deleteDuplicates(ListNode head) {
		if (head == null || head.next == null)
			return head;
		ListNode pre = new ListNode(0);
		ListNode cur = pre;
		ListNode p = head;
		while (head != null) {
			while (head.next != null) {
				if (p.val == head.next.val) {
					head = head.next;
				} else {
					break;
				}
			}
			if (p == head) {
				cur.next = head;
				cur = cur.next;
			}
			p = head = head.next;
			cur.next = null;
		}
		return pre.next;
	}
}
