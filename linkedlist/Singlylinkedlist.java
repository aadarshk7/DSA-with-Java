package linkedlist;
public class Singlylinkedlist {

	// Define a node class for the Linked List
	private static class Node {
		int data;
		Node next;
		Node(int data) {
			this.data = data;
			this.next = null;
		}
	}

	private Node head;

	// Insert data at the beginning of the Linked List
	public void insertAtBeginning(int data) {
		Node newNode = new Node(data);
		newNode.next = head;
		head = newNode;
	}

	// Print the Linked List
	public void printList() {
		Node curr = head;
		while (curr != null) {
			System.out.print(curr.data + " ");
			curr = curr.next;
		}
		System.out.println();
	}

	public static void main(String[] args) {
		Singlylinkedlist list = new Singlylinkedlist();

		// Insert elements at the beginning of the Linked List
		list.insertAtBeginning(3);
		list.insertAtBeginning(5);
		list.insertAtBeginning(7);

		// Print the Linked List
		System.out.print("Linked List: ");
		list.printList();
	}
}