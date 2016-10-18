

import java.util.Stack;

public class Min_Stack {
	Stack<Integer> stack=new Stack<>();
	Stack<Integer> minStack=new Stack<>();
	 public void push(int x) {
	        stack.push(x);
	        if(minStack.isEmpty()){
	        	minStack.push(x);
	        	return;
	        }
	        if(x<=minStack.peek()){
	        	minStack.push(x);
	        }
	    }

	    public void pop() {
	        int x=stack.pop();
	        if(x==minStack.peek()){
	        	minStack.pop();
	        }
	    }

	    public int top() {
			return stack.peek();
	        
	    }

	    public int getMin() {
			return minStack.peek();
	        
	    }
}
