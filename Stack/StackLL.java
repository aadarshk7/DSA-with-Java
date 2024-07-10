package Stack;

public class StackLL {
    StackNode root;

    static class StackNode {
        int data;
        StackNode next;

        StackNode(int data) {
            this.data = data;

        }

    }

    public boolean isEmpty() {
        if (root == null) {
            return true;
        } else
            return false;
    }

    public void push(int data) {
        StackNode newNode = new StackNode(data);
        if (root == null) {
            root = newNode;
        } else {
            StackNode temp = root;
            root = newNode;
            newNode.next = temp;
        }
        System.out.println(data + " Pushed a stack");
    }

    public int pop() {
        int popped = Integer.MIN_VALUE;
        if (root == null) {
            System.out.println("Stack is Empty");
        } else {
            popped = root.data;
            root = root.next;

        }
        return popped;
    }

    public int peek() {
        if (root == null) {
            System.out.println("Stack is Empty");
            return Integer.MIN_VALUE;
        } else {
            return root.data;
        }
    }

    public static void main(String[] args) {
        StackLL stack = new StackLL();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println(stack.pop() + " Popped from Stack");
        System.out.println("Top element is " + stack.peek());
    }

}
