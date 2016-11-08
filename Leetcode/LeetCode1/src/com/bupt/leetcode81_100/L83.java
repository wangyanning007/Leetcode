package com.bupt.leetcode81_100;

public class L83 {

	/**
	 * @param args
	 *            1->1->2->3->3 => 1->2->3
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public ListNode deleteDuplicates(ListNode head) {
		if (head == null || head.next == null)
			return head;
		ListNode listNode = head;
		while (listNode != null && listNode.next != null) {
			while (listNode.next != null && listNode.val == listNode.next.val) {
				listNode.next = listNode.next.next;

			}
			listNode = listNode.next;
		}

		return head;

	}

}
