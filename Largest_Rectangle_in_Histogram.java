package com.LeetCode;

import java.util.Stack;

public class Largest_Rectangle_in_Histogram {
	public int largestRectangleArea(int[] height) {
		if (height.length < 1) {
			return 0;
		}
		Stack<Integer> stack = new Stack<Integer>();
		int max = 0;
		for (int i = 0; i < height.length; i++) {
			if (stack.empty() || height[stack.peek()] < height[i]) {
				stack.push(i);
			} else {
				int start = stack.pop();
				int width = stack.empty() ? i : i - stack.peek() - 1;
				max = Math.max(max, height[start] * width);
				i--;
			}
		}
		while (!stack.empty()) {
			int start = stack.pop();
			int width = stack.empty() ? height.length : height.length
					- stack.peek() - 1;
			max = Math.max(max, height[start] * width);
		}
		return max;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Largest_Rectangle_in_Histogram testHistogram = new Largest_Rectangle_in_Histogram();
		int[] A = { 5, 5, 1, 7, 1, 1, 5, 2, 7, 6 };
		System.out.println(testHistogram.largestRectangleArea(A));
	}

}
