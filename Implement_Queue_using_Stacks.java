

import java.util.Stack;

public class Implement_Queue_using_Stacks {
	Stack<Integer> in = new Stack<>();
	Stack<Integer> out = new Stack<>();

	public void push(int x) {
		in.push(x);
	}

	// Removes the element from in front of queue.
	public void pop() {
		if (out.isEmpty()) {
			while (!in.isEmpty()) {
				out.push(in.pop());
			}
		}
		out.pop();

	}

	// Get the front element.
	public int peek() {
		if (out.isEmpty()) {
			while (!in.isEmpty()) {
				out.push(in.pop());
			}
		}
		return out.peek();

	}

	// Return whether the queue is empty.
	public boolean empty() {
		return in.isEmpty() && out.isEmpty();

	}
}
