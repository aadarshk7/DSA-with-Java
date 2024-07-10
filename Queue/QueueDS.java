package Queue;

import static Queue.QueueDS.Queue.*;

public class QueueDS {
    static class Queue {
        static int size; //size dina paryo
        static int rear = -1; //rear last ko -1 deko
        static int arr[]; // array value lasta ma declare garincha

        Queue(int n) {
            arr = new int[n];
            this.size = n;
        }

        public static boolean IsEmpty() {
            return rear == -1;
        }
        public void enque(int data) {
            if (rear == size - 1) {
                System.out.println("Queue is Full");
                return;
            }
            rear++;
            arr[rear] = data;
        }
    }



    //enqueue
    public static void enque(int data) {
        if (rear == size - 1) {
            System.out.println("Queue is Full");
            return;
        }
        rear++;
        arr[rear] = data;
    }

    public static int dequeue() {
        if (IsEmpty()) {
            System.out.println("Empty Queue");
            return -1;
        }
        int front = arr[0];
        for (int i = 0; i < rear; i++) {
            arr[i] = arr[i + 1];
        }
        rear-- ;
        return front;
    }

    public static int peek() {
        if (IsEmpty()) {
            System.out.println("Queue is full");
            return -1;

        }
        return arr[0];
    }

    public static void main(String[] args) {
        Queue q=new Queue(5);
        q.enque(1);
        q.enque(2);
        q.enque(3);
//        while(!q.IsEmpty()){
//            System.out.println(q.peek());
//            q.dequeue();
//        }
    }

}
