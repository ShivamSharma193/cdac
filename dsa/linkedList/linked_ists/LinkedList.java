package linked_ists;

public interface LinkedList<T> {
	void display() ;
	void addFirst(T data) ;
	void addLast(T data) ;
	void addAtPos(int pos, T data) ;
	void deleteAtFirst() ;
	void deleteAtLast() ;
	void deleteAtPos(int pos) ;
	void deleteAll() ;
}
