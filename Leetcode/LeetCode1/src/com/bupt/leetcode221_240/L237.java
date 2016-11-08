package com.bupt.leetcode221_240;

public class L237 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public void deleteNode(ListNode node) {

		if(node==null) return ;
		node.val=node.next.val;
		node.next=node.next.next;
	}
}
