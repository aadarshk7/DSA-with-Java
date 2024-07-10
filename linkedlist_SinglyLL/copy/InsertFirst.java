package linkedlist_SinglyLL.copy;

public class InsertFirst {
	private Node head;
	private Node tail;
	private int size;

	public InsertFirst() {
		int size = 0;
	}

	public void InsertatFirst(int val) {
		Node node = new Node(val);
		node.next = head;
		head = node;
		if (tail == null) {
			tail = head;
		}
		size++;
	}

	public void display() {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.value + " =>");
			temp = temp.next;
		}
		System.out.print("end");
	}

	private class Node {
		private int value;
		private Node next;

		public Node(int value) {
			this.value = value;
		}

		public Node(Node next) {
			this.next = next;
		}
	}

	public static void main(String[] args) {
		InsertFirst ff = new InsertFirst();
		ff.InsertatFirst(11);
		ff.InsertatFirst(21);
		ff.InsertatFirst(20);
		ff.InsertatFirst(1);
ff.display();
	}
}
