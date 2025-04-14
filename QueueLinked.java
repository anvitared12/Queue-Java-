class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class MyQueue {
    Node front, rear;

    public MyQueue() {
        this.front = this.rear = null;
    }

    boolean isEmpty() {
        return front == null;
    }

    void enqueue(int data) {
        Node newNode = new Node(data);

        if (rear == null) {
            front = rear = newNode;
            System.out.println("Enqueued: " + data);
            return;
        }

        rear.next = newNode;
        rear = newNode;
        System.out.println("Enqueued: " + data);
    }

    int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty! Cannot dequeue.");
            return -1;
        }

        int value = front.data;
        front = front.next;

        if (front == null) {
            rear = null;
        }

        System.out.println("Dequeued: " + value);
        return value;
    }

    int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty! Nothing to peek.");
            return -1;
        }
        return front.data;
    }

    void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
            return;
        }

        Node temp = front;
        System.out.print("Queue elements: ");
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
}

public class QueueLinked {
    public static void main(String[] args) {
        MyQueue q = new MyQueue();

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);

        q.display();

        System.out.println("Peek: " + q.peek());

        q.dequeue();
        q.display();
    }
}
