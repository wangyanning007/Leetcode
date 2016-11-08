package com.bupt.leetcode221_240;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class L232 {

	/**
	 * @param args
	 */
	
	//两个栈同时构成队列
	Stack<Integer> s1=new Stack<Integer>();
	Stack<Integer> s2=new Stack<Integer>();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	// Push element x to the back of queue.
    public void push(int x) {
        s1.push(x);
    }

    // Removes the element from in front of queue.
    public void pop() {
        if(!s2.isEmpty()){
        	s2.pop();
        }else {
			while(!s1.isEmpty()){
				s2.push(s1.pop());
			}
			s2.pop();
		}
    }

    // Get the front element.
    public int peek() {
        if(s2.isEmpty()){
        	while(!s1.isEmpty()){
				s2.push(s1.pop());
			}
        }
        return s2.peek();
    }

    // Return whether the queue is empty.
    public boolean empty() {
        if(s1.isEmpty()&&s2.isEmpty()) return true;
        return false;
    }

}
