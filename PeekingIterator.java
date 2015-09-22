package com.LeetCode;

import java.util.Iterator;

public class PeekingIterator implements Iterator<Integer> { 

	/**
	 * @param args
	 */
	Iterator<Integer> iterator;
	Integer next=null;
	public PeekingIterator(Iterator<Integer> iterator) {
	    // initialize any member here.
		this.iterator=iterator;
		if(iterator.hasNext()){
			next=iterator.next();
		}
	    
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		return next!=null;
	}

	@Override
	public Integer next() {
		// TODO Auto-generated method stub
		int temp=next;
		next = iterator.hasNext() ? iterator.next() : null;
		return temp;
	}
	
	 // Returns the next element in the iteration without advancing the iterator.
		public Integer peek() {
			
			return next;
	        
		}

	

}
