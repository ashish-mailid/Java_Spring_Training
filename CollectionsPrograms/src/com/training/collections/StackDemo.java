package com.training.collections;

import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
	
		//Stack is LIFO
		
		Stack<Integer> stack = new Stack<>();
		stack.push(10); stack.push(15);stack.push(25);
		
		System.out.println(stack.peek());
		
		System.out.println(stack);
		
		System.out.println(stack.pop());
		
		System.out.println(stack);
		

	}

}
