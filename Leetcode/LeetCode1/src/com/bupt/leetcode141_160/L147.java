package com.bupt.leetcode141_160;

public class L147 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ListNode node1=new ListNode(4);
		ListNode node2=new ListNode(2);
		ListNode node3=new ListNode(1);
		ListNode node4=new ListNode(3);
		node1.next=node2;
		node2.next=node3;
		node3.next=node4;
		ListNode node=insertionSortList(node1);
		
		while(node!=null){
			System.out.println(node.val);
			node=node.next;
			
		}
		
	}

	public static ListNode insertionSortList(ListNode head) {

		if(head==null||head.next==null) return head;
		
		ListNode node=new ListNode(0);
		node.next=head;
		ListNode pre=head;
		ListNode cur=pre.next;
		
		
		ListNode h=null;
		ListNode pre_h=node;
		while(cur!=null){
			if(pre.val<cur.val){
				pre=pre.next;
				cur=cur.next;
			}else {
				h=node.next;
				pre_h=node;
				while(h.val<cur.val&&h!=cur){
					h=h.next;
					pre_h=pre_h.next;
				}
				pre.next=cur.next;
				pre_h.next=cur;
				cur.next=h;
				cur=pre.next;
			}
		}
		
		return node.next;
	}
}
