package linked_ists;

public class SLinkedList<T> implements LinkedList<T>{
	// Create a static node class
	public static class Node<T>{
		private T data ;
		private Node next ;
		
		public Node (){
			next = null ;
		}
		public Node(T data) {
			this.data = data ;
		}
	}
	
	Node head ;
	// Create empty list
	public SLinkedList() {
		head = new Node() ;
	}
	// Create list with a single node
	public SLinkedList(T data) {
		head = new Node(data) ;
	}
	
	@Override
	public void display() {		
		if(head == null) {
			throw new RuntimeException("List is empty") ;
		}else {
			Node trav = head ;
			while(trav!=null) {
				System.out.println(trav.data);
				trav = trav.next ;
			}
		}
	}
	
	@Override
	public void addFirst(T data) {
		Node newNode = new Node(data) ;
		if(head==null) { // If list is empty 
			head = newNode ;
		}else {		// If list is not empty
			newNode.next = head ;
			head = head ;		
		}
	}
	
	@Override
	public void addLast(T data) {
		Node newNode = new Node(data) ;
		if(head == null) {
			head =  newNode ;
		}else {
			// Traverse to the last element
			Node trav = head ;
			while(trav.next != null) {
				trav = trav.next ;
			}
			// Add node at end
			trav.next = newNode ;
		}
		
	}
	
	@Override
	public void addAtPos(int pos, T data) {
		/*
		 * Doesn't allow to add after the last node
		 * Position starts from zero.
		 */		
		Node newNode = new Node(data) ;
		if(pos <0 ) {
			throw new RuntimeException("Position out of range") ;
		}
		else if(head == null || pos == 0) {
			newNode.next = head ;
			head = newNode ;
		}else {
			Node trav = head ;
			// Traverse to the position
			for(int cursor = 0; cursor<pos-1 ;cursor++) {
				if(trav.next == null) {
					throw new RuntimeException("Position out of range") ;
				}
				trav = trav.next  ;
			}
			newNode.next = trav.next ;
			trav.next = newNode ;
		}
			
	}
	
	@Override
	public void deleteAtFirst() {
		
		if(head == null) {
			throw new RuntimeException("Linked List is Empty") ;
		}else {		
			// If head is the only element, make it null, 
			//otherwise point the head to the next element
			head = (head.next==null)?null:head.next ;
		}
	}
	
	@Override
	public void deleteAtLast() {
		if(head==null) {
			throw new RuntimeException("Linked List is Empty") ;
		}else {
			Node trav = head ;
			// List has only one element
			if(head.next == null) {
				head = null;
			}else {
				while(trav.next.next!=null) {
					trav = trav.next ;
				}
				trav.next = null ;
			}
		}
	}
		
	@Override
	public void deleteAtPos(int pos) {
		if(head==null) {
			throw new RuntimeException("Linked List is Empty") ;
		}else {
			// List has only one element
			if(pos==0) {
				head = null;
			}else {
				Node trav = head ;
				for(int cursor = 0; cursor<pos-1 ;cursor++) {
					if(trav.next == null) {
						throw new RuntimeException("Position out of range") ;
					}
					trav = trav.next  ;
				}			
				trav.next = null ;
			}
		}
	}
	
	@Override
	public void deleteAll() {
		head = null ;		
	}
	

	
}

