package StacksAndQueues;

public class Stack<E> {
	private final int size;
	private E[] elements;
	private int top = -1;

	public Stack(int size) {
		if (size > 0) {
			this.size = size;
		} else {
			this.size = 10;
		}
		elements = (E[]) new Object[size];
	}
	
	public void push(E elementValue) {
		if (top == size - 1) {
			throw new FullStackException(String.format("Stack is full cannot push %s", elementValue));
		} else {
			elements[++top] = elementValue;
		}
	}

	public E pop() {
		if (top == -1) {
			throw new EmptyStackException();
		} else {
			return elements[top--];
		}
	}

}

class FullStackException extends RuntimeException {
	public FullStackException() {
		this("Stack is Full");
	}

	public FullStackException(String exceptionText) {
		super(exceptionText);
	}
}

class EmptyStackException extends RuntimeException {
	public EmptyStackException() {
		this("Stack is empty ");
	}

	public EmptyStackException(String exceptionDescription) {
		super(exceptionDescription);
	}

}
