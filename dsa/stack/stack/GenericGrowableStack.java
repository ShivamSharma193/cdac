package stack;

public class GenericGrowableStack<T> implements GenericStack<T> {
	private int size;
	private Stack stack ;

	public GenericGrowableStack() {
		stack = new GrowableStack() ;
	}
	
	public GenericGrowableStack(int size) {
		stack = new GrowableStack(size) ; 
	}
	
	@Override
	public void push(T val) throws Exception {
			stack.push(val);
	}

	@Override
	public T pop() throws Exception {
		return (T)stack.pop();
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
	public T peek() {
		return (T)stack.peek();
	}



}
