package main;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Queue1 {

	public static void main(String[] args) {

		Queue<Integer> queue = new LinkedList<Integer>();
		queue.add(1);
		queue.add(2);
		queue.add(3);
		queue.add(4);
		queue.add(5);
		
		System.out.println(queue.toString());
		System.out.println();
		queue = modifyQueue(queue,3);
		System.out.println("test");
		System.out.println(queue.toString());
	}
	
	public static Queue<Integer> modifyQueue(Queue<Integer> queue, int k)
    {
      //add code here.
       if (queue.isEmpty() == true || k > queue.size()) 
            return queue; 
        if (k <= 0) 
            return queue; 
  
        Stack<Integer> stack = new Stack<Integer>(); 
  
        // Push the first K elements into a Stack  
        for (int i = 0; i < k; i++) { 
            stack.push(queue.peek()); 
            queue.remove(); 
        } 
  
          
        // Enqueue the contents of stack at the back  
        // of the queue 
        while (!stack.empty()) { 
            queue.add(stack.peek()); 
            stack.pop(); 
        } 
  
          
        // Remove the remaining elements and enqueue  
        // them at the end of the Queue 
        for (int i = 0; i < queue.size() - k; i++) { 
            queue.add(queue.peek()); 
            queue.remove(); 
        } 
        return queue;
    }

}
