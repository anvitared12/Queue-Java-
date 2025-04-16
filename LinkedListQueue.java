//Implementation of circular queue using linked list.

public class LinkedListQueue {
    // Node class to represent each element in the queue
    private static class Node {
    int data;
    Node next;
    Node(int data) {
    this.data = data;
    this.next = null;
    }
    }
    // Pointers to the front and rear of the queue
    private Node front;
    private Node rear;
    private int size;
    // Constructor
    public LinkedListQueue() {
    front = rear = null;
    size = 0;
    }
    // Add element at rear (enqueue)
    public void enqueue(int data) {
    Node newNode = new Node(data);
    if (rear == null) {
    front = rear = newNode;
    } else {
    rear.next = newNode;
    rear = newNode;
    }
    size++;
    }
    // Remove element from front (dequeue)
    public int dequeue() {
    if (isEmpty()) {
    System.out.println("Queue is empty. Cannot dequeue.");
    return -1;
    }
    int removed = front.data;
    front = front.next;
    if (front == null) {
    rear = null;
    }
    size--;
    return removed;
    }
    // Peek front element without removing
    public int peek() {
    if (isEmpty()) {
    System.out.println("Queue is empty.");
    return -1;
    }
    return front.data;
    }
    // Check if queue is empty
    public boolean isEmpty() {
    return front == null;
    }
    // Return current size
    public int size() {
    return size;
    }
    // Display all elements
    public void display() {
    if (isEmpty()) {
    System.out.println("Queue is empty.");
    return;
    }
    Node current = front;
    System.out.print("Queue elements: ");
    while (current != null) {
    System.out.print(current.data + " ");
    current = current.next;
    }
    System.out.println();
    }
    // Main method to test the queue
    public static void main(String[] args) {
    LinkedListQueue q = new LinkedListQueue();
    q.enqueue(10);
    q.enqueue(20);
    q.enqueue(30);
    q.display();
    System.out.println("Dequeued: " + q.dequeue());
    q.display();
    System.out.println("Front element: " + q.peek());
    System.out.println("Queue size: " + q.size());
    }
   }