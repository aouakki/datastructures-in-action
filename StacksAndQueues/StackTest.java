package StacksAndQueues;

import static org.junit.Assert.*;

import org.junit.Test;

public class StackTest {

	@Test
	public void testIfStackIsEmpty() {
		Stack<Integer> stk = new Stack<>(10);
		try {
			stk.pop();
			fail("Should throw an exception when trying to pop from an emty stack ");
		} catch (EmptyStackException e) {
			System.out.println(e.getMessage() +" ->passed");
		}
	}

	@Test
	public void testIfStackIsFull() {
		Stack<Integer> stk = new Stack<>(1);
		stk.push(1);
		try {
			stk.push(2);
			fail("Should throw an exception when trying to push a value in a full stack");
		} catch (FullStackException e) {
			System.out.println(e.getMessage() +" ->passed" );
		}
	}

}
