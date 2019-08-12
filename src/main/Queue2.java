package main;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Queue2 {

	public static void main(String[] args) {

		Queue<Integer> queue = new LinkedList<Integer>();
		queue.add(1);
		queue.add(2);
		queue.add(3);
		queue.add(4);
		queue.add(5);

		System.out.println(queue.toString());
		System.out.println();
		queue = rev(queue);
		System.out.println("test");
		System.out.println(queue.toString());
	}

	public static Queue<Integer> rev(Queue<Integer> q) {
		// add code here.
		Stack<Integer> stack = new Stack<Integer>();

		int size = q.size();
		for(int i=0;i<size;i++) {
			stack.push(q.peek());
			q.remove();
		}
		
		q.clear();
		
		while(!stack.isEmpty()) {
			q.add(stack.peek());
			stack.pop();
		}
		
		return q;
	}

}
