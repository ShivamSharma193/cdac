package generic_stack;

public interface Stack<T> {
	int STACK_SIZE = 4 ;
	
	public void push(T tObj) ;
	public T pop() ;
	boolean isFull() ;
	boolean isEmpty() ;
}
