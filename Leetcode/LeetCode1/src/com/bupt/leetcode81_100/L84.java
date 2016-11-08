package com.bupt.leetcode81_100;

import java.util.Stack;

public class L84 {

	/**
	 * @param args
	 *            ջ�ڴ洢���Ǹ߶ȵ������±ꡣ����ÿ��ֱ��ͼ�߶ȣ������������
	 *            1.��ǰջ�ջ��ߵ�ǰ�߶ȴ���ջ��С����ָʾ�ĸ߶�ʱ����ǰ�±���ջ
	 *            2.���򣬵�ǰջ����ջ������������±���ָʾ�ĸ߶ȼ������
	 *            Ϊʲôֻ��Ҫһ��ջ����Ϊ�ڶ������ʱ��forѭ����ѭ���±���ˣ�
	 *            Ҳ������һ��forѭ���Ƚϵ�ǰ�߶����µ�ջ���±���ָʾ�ĸ߶ȣ�ע���ʱ��ջ���Ѿ��ı�����֮ǰ�ó�ջ
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] height = { 3,1,3,2,2 };
		System.out.println(largestRectangleArea(height));
	}

	public static int largestRectangleArea(int[] height) {

		int area = 0;
		Stack<Integer> stack = new Stack<Integer>();
		for (int i = 0; i < height.length; i++) {
			if (stack.empty() || height[stack.peek()] < height[i]) {
				stack.push(i);
			} else {
				int start = stack.pop();
				int width = stack.empty() ? i : i - stack.peek() - 1;
				area = Math.max(area, height[start] * width);
				i--;
			}
		}
		while (!stack.empty()) {
			int start = stack.pop();
			int width = stack.empty() ? height.length : height.length
					- stack.peek() - 1;
			area = Math.max(area, height[start] * width);
		}
		return area;
	}
}
