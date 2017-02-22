package LinkedLists;

import java.util.*;
import java.util.EmptyStackException;

public class LinkedLists<E> {

	private LinkedList<String> list = new LinkedList<>();
	private Node head, tail;
	private int size;

	class Node {
		E data;
		Node next;

		public Node(E data) {
			this.data = data;
			this.next = null;
		}
	}

	public LinkedLists(E data) {
		this.size = 0;
		Node nw = new Node(data);
		this.head = nw;
		this.tail = this.head;
		size++;
	}

	public LinkedLists() {
		size = 0;
		this.head = null;
		this.tail = null;
	}

	/**
	 * returns true if the list is empty, and false otherwise.
	 */
	public boolean isEmpty() {
		return head == null;
	}

	/**
	 * @return number of nodes in a single linkedList
	 */
	public int size() {
		return size;
	}

	/**
	 * 
	 * @return (but doesn't remove ) the first element in the linked list
	 */
	public E first() {
		if (head == null)
			return null;
		return this.head.data;
	}

	/**
	 * 
	 * @return (but doesn't remove ) the last element in a linked list
	 */
	public E last() {
		if (tail == null)
			return null;
		return this.tail.data;
	}

	/**
	 * Adds a new element to the front of the list
	 * 
	 * @param data
	 */

	public void addFirst(E data) {
		Node nw = new Node(data);
		nw.next = head;
		head = nw;
		size++;
	}

	/**
	 * adds an new node to the rear of the list
	 * 
	 * @param data
	 */
	public void addLast(E data) {
		Node nw = new Node(data);
		tail.next = nw;
		tail = nw;
		size++;
	}

	/**
	 * 
	 * delete & return the first element
	 */

	public E removeFirst() {
		if (head == null)
			throw new EmptyStackException();
		E data = head.data;
		head = head.next;
		size--;
		return data;
	}

	public String toString() {
		StringBuilder list = new StringBuilder();
		Node runner = head;
		list.append(head.data.toString());
		while (runner.next != null) {
			list.append("-->" + runner.next.data);
			runner = runner.next;
		}
		list.append("\nhead : " + head.data.toString() + "\n" + "tail : " + tail.data.toString() + "\nsize : " + size);

		return list.toString();
	}

}

/**
 * Exceptions
 */

class EmptyLinkedList extends RuntimeException {
	public EmptyLinkedList() {
		super("LinkedList is empty cannot get element");
	}
}
