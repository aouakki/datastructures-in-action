package LinkedLists;

import static org.junit.Assert.*;

import org.junit.Test;

public class LinkedListTest {
	LinkedLists<Integer> list = new LinkedLists<Integer>(12);

	@Test
	public void testAddLast() {
		list.addLast(133);
		assertTrue(list.last() == 133);
	}

	@Test
	public void testAddFirst() {
		list.addFirst(144);
		assertTrue(list.first() == 144);
	}

	@Test
	public void testRemoveFirst() {
		LinkedLists<Integer> list1 = new LinkedLists<Integer>(12);
		list1.addLast(144);
		list1.removeFirst();
		System.out.println(list1.toString());
		assertTrue(list1.first() == 144);

	}

	@Test
	public void testSize() {
		LinkedLists<Integer> list1 = new LinkedLists<Integer>(12);
		list1.addLast(13);
		list1.addLast(39);
		list1.addLast(8);
		list1.addFirst(133);
		list1.addLast(144);
		assertTrue(list1.size() == 6);
	}
}
