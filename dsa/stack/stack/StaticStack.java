package stack;

public class StaticStack implements Stack{
	private int size;
	private Object[] stackArray;
	private int top;

	public StaticStack() {
		size = 10;
		top = -1;
		stackArray = new Object[size];
	}

	public StaticStack(int size) {
		this.size = size;
		top = -1;
		stackArray = new Object[size];
	}
	@Override
	public void push(Object val) throws Exception{
		if (!isFull()) {
			stackArray[++top] = val;
		//	System.out.println(val + " added to stack");
		} else {
			throw new Exception("Overflow!!") ;
		}

	}
	@Override
	public Object pop() throws Exception {
		if (!isEmpty())
			return stackArray[top--];
		else
			throw new Exception("Underflow");
	}
	@Override
	public boolean isEmpty() {
//		System.out.println("in is Empty" + getClass());

		if (top == -1)
			return true;
		else
			return false;
	}
	@Override
	public boolean isFull() {
//		System.out.println("in is full" + getClass());
		if (top < size - 1)
			return false;
		else
			return true;
	}

	public Object peek() {
		return stackArray[top];
	}



}
