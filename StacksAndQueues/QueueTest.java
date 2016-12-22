package StacksAndQueues;

import static org.junit.Assert.*;

import org.junit.Test;

public class QueueTest {

	@Test
	public void testDequeue() {
		Queue<Integer> q = new Queue();
		q.enqueue(1);
		q.enqueue(2);
		q.enqueue(3);
		assertTrue(q.dequeue() == 1);
		assertTrue(q.dequeue() == 2);
		assertTrue(q.dequeue() == 3);
	}

}
