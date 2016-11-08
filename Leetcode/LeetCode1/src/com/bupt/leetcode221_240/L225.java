package com.bupt.leetcode221_240;

import java.util.LinkedList;
import java.util.Queue;

public class L225 {

	/**
	 * @param args
	 */
	Queue<Integer> q1=new LinkedList<Integer>();//代表一个栈
	Queue<Integer> q2=new LinkedList<Integer>();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	// Push element x onto stack.
    public void push(int x) {
        q1.offer(x);
    }

    // Removes the element on top of the stack.
    public void pop() {
        while(q1.size()>1) q2.offer(q1.poll());
        q1.poll();
        Queue<Integer> q=q1;
        q1=q2;
        q2=q;
    }

    // Get the top element.
    public int top() {
        while(q1.size()>1) q2.offer(q1.poll());
        int x=q1.poll();
        q2.offer(x);
        Queue<Integer> q=q1;
        q1=q2;
        q2=q;
        return x;
    }

    // Return whether the stack is empty.
    public boolean empty() {
        if(!q1.isEmpty()) return false;
        return true;
    }
}
