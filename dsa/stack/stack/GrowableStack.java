package stack;

public class GrowableStack implements Stack {
	private int size;
	private Stack stack;

	public GrowableStack() {
		size = 10;
		stack = new StaticStack(size);// Create a static stack
	}

	public GrowableStack(int initVal) {
		size = initVal;
		stack = new StaticStack(size); // Create a static stack
	}

	// ------------------------------------------------------------------
	// Increase the size of stack by 2 times if size < 10000, by 1.5 times otherwise
	private Stack growStack() throws Exception {
		StaticStack tempStack = new StaticStack(this.size);
		// Make a copy(reversed)
		while (!stack.isEmpty()) {
			tempStack.push(stack.pop());
		}
		// Change the size of the stack
		if (size < 10000) {
			size *= 2;
		} else
			size *= 1.5;
		// Restore the stack
		stack = new StaticStack(size);
		while (!tempStack.isEmpty()) {
			stack.push(tempStack.pop());
		}
		return stack;
	}
	// --------------------------------------------------------------

	@Override
	public void push(Object val) throws Exception {
		if (!stack.isFull()) {
			stack.push(val);
		} else {
			stack = growStack();
			stack.push(val);
		}
	}

	@Override
	public Object pop() throws Exception {
		return stack.pop();
	}

	@Override
	public boolean isEmpty() {
		return stack.isEmpty();
	}

	@Override
	public boolean isFull() {
		return stack.isFull();
	}

	@Override
	public Object peek() {
		return stack.peek();
	}

	/*
	 * @Override public String toString() { System.out.println(getClass()); Stack
	 * tempStack = new StaticStack(this.size); try { while (!this.isEmpty()) {
	 * tempStack.push(this.pop()); } while (!this.isEmpty()) {
	 * System.out.print(this.pop()); } while (!tempStack.isEmpty()) {
	 * push(tempStack.pop()); } } catch (Exception e) { e.printStackTrace(); }
	 * return "" ; }
	 */

}
