

import java.util.LinkedList;
import java.util.Queue;

public class Implement_Stack_using_Queues {
	Queue<Integer> queue = new LinkedList<>();

	// Push element x onto stack.
	public void push(int x) {
		queue.add(x);
		int size = queue.size();
		for (int i = 1; i < size; i++) {
			queue.add(queue.poll());
		}
	}

	// Removes the element on top of the stack.
	public void pop() {
		queue.poll();
	}

	// Get the top element.
	public int top() {
		return queue.peek();
	}

	// Return whether the stack is empty.
	public boolean empty() {
		return queue.isEmpty();
	}
}
