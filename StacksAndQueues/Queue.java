package StacksAndQueues;

public class Queue<E> {
	private Node head, rear;
	int size ; 

	private class Node {
		E data;
		Node next;

		public Node() {
			next = null;
		}
	}

	public Queue() {
		this.head = new Node();
		this.rear = new Node();
		size = 0 ; 
	}

	private boolean isEmpty() {
		return size==0 ; 
	}

	public void enqueue(E value) {

		Node oldRear = rear;
		rear = new Node();
		rear.data = value;
		rear.next = null;

		if (isEmpty()) {
			head = rear;
		} else {
			oldRear.next = rear;
		}
		size++ ; 
	}

	public E dequeue() {
		if (isEmpty()) {
			throw new EmptyQueueException();
		} else {
			E data =  head.data;
			head = head.next;
			size-- ; 
			return data ; 
		}
	}

	public E peek() {
		return head.data;
	}

}

class EmptyQueueException extends RuntimeException {

	public EmptyQueueException() {
		super("Queue is empty cannot dequeue ");
	}
}
