//Implementation of circular queue using array

public class CircularQueue{
    private int front;
    private int rear;
    private int capacity;
    private int size;
    private int[] arr;
    // Constructor to initialize the queue
    public CircularQueue(int capacity) {
    this.capacity = capacity;
    this.arr = new int[capacity];
    this.front = 0;
    this.rear = -1;
    this.size = 0;
    }
    // Enqueue operation
    public void enqueue(int element) {
    if (isFull()) {
    System.out.println("Queue is full. Cannot insert "
   + element);
    return;
    }
    rear=(rear+1)%capacity;
    arr[rear] = element;
    size++;
    }
    // Dequeue operation
    public int dequeue() {
    if (isEmpty()) {
    System.out.println("Queue is empty. Cannot dequeue.");
    return -1;
    }
    int removed = arr[front];
    front=(front+1)%capacity;
    size--;
    return removed;
    }
    // Peek operation
    public int peek() {
    if (isEmpty()) {
    System.out.println("Queue is empty. No frontelement.");
    return -1;
    }
    return arr[front];
    }
    // Check if queue is empty
    public boolean isEmpty() {
    return size == 0;
    }
    // Check if queue is full
    public boolean isFull() {
    return size == capacity;
    }
    // Return current size
    public int size() {
    return size;
    }
    // Display elements
    public void display() {
    if (isEmpty()) {
    System.out.println("Queue is empty.");
    return;
    }
    System.out.print("Queue elements: ");
    for (int i = 0; i <size; i++) {
    int index= (front+i)%capacity;
    System.out.print(arr[index] + " ");
    }
    System.out.println();
    }
    // Main method to test
    public static void main(String[] args) {
    CircularQueue q = new CircularQueue(5);
    q.enqueue(10);
    q.enqueue(20);
    q.enqueue(30);
    q.display();
    q.dequeue();
    q.dequeue();
    q.display();
    q.enqueue(60);
    q.enqueue(80);
    q.enqueue(90);
    q.display();
   
    }
   }
   
