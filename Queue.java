//Implementaion of Queue using Array

public class Queue {
    
        private int capacity;
        private int front;
        private int rear;
        private int size;
        private int[]arr;
        
    public Queue(int n){
        this.capacity=n;
        this.rear=-1;
        this.front=0;
        this.arr=new int[capacity];
        this.size=0;

    }

    //adding elements

    public void enque(int val){
        if(isFull()){
            System.out.println("Queue is full");
            return;
        }
        rear++;
        arr[rear]=val;
        size++;
    }

    //deleting elements

    public int deque(){
        if(isEmpty()){
            System.out.println("Queue is empty");
        }
        int val=arr[front];
        front++;
        return val;
    }

    //peek

    public int peek(){
        if(isEmpty()){
            System.out.println("Queue is empty");
            return -1;
        }
        return arr[front];

    }

    //display

    public void display(){
        if(isEmpty()){
            System.out.println("queue is empty");
            return;
        }
        System.out.println("elements are");
        for(int i=front;i<=rear;i++){
           System.out.println(arr[i]+" ");
        }
        System.out.println();
    }
    
    public boolean isEmpty(){
        return size==0;
    }
    public boolean isFull(){
        return size==capacity;
    }

    public static void main(String[]args){
        Queue q=new Queue(5);
        q.enque(10);
        q.enque(20);
        q.enque(30);
        q.enque(40);
        q.display();
        q.deque();
        q.deque();
        q.display();
        
    }
}