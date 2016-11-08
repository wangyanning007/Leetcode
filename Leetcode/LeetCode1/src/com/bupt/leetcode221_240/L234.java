package com.bupt.leetcode221_240;

public class L234 {

	/**
	 * 1.������ֳ�������
	 * 2.���ڶ�����������з�ת
	 * 3.����������бȽ�
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	 public boolean isPalindrome(ListNode head) {
	        if(head==null||head.next==null) return true;
	        
	        ListNode middle=partition(head);
	        ListNode head2=reverse(middle);
	        while(head2!=null){
	        	if(head.val!=head2.val) return false;
	        	
	        	head=head.next;
	        	head2=head2.next;
	        }
	        return true;
	    }
	 
	 
	//ȥ�����벿�֣�1->2->3->3->2->1 ȡ 3->2->1,1->2->3->2->1 ȡ 2->1
	private ListNode partition(ListNode head) {
		// TODO Auto-generated method stub
		ListNode p=head;
		while(p.next!=null&&p.next.next!=null){
			p=p.next.next;
			head=head.next;
		}
		p=head.next;
		head.next=null;
		return p;
	}
	
	//������ת
	private ListNode reverse(ListNode middle) {
		// TODO Auto-generated method stub
		ListNode pre=middle;
		ListNode cur=pre.next;
		ListNode nxt=null;
		pre.next=null;
		while(cur!=null){
			
			nxt=cur.next;
			cur.next=pre;
			pre=cur;
			cur=nxt;
		}
		return pre;
	}

}
