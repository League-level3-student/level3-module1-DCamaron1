package Warm_Up;

import java.util.LinkedList;
import java.util.Queue;

public class QueueWarmUp {

	public static void main(String[] args) {
		Queue<String> candyQueue = new LinkedList<>();
		candyQueue.add("Jolly Ranchers");
		candyQueue.add("Kit Kat");
		System.out.println(candyQueue.peek());
		candyQueue.add("Snickers");
		System.out.println(candyQueue.peek());
		System.out.println(candyQueue.poll());
		System.out.println(candyQueue.peek());
		candyQueue.poll();
		System.out.println(candyQueue.peek());
	}
}
