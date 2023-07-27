package linked_ists;

public class CircularSinglyLinkedList<T> implements LinkedList<T> {

	private static class Node<T> {
		private T data ;
		private Node next ;
		
		// Default constructor
		public Node() {	}
		
		// Constructor to initialize the data
		public Node(T data) {
			this.data = data ;
		}
		
		public Node(T data, Node<T> next) {
			this.data = data ;
			this.next = next ;
		}
	}
	
	Node<T> head ;
	
		
	@Override
	public void display() {
		if(head == null)
			throw new RuntimeException("List is empty") ;
		
		Node<T> trav = head ;
		do {
			System.out.print(trav.data + " ");			
			trav = trav.next ;	
		}while (trav != head); 
		
	}

	@Override
	public void addFirst(T data) {
		Node<T> node = new Node<T>(data,head) ;
		
		// List is empty
		if(head == null) {
			head = node ;
			node.next = head ;
		}// list is not empty
		else {	// Traverse to the last element
			Node<T> trav = head ;
			while(trav.next != head) {
				trav = trav.next ;
			}
			head = node ;
			trav.next = head ;
		}		
	}

	@Override
	public void addLast(T data) {
		Node<T> node = new Node<T>(data,head) ;
		
		// List is empty
		if(head == null) {
			head = node ;
			node.next = head ;
		}// List is not empty 
		else {
			Node<T> trav = head;  
			// Go to the last node
			while(trav.next != head) {
				trav = trav.next;
			}
			trav.next = node ;
		}
		
	}

	@Override
	public void addAtPos(int pos, T data) {
		Node<T> node = new Node<T>(data) ;
		// List is empty
		if(head == null) {
			head = node ;
			node.next = head ;
		}else { // List has elements
			Node<T> trav = head ;		
			for (int i = 0; i < pos-1; i++) {
				trav = trav.next ;
			}
			
			node.next = trav.next ;
			trav.next = node ;
		}
		
	}

	@Override
	public void deleteAtFirst() {
		if(head == null) {
			throw new RuntimeException("List is empty");		
		}else { 
			// List has single element 
			if(head.next == head)
				head = null ;
			else { // List has more than one element
				// traverse to the last node
				Node<T> trav = head ;
				while(trav.next != head) {
					trav = trav.next ;
				}
				// Change the reference
				head = head.next ;
				trav.next = head ;
			}
		}
	}

	@Override
	public void deleteAtLast() {
		if(head == null)
			throw new RuntimeException("List is empty") ;
		else {
			// If there is only a single element
			if(head.next == head)
				head = null ;
			else {// Traverse to the second last node
				Node<T> trav = head ;
				while(trav.next.next != head) {
					trav = trav.next ;
				}
				trav.next = head ; 
			}
		}
	}

	@Override
	public void deleteAtPos(int pos) {
		if(head == null) // Empty list
			throw new RuntimeException("List is empty") ;
		else if (pos == 0) // Remove at first
			deleteAtFirst();
		else { 			
			if(head.next == head)// List has a single element
				head = null ;
			else {// Traverse to the prev node of the pos
				Node<T> trav = head ;
				for(int i = 0; i < pos-1; i++) {
					trav = trav.next ;					
				}
				// Remove the node
				trav.next = trav.next.next ;				
			}

		}
	}

	@Override
	public void deleteAll() {
		head = null ;
	}

}
