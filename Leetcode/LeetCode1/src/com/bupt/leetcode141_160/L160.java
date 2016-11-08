package com.bupt.leetcode141_160;

public class L160 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

		ListNode h1=headA;
		ListNode h2=headB;
		boolean flag1=true;
		boolean flag2=true;
		while(headA!=null&&headB!=null){
			if(headA==headB) return headA;
			else {
				headA=headA.next;
				headB=headB.next;
			}
			if(headA==null&&flag1) {
				headA=h2;
				flag1=false;
			}
			if(headB==null&flag2) {
				headB=h1;
				flag2=false;
			}
		}
		return null;
	}
}
