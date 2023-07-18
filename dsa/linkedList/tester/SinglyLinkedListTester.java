package tester;

import java.util.Scanner;

import linked_ists.CircularSinglyLinkedList;
import linked_ists.LinkedList;
import linked_ists.SLinkedList;

public class SinglyLinkedListTester {

	public static void main(String[] args) {
//		LinkedList<Integer> list = new SLinkedList<Integer>(1) ;
		LinkedList<Integer> list = new CircularSinglyLinkedList<Integer>();
		list.addLast(7);
		list.addLast(2);
		list.addLast(3);
		list.addLast(8);
		list.addLast(22);
		list.addLast(30);
		System.out.println(	"1. display  2. addFirst	3. addLast	4. addAtPos	\n"
				+ "5. deleteAtFirst	6. deleteAtLast	7. deleteAtPos	8. deleteAll" );
		boolean exit = false ;
		try (Scanner sc = new Scanner(System.in)){
			while (!exit) {
				switch (sc.nextInt()) {
				case 0:
					exit = true ;
					break;
				case 1 :
					list.display();
					break ;
				case 2 :
					list.addFirst(0);
					break ;
				case 3 :
					list.addLast(1000);
					break ;
				case 4 :
					list.addAtPos(2, 100);
					break ;
				case 5 :
					list.deleteAtFirst();
					break;
				case 6 :
					list.deleteAtLast();
					break ;
				case 7 :
					list.deleteAtPos(3);
					break ;
				case 8 :
					list.deleteAll();
					break ;
				}
			}

		}
			
	
	}

}
