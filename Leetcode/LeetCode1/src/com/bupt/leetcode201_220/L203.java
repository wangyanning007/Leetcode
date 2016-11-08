package com.bupt.leetcode201_220;

public class L203 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public ListNode removeElements(ListNode head, int val) {

		if(head==null) return head;
		 ListNode pre=new ListNode(0);
		 ListNode cur=pre;
		 pre.next=head;
		 while(cur!=null){
			 while(cur.next!=null&&cur.next.val==val){
				 cur.next=cur.next.next;
			 }
			 cur=cur.next;
		 }
		
		 return pre.next;
	}
}
