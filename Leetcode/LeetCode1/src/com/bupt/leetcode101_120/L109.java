package com.bupt.leetcode101_120;

public class L109 {

	/**
	 * @param args
	 */
	static ListNode curNode;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public TreeNode sortedListToBST(ListNode head) {

		if(head==null) return null;
		curNode=head;
		int len=0;
		while(head!=null){
			len++;
			head=head.next;
		}
		
		return creatTree(0,len-1);
	}

	private TreeNode creatTree(int start, int end) {
		// TODO Auto-generated method stub
		if(start>end){
			return null;
		}
		
		int mid=(start+end)/2;
		TreeNode leftNode=creatTree(start, mid-1);
		TreeNode root=new TreeNode(curNode.val);
		root.left=leftNode;
		curNode=curNode.next;
		TreeNode rightNode=creatTree(mid+1,end );
		root.right=rightNode;
		return null;
	}

}
