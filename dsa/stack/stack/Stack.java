package stack;

public interface Stack {
	public void push(Object val) throws Exception ;
	public Object pop() throws Exception ;
	public boolean isEmpty()  ;
	public boolean isFull() ;
	public Object peek() ;
}
