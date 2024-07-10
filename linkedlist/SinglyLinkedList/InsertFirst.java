package linkedlist.SinglyLinkedList;

//Insert the element at first in Singly Linked list
public class InsertFirst {
    private Node head;
    private Node tail;
    private int size;

    public InsertFirst() {
        this.size = 0;
    }
    //Inserting at first
    public void InsertatFirst(int val) {
        Node node = new Node(val);
        node.next = head;
        head = node;

        if (tail == null) {
            tail = head;
        }
        size++;
    }

    //Inserting at last
    public void InsertatLast(int val) {
        if (tail == null) {
            InsertatFirst(val);
            return;
        }
        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size++;
    }
     //Inserting at 3rd position
    public void Insert(int val,int index){
        if(index==0){
            InsertatFirst(val);
            return;
        }
        if(index==size){
            InsertatLast(val);
            return;

        }
        Node temp=head;
        for (int i = 1; i < index; i++) {
            temp=temp.next;

        }
        Node node =new Node(val,temp.next);
        temp.next=node;
        size++;
    }

    //Deleting at First
    public int deletefirst(){
        int val=head.value;
        head=head.next;
        if(head==null){
            tail=null;
        }
        size--;
        return val;
    }


    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.print("End has been reach");
    }


    private class  Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;

        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }

    public static void main(String[] args) {
        InsertFirst ff = new InsertFirst();
        ff.InsertatFirst(3);
        ff.InsertatFirst(4);
        ff.InsertatFirst(5);
        ff.InsertatFirst(6);
        ff.InsertatLast(100);
        ff.Insert(7,3);
        ff.display();
        System.out.println("\nAfter Deleting at first element "+ff.deletefirst());
        ff.display();
    }
}
