package com.bupt.leetcode21_40;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class L23 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode l = new ListNode(1);
		List<ListNode> lists = new ArrayList<ListNode>();
		lists.add(l);
		System.out.println(mergeKLists(lists));

	}

	public static ListNode mergeKLists(List<ListNode> lists) {
		int len=lists.size();
		if(len==0) return null;
		if(len==1) return lists.get(0);
		int mid=(len-1)/2;
		ListNode l1=mergeKLists(lists.subList(0, mid+1));
		ListNode l2=mergeKLists(lists.subList(mid+1, len));
		
		return mergeTwoLists(l1,l2);
	}
	public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {

		if(l1==null) return l2;
		if(l2==null) return l1;
		
		ListNode head=new ListNode(0);
		ListNode p=head;
		while(l1!=null&&l2!=null){
			if(l1.val<=l2.val){
				p.next=l1;
				l1=l1.next;
			}else {
				p.next=l2;
				l2=l2.next;
			}
			p=p.next;
		}
		
		while(l1!=null){
			p.next=l1;
			l1=l1.next;
			p=p.next;
		}
		while(l2!=null){
			p.next=l2;
			l2=l2.next;
			p=p.next;
		}
		
		return head.next;
	}

}
