package stack;

public interface GenericStack<T> {
	public void push(T val) throws Exception ;
	public T pop() throws Exception ;
	public boolean isEmpty()  ;
	public boolean isFull() ;
	public T peek() ;
}
