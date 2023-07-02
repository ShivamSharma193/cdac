package tester;

import java.util.Scanner;

import linked_ists.LinkedList;
import linked_ists.SLinkedList;

public class SinglyLinkedListTester {

	public static void main(String[] args) {
		LinkedList<Integer> list = new SLinkedList<Integer>(1) ;
		list.addLast(2);
		list.addLast(3);
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
				default:
					break;
				}
			}

		}
			
	
	}

}
